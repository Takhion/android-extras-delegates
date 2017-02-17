package me.eugeniomarletti.extras.intent.base

import android.content.Intent
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.intent.Generic
import me.eugeniomarletti.extras.intent.IntentExtra

inline fun <T> IntentExtra.BooleanArray(
    crossinline reader: TypeReader<T, BooleanArray?>,
    crossinline writer: TypeWriter<T, BooleanArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getBooleanArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.ByteArray(
    crossinline reader: TypeReader<T, ByteArray?>,
    crossinline writer: TypeWriter<T, ByteArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getByteArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.CharArray(
    crossinline reader: TypeReader<T, CharArray?>,
    crossinline writer: TypeWriter<T, CharArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getCharArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.IntArray(
    crossinline reader: TypeReader<T, IntArray?>,
    crossinline writer: TypeWriter<T, IntArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getIntArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.ShortArray(
    crossinline reader: TypeReader<T, ShortArray?>,
    crossinline writer: TypeWriter<T, ShortArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getShortArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.LongArray(
    crossinline reader: TypeReader<T, LongArray?>,
    crossinline writer: TypeWriter<T, LongArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getLongArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.DoubleArray(
    crossinline reader: TypeReader<T, DoubleArray?>,
    crossinline writer: TypeWriter<T, DoubleArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getDoubleArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.FloatArray(
    crossinline reader: TypeReader<T, FloatArray?>,
    crossinline writer: TypeWriter<T, FloatArray?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getFloatArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name,
        customPrefix)
