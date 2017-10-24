@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras

import android.annotation.TargetApi
import android.app.Fragment
import android.content.Context
import android.os.Build
import android.os.Bundle
import kotlin.reflect.KClass

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
abstract class SimpleFragmentCompanion(kclass: KClass<out Fragment>) {

    @PublishedApi internal val javaClass = kclass.java

    inline fun <reified F : Fragment> instantiate(context: Context): F = Fragment.instantiate(context, javaClass.name) as F
}

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
abstract class FragmentCompanion<out BundleOptions>(
        @PublishedApi internal val bundleOptions: BundleOptions,
        kclass: KClass<out Fragment>
) : SimpleFragmentCompanion(kclass) {

    inline fun <reified F : Fragment> instantiate(context: Context, configure: BundleOptions.(Bundle) -> Unit): F {
        return instantiate<F>(context).apply {
            arguments = Bundle().apply { configure(bundleOptions, this) }
        }
    }

    inline fun <T> Bundle.options(block: BundleOptions.(Bundle) -> T): T =
            block(bundleOptions, this)
}

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
abstract class SelfFragmentCompanion<out BundleOptions>(
        kclass: KClass<out Fragment>
) : SimpleFragmentCompanion(kclass) {

    @Suppress("UNCHECKED_CAST")
    inline fun <reified F : Fragment> instantiate(context: Context, configure: BundleOptions.(Bundle) -> Unit): F {
        return instantiate<F>(context).apply {
            arguments = Bundle().apply { configure(this@SelfFragmentCompanion as BundleOptions, this) }
        }
    }
}


