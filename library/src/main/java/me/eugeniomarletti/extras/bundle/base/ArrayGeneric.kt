package me.eugeniomarletti.extras.bundle.base

import android.os.Bundle
import android.os.Parcelable
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.Generic

inline fun <T> BundleExtra.ParcelableArray(
    crossinline reader: TypeReader<T, Array<Parcelable?>?>,
    crossinline writer: TypeWriter<T, Array<Parcelable?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getParcelableArray,
        Bundle::putParcelableArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.CharSequenceArray(
    crossinline reader: TypeReader<T, Array<CharSequence?>?>,
    crossinline writer: TypeWriter<T, Array<CharSequence?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getCharSequenceArray,
        Bundle::putCharSequenceArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.StringArray(
    crossinline reader: TypeReader<T, Array<String?>?>,
    crossinline writer: TypeWriter<T, Array<String?>?>,
    name: String? = null
) =
    Generic(
        Bundle::getStringArray,
        Bundle::putCharSequenceArray,
        reader,
        writer,
        name)
