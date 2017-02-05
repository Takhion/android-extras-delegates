@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent.base

import android.os.Bundle
import android.os.Parcelable
import me.eugeniomarletti.extras.intent.IntentExtra
import me.eugeniomarletti.extras.intent.IntentPropertyDelegate
import java.io.Serializable

inline fun IntentExtra.Serializable(name: String? = null) =
    Serializable({ it }, { it }, name)

inline fun IntentExtra.Serializable(defaultValue: Serializable, name: String? = null) =
    Serializable({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Bundle(name: String? = null) =
    Bundle({ it }, { it }, name)

inline fun IntentExtra.Bundle(defaultValue: Bundle, name: String? = null) =
    Bundle({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.CharSequence(name: String? = null) =
    CharSequence({ it }, { it }, name)

inline fun IntentExtra.CharSequence(defaultValue: CharSequence, name: String? = null) =
    CharSequence({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.String(name: String? = null) =
    String({ it }, { it }, name)

inline fun IntentExtra.String(defaultValue: String, name: String? = null) =
    String({ it ?: defaultValue }, { it }, name)

inline fun <T : Parcelable>
    IntentExtra.Parcelable(name: String? = null): IntentPropertyDelegate<T?> =
    Parcelable<T?, T>({ it }, { it }, name)

inline fun <T : Parcelable>
    IntentExtra.Parcelable(defaultValue: T, name: String? = null): IntentPropertyDelegate<T?> =
    Parcelable<T?, T>({ it ?: defaultValue }, { it }, name)
