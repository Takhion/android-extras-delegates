Android Extras Delegates
========================

Contains a collection of Kotlin property delegates to manage Android `Intent` and `Bundle` extras.

See [this article](https://medium.com/@workingkills/you-wont-believe-this-one-weird-trick-to-handle-android-intent-extras-with-kotlin-845ecf09e0e9) for more information.

Usage
-----

Create an `object` (anywhere, although by convention it's inside an `Activity`) and declare inside it some delegated extension properties over `Intent` or `Bundle` (all types are supported):

```kotlin
package com.example

class SomeActivity : Activity() {

    object IntentOptions {
        var Intent.someExtra by IntentExtra.String()
    }
}
```

`IntentExtra` and `BundleExtra` are two empty `object` which serve as containers for all delegates.

If not specified, the name of the extra will be the fully qualified name of the containing class, followed by the property name (in the example: `"com.example.SomeActivity.IntentOptions::someExtra"`).
It is also possible to specify a custom prefix instead of the fully qualified name of the class, which is useful when creating nested delegates (see below).

If a default value is not specified, the returning type will be nullable.

To use a delegate, you need to bring the container in which it's defined in the current scope, like so:

```kotlin
fun test(intent: Intent) {
    with(SomeActivity.IntentOptions) {
        val someExtraValue = intent.someExtra
        intent.someExtra = "hello"
    }
}
```

Activity Companion
------------------

Optionally, you can use the provided [`ActivityCompanion`](https://github.com/Takhion/android-extras-delegates/blob/master/library/src/main/java/me/eugeniomarletti/extras/ActivityCompanion.kt#L21-L35) (or [`SimpleActivityCompanion`](/library/src/main/java/me/eugeniomarletti/extras/ActivityCompanion.kt#L10-L19) if you don't have any "intent options") to aid in creating intents for an `Activity`:

```kotlin
class SomeActivity : Activity() {

    companion object : ActivityCompanion<IntentOptions>(IntentOptions, SomeActivity::class)

    object IntentOptions {
        var Intent.someExtra by IntentExtra.String()
    }

    fun test() {
        val someExtraValue = intent.options { it.someExtra }
    }
}

fun test(context: Context) {
    SomeActivity.start(context) {
        it.someExtra = "hello"
    }
    // or
    val someActivityIntent = SomeActivity.intent(context) {
        it.someExtra = "hello"
    }
}
```

Custom types
------------

Creating your own delegates is simple, as all building blocks are already provided.

For example to create a [`LocalDate`](http://joda-time.sourceforge.net/apidocs/org/joda/time/LocalDate.html) (from [Joda-Time](http://www.joda.org/joda-time)), persisted as a `String` in an `Intent`:

```kotlin
import me.eugeniomarletti.extras.intent.IntentExtra
import me.eugeniomarletti.extras.intent.base.String
import org.joda.time.LocalDate

fun IntentExtra.LocalDate(name: String? = null, customPrefix: String? = null) =
    String(
        reader = { it?.let(LocalDate::parse) },
        writer = { it?.toString() },
        name = name,
        customPrefix = customPrefix)
```

Or in a `Bundle`:

```kotlin
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.base.String
import org.joda.time.LocalDate

fun BundleExtra.LocalDate(name: String? = null, customPrefix: String? = null) =
    String(
        reader = { it?.let(LocalDate::parse) },
        writer = { it?.toString() },
        name = name,
        customPrefix = customPrefix)
```

The `reader` takes the persisted value in and outputs the custom type, while the `writer` does the opposite.

By defining the custom extensions on `IntentExtra`/`BundleExtra`, they will show up together with the basic types in the IDE autocomplete.

Nested types
------------

There are cases when a type is composed of multiple simpler types, like the following example:

```kotlin
data class User(val id: Long, val email: String, val birthDay: LocalDate)
```

It's possible to compose multiple delegates to create a single "super delegate" that can read/write such a type:

```kotlin
import android.content.Intent
import me.eugeniomarletti.extras.DelegateProvider
import me.eugeniomarletti.extras.defaultDelegateName
import me.eugeniomarletti.extras.intent.IntentExtra
import me.eugeniomarletti.extras.intent.base.Long
import me.eugeniomarletti.extras.intent.base.String
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun IntentExtra.User(
    idName: String? = null,
    emailName: String? = null,
    birthdayName: String? = null,
    customPrefix: String? = null)
    =
    object : DelegateProvider<ReadWriteProperty<Intent, User?>> {

        override fun provideDelegate(thisRef: Any?, property: KProperty<*>) =

            object : ReadWriteProperty<Intent, User?> {

                private val namePrefix = property.defaultDelegateName(customPrefix)

                private var Intent.id by IntentExtra.Long(name = idName, customPrefix = namePrefix)
                private var Intent.email by IntentExtra.String(name = emailName, customPrefix = namePrefix)
                private var Intent.birthday by IntentExtra.LocalDate(name = birthdayName, customPrefix = namePrefix)

                override operator fun getValue(thisRef: Intent, property: KProperty<*>): User? {
                    val id = thisRef.id ?: return null
                    val email = thisRef.email ?: return null
                    val birthday = thisRef.birthday ?: return null
                    return User(id, email, birthday)
                }

                override operator fun setValue(thisRef: Intent, property: KProperty<*>, value: User?) {
                    thisRef.id = value?.id
                    thisRef.email = value?.email
                    thisRef.birthday = value?.birthDay
                }
            }
    }
```

An example usage could be:

```kotlin
package com.example

object IntentOptions {
    var Intent.currentUser by IntentExtra.User()
}
```

This will read/write 3 extras:

* `com.example.IntentOptions::currentUser::id` with type `Long`
* `com.example.IntentOptions::currentUser::email` with type `String`
* `com.example.IntentOptions::currentUser::birthday` with type `LocalDate`

Note that this is made possible by passing a custom prefix for the nested property names, which is going to be the default delegate name for the "super delegate" (in this case `com.example.IntentOptions::user`).

The extra names can also be specified explicitly if necessary.

Download
--------

Note that this is using **Kotlin 1.1**.

Add the following to the `build.gradle`:

```groovy
repositories {
    jcenter()
}
dependencies {
    compile 'me.eugeniomarletti:android-extras-delegates:1.0.4'
}
```
