package me.eugeniomarletti.extras.bundle.base

import android.os.Bundle
import android.os.Parcelable
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.Generic
import java.util.ArrayList

inline fun <T> BundleExtra.IntArrayList(
    crossinline reader: TypeReader<T, ArrayList<Int?>?>,
    crossinline writer: TypeWriter<T, ArrayList<Int?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getIntegerArrayList,
        Bundle::putIntegerArrayList,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.CharSequenceArrayList(
    crossinline reader: TypeReader<T, ArrayList<CharSequence?>?>,
    crossinline writer: TypeWriter<T, ArrayList<CharSequence?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getCharSequenceArrayList,
        Bundle::putCharSequenceArrayList,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.StringArrayList(
    crossinline reader: TypeReader<T, ArrayList<String?>?>,
    crossinline writer: TypeWriter<T, ArrayList<String?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getStringArrayList,
        Bundle::putStringArrayList,
        reader,
        writer,
        name)

inline fun <T, R : Parcelable> BundleExtra.ParcelableArrayList(
    crossinline reader: TypeReader<T, ArrayList<R?>?>,
    crossinline writer: TypeWriter<T, ArrayList<R?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getParcelableArrayList,
        Bundle::putParcelableArrayList,
        reader,
        writer,
        name)
