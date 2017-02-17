@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent.base

import android.os.Parcelable
import me.eugeniomarletti.extras.intent.IntentExtra
import me.eugeniomarletti.extras.intent.IntentPropertyDelegate
import java.util.ArrayList

inline fun IntentExtra.CharSequenceArrayList(name: String? = null, customPrefix: String? = null) =
    CharSequenceArrayList({ it }, { it }, name, customPrefix)

inline fun IntentExtra.CharSequenceArrayList(defaultValue: ArrayList<CharSequence?>, name: String? = null, customPrefix: String? = null) =
    CharSequenceArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.StringArrayList(name: String? = null, customPrefix: String? = null) =
    StringArrayList({ it }, { it }, name, customPrefix)

inline fun IntentExtra.StringArrayList(defaultValue: ArrayList<String?>, name: String? = null, customPrefix: String? = null) =
    StringArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.IntArrayList(name: String? = null, customPrefix: String? = null) =
    IntArrayList({ it }, { it }, name, customPrefix)

inline fun IntentExtra.IntArrayList(defaultValue: ArrayList<Int?>, name: String? = null, customPrefix: String? = null) =
    IntArrayList({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun <T : Parcelable> IntentExtra.ParcelableArrayList(
    name: String? = null,
    customPrefix: String? = null
): IntentPropertyDelegate<ArrayList<T?>?> =
    ParcelableArrayList<ArrayList<T?>?, T>({ it }, { it }, name, customPrefix)

inline fun <T : Parcelable> IntentExtra.ParcelableArrayList(
    defaultValue: ArrayList<T?>,
    name: String? = null,
    customPrefix: String? = null
): IntentPropertyDelegate<ArrayList<T?>?> =
    ParcelableArrayList<ArrayList<T?>?, T>({ it ?: defaultValue }, { it }, name, customPrefix)
