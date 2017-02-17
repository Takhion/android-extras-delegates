@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent.base

import android.os.Parcelable
import me.eugeniomarletti.extras.intent.IntentExtra

inline fun IntentExtra.ParcelableArray(name: String? = null, customPrefix: String? = null) =
    ParcelableArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.ParcelableArray(defaultValue: Array<Parcelable?>, name: String? = null, customPrefix: String? = null) =
    ParcelableArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.CharSequenceArray(name: String? = null, customPrefix: String? = null) =
    CharSequenceArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.CharSequenceArray(defaultValue: Array<CharSequence?>, name: String? = null, customPrefix: String? = null) =
    CharSequenceArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.StringArray(name: String? = null, customPrefix: String? = null) =
    StringArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.StringArray(defaultValue: Array<String?>, name: String? = null, customPrefix: String? = null) =
    StringArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.ByteArray(name: String? = null, customPrefix: String? = null) =
    ByteArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.ByteArray(defaultValue: ByteArray, name: String? = null, customPrefix: String? = null) =
    ByteArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.CharArray(name: String? = null, customPrefix: String? = null) =
    CharArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.CharArray(defaultValue: CharArray, name: String? = null, customPrefix: String? = null) =
    CharArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.IntArray(name: String? = null, customPrefix: String? = null) =
    IntArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.IntArray(defaultValue: IntArray, name: String? = null, customPrefix: String? = null) =
    IntArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.ShortArray(name: String? = null, customPrefix: String? = null) =
    ShortArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.ShortArray(defaultValue: ShortArray, name: String? = null, customPrefix: String? = null) =
    ShortArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.LongArray(name: String? = null, customPrefix: String? = null) =
    LongArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.LongArray(defaultValue: LongArray, name: String? = null, customPrefix: String? = null) =
    LongArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.DoubleArray(name: String? = null, customPrefix: String? = null) =
    DoubleArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.DoubleArray(defaultValue: DoubleArray, name: String? = null, customPrefix: String? = null) =
    DoubleArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.FloatArray(name: String? = null, customPrefix: String? = null) =
    FloatArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.FloatArray(defaultValue: FloatArray, name: String? = null, customPrefix: String? = null) =
    FloatArray({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.BooleanArray(name: String? = null, customPrefix: String? = null) =
    BooleanArray({ it }, { it }, name, customPrefix)

inline fun IntentExtra.BooleanArray(defaultValue: BooleanArray, name: String? = null, customPrefix: String? = null) =
    BooleanArray({ it ?: defaultValue }, { it }, name, customPrefix)