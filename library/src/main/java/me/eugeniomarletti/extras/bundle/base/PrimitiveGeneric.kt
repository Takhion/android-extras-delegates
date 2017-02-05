package me.eugeniomarletti.extras.bundle.base

import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.bundle.BundleExtra
import me.eugeniomarletti.extras.bundle.Generic
import me.eugeniomarletti.extras.bundle.getBoolean
import me.eugeniomarletti.extras.bundle.getByte
import me.eugeniomarletti.extras.bundle.getChar
import me.eugeniomarletti.extras.bundle.getDouble
import me.eugeniomarletti.extras.bundle.getFloat
import me.eugeniomarletti.extras.bundle.getInt
import me.eugeniomarletti.extras.bundle.getLong
import me.eugeniomarletti.extras.bundle.getShort
import me.eugeniomarletti.extras.bundle.putBoolean
import me.eugeniomarletti.extras.bundle.putByte
import me.eugeniomarletti.extras.bundle.putChar
import me.eugeniomarletti.extras.bundle.putDouble
import me.eugeniomarletti.extras.bundle.putFloat
import me.eugeniomarletti.extras.bundle.putInt
import me.eugeniomarletti.extras.bundle.putLong
import me.eugeniomarletti.extras.bundle.putShort

inline fun <T> BundleExtra.Boolean(
    crossinline reader: TypeReader<T, Boolean?>,
    crossinline writer: TypeWriter<T, Boolean?>,
    name: String? = null
) =
    Generic(
        ::getBoolean,
        ::putBoolean,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Int(
    crossinline reader: TypeReader<T, Int?>,
    crossinline writer: TypeWriter<T, Int?>,
    name: String? = null
) =
    Generic(
        ::getInt,
        ::putInt,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Long(
    crossinline reader: TypeReader<T, Long?>,
    crossinline writer: TypeWriter<T, Long?>,
    name: String? = null
) =
    Generic(
        ::getLong,
        ::putLong,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Short(
    crossinline reader: TypeReader<T, Short?>,
    crossinline writer: TypeWriter<T, Short?>,
    name: String? = null
) =
    Generic(
        ::getShort,
        ::putShort,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Double(
    crossinline reader: TypeReader<T, Double?>,
    crossinline writer: TypeWriter<T, Double?>,
    name: String? = null
) =
    Generic(
        ::getDouble,
        ::putDouble,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Float(
    crossinline reader: TypeReader<T, Float?>,
    crossinline writer: TypeWriter<T, Float?>,
    name: String? = null
) =
    Generic(
        ::getFloat,
        ::putFloat,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Char(
    crossinline reader: TypeReader<T, Char?>,
    crossinline writer: TypeWriter<T, Char?>,
    name: String? = null
) =
    Generic(
        ::getChar,
        ::putChar,
        reader,
        writer,
        name)

inline fun <T> BundleExtra.Byte(
    crossinline reader: TypeReader<T, Byte?>,
    crossinline writer: TypeWriter<T, Byte?>,
    name: String? = null
) =
    Generic(
        ::getByte,
        ::putByte,
        reader,
        writer,
        name)
