@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent.base

import android.os.Bundle
import android.os.Parcelable
import me.eugeniomarletti.extras.intent.IntentExtra
import me.eugeniomarletti.extras.intent.IntentPropertyDelegate
import java.io.Serializable

inline fun IntentExtra.Bundle(name: String? = null, customPrefix: String? = null) =
    Bundle({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Bundle(defaultValue: Bundle, name: String? = null, customPrefix: String? = null) =
    Bundle({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.CharSequence(name: String? = null, customPrefix: String? = null) =
    CharSequence({ it }, { it }, name, customPrefix)

inline fun IntentExtra.CharSequence(defaultValue: CharSequence, name: String? = null, customPrefix: String? = null) =
    CharSequence({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.String(name: String? = null, customPrefix: String? = null) =
    String({ it }, { it }, name, customPrefix)

inline fun IntentExtra.String(defaultValue: String, name: String? = null, customPrefix: String? = null) =
    String({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun <T : Parcelable>
    IntentExtra.Parcelable(name: String? = null, customPrefix: String? = null): IntentPropertyDelegate<T?> =
    Parcelable<T?, T>({ it }, { it }, name, customPrefix)

inline fun <T : Parcelable>
    IntentExtra.Parcelable(defaultValue: T, name: String? = null, customPrefix: String? = null): IntentPropertyDelegate<T> =
    Parcelable<T, T>({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun <T : Serializable>
    IntentExtra.Serializable(name: String? = null, customPrefix: String? = null): IntentPropertyDelegate<T?> =
    Serializable<T?, T>({ it }, { it }, name, customPrefix)

inline fun <T : Serializable>
    IntentExtra.Serializable(defaultValue: T, name: String? = null, customPrefix: String? = null): IntentPropertyDelegate<T> =
    Serializable<T, T>({ it ?: defaultValue }, { it }, name, customPrefix)
