@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.bundle.base

import android.os.Bundle
import android.os.Parcelable
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.BundlePropertyDelegate
import java.io.Serializable

inline fun BundleExtra.Serializable(name: String? = null) =
    Serializable({ it }, { it }, name)

inline fun BundleExtra.Serializable(defaultValue: Serializable, name: String? = null) =
    Serializable({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Bundle(name: String? = null) =
    Bundle({ it }, { it }, name)

inline fun BundleExtra.Bundle(defaultValue: Bundle, name: String? = null) =
    Bundle({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.CharSequence(name: String? = null) =
    CharSequence({ it }, { it }, name)

inline fun BundleExtra.CharSequence(defaultValue: CharSequence, name: String? = null) =
    CharSequence({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.String(name: String? = null) =
    String({ it }, { it }, name)

inline fun BundleExtra.String(defaultValue: String, name: String? = null) =
    String({ it ?: defaultValue }, { it }, name)

inline fun <T : Parcelable>
    BundleExtra.Parcelable(name: String? = null): BundlePropertyDelegate<T?> =
    Parcelable<T?, T>({ it }, { it }, name)

inline fun <T : Parcelable>
    BundleExtra.Parcelable(defaultValue: T, name: String? = null): BundlePropertyDelegate<T?> =
    Parcelable<T?, T>({ it ?: defaultValue }, { it }, name)
