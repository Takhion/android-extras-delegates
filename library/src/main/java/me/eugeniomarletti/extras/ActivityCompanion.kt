@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras

import android.app.Activity
import android.content.Context
import android.content.Intent
import kotlin.reflect.KClass

abstract class SimpleActivityCompanion(kclass: KClass<out Activity>) {

    @PublishedApi internal val javaClass = kclass.java

    inline fun intent(context: Context) = Intent(context, javaClass)

    inline fun start(context: Context) {
        context.startActivity(intent(context))
    }
}

abstract class ActivityCompanion<out IntentOptions>(
    @PublishedApi internal val intentOptions: IntentOptions,
    kclass: KClass<out Activity>
) : SimpleActivityCompanion(kclass) {

    inline fun intent(context: Context, configure: IntentOptions.(Intent) -> Unit): Intent =
        intent(context).apply { configure(intentOptions, this) }

    inline fun start(context: Context, configure: IntentOptions.(Intent) -> Unit) {
        context.startActivity(intent(context, configure))
    }

    inline fun <T> Intent.options(block: IntentOptions.(Intent) -> T): T =
        block(intentOptions, this)
}

abstract class SelfActivityCompanion<out IntentOptions>(
        kclass: KClass<out Activity>
) : SimpleActivityCompanion(kclass) {

    @Suppress("UNCHECKED_CAST")
    inline fun intent(context: Context, configure: IntentOptions.(Intent) -> Unit): Intent =
            intent(context).apply { configure(this as IntentOptions, this) }

    inline fun start(context: Context, configure: IntentOptions.(Intent) -> Unit) {
        context.startActivity(intent(context, configure))
    }
}
