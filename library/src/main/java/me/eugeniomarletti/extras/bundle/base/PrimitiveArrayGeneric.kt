package me.eugeniomarletti.extras.bundle.base

import android.os.Bundle
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.Generic

inline fun <T> BundleExtra.BooleanArray(
    crossinline reader: TypeReader<T, BooleanArray?>,
    crossinline writer: TypeWriter<T, BooleanArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getBooleanArray,
        Bundle::putBooleanArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.ByteArray(
    crossinline reader: TypeReader<T, ByteArray?>,
    crossinline writer: TypeWriter<T, ByteArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getByteArray,
        Bundle::putByteArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.CharArray(
    crossinline reader: TypeReader<T, CharArray?>,
    crossinline writer: TypeWriter<T, CharArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getCharArray,
        Bundle::putCharArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.IntArray(
    crossinline reader: TypeReader<T, IntArray?>,
    crossinline writer: TypeWriter<T, IntArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getIntArray,
        Bundle::putIntArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.ShortArray(
    crossinline reader: TypeReader<T, ShortArray?>,
    crossinline writer: TypeWriter<T, ShortArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getShortArray,
        Bundle::putShortArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.LongArray(
    crossinline reader: TypeReader<T, LongArray?>,
    crossinline writer: TypeWriter<T, LongArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getLongArray,
        Bundle::putLongArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.DoubleArray(
    crossinline reader: TypeReader<T, DoubleArray?>,
    crossinline writer: TypeWriter<T, DoubleArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getDoubleArray,
        Bundle::putDoubleArray,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.FloatArray(
    crossinline reader: TypeReader<T, FloatArray?>,
    crossinline writer: TypeWriter<T, FloatArray?>,
    name: String? = null
) =
    Generic(
        Bundle::getFloatArray,
        Bundle::putFloatArray,
        reader,
        writer,
        name)
