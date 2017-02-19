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

Download
--------

Note that this is using [Kotlin 1.1 RC](https://blog.jetbrains.com/kotlin/2017/02/kotlin-1-1-release-candidate-is-here/).

Add the following to the `build.gradle`:

```groovy
repositories {
    jcenter()
}
dependencies {
    compile 'me.eugeniomarletti:android-extras-delegates:1.0.2'
}
```
