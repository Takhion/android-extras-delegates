@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.bundle.base

import android.os.Parcelable
import me.eugeniomarletti.extras.bundle.BundleExtra

inline fun BundleExtra.ParcelableArray(name: String? = null) =
    ParcelableArray({ it }, { it }, name)

inline fun BundleExtra.ParcelableArray(defaultValue: Array<Parcelable?>, name: String? = null) =
    ParcelableArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.CharSequenceArray(name: String? = null) =
    CharSequenceArray({ it }, { it }, name)

inline fun BundleExtra.CharSequenceArray(defaultValue: Array<CharSequence?>, name: String? = null) =
    CharSequenceArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.StringArray(name: String? = null) =
    StringArray({ it }, { it }, name)

inline fun BundleExtra.StringArray(defaultValue: Array<String?>, name: String? = null) =
    StringArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.ByteArray(name: String? = null) =
    ByteArray({ it }, { it }, name)

inline fun BundleExtra.ByteArray(defaultValue: ByteArray, name: String? = null) =
    ByteArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.CharArray(name: String? = null) =
    CharArray({ it }, { it }, name)

inline fun BundleExtra.CharArray(defaultValue: CharArray, name: String? = null) =
    CharArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.IntArray(name: String? = null) =
    IntArray({ it }, { it }, name)

inline fun BundleExtra.IntArray(defaultValue: IntArray, name: String? = null) =
    IntArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.ShortArray(name: String? = null) =
    ShortArray({ it }, { it }, name)

inline fun BundleExtra.ShortArray(defaultValue: ShortArray, name: String? = null) =
    ShortArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.LongArray(name: String? = null) =
    LongArray({ it }, { it }, name)

inline fun BundleExtra.LongArray(defaultValue: LongArray, name: String? = null) =
    LongArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.DoubleArray(name: String? = null) =
    DoubleArray({ it }, { it }, name)

inline fun BundleExtra.DoubleArray(defaultValue: DoubleArray, name: String? = null) =
    DoubleArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.FloatArray(name: String? = null) =
    FloatArray({ it }, { it }, name)

inline fun BundleExtra.FloatArray(defaultValue: FloatArray, name: String? = null) =
    FloatArray({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.BooleanArray(name: String? = null) =
    BooleanArray({ it }, { it }, name)

inline fun BundleExtra.BooleanArray(defaultValue: BooleanArray, name: String? = null) =
    BooleanArray({ it ?: defaultValue }, { it }, name)
