@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.bundle.base

import android.os.Parcelable
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.BundlePropertyDelegate
import java.util.ArrayList

inline fun BundleExtra.CharSequenceArrayList(name: String? = null, customPrefix: String? = null) =
    CharSequenceArrayList({ it }, { it }, name, customPrefix)

inline fun BundleExtra.CharSequenceArrayList(defaultValue: ArrayList<CharSequence?>, name: String? = null, customPrefix: String? = null) =
    CharSequenceArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun BundleExtra.StringArrayList(name: String? = null, customPrefix: String? = null) =
    StringArrayList({ it }, { it }, name, customPrefix)

inline fun BundleExtra.StringArrayList(defaultValue: ArrayList<String?>, name: String? = null, customPrefix: String? = null) =
    StringArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun BundleExtra.IntArrayList(name: String? = null, customPrefix: String? = null) =
    IntArrayList({ it }, { it }, name, customPrefix)

inline fun BundleExtra.IntArrayList(defaultValue: ArrayList<Int?>, name: String? = null, customPrefix: String? = null) =
    IntArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun <T : Parcelable> BundleExtra.ParcelableArrayList(
    name: String? = null,
    customPrefix: String? = null
): BundlePropertyDelegate<ArrayList<T?>?> =
    ParcelableArrayList<ArrayList<T?>?, T>({ it }, { it }, name, customPrefix)

inline fun <T : Parcelable> BundleExtra.ParcelableArrayList(
    defaultValue: ArrayList<T?>,
    name: String? = null,
    customPrefix: String? = null
): BundlePropertyDelegate<ArrayList<T?>?> =
    ParcelableArrayList<ArrayList<T?>?, T>({ it ?: defaultValue }, { it }, name, customPrefix)