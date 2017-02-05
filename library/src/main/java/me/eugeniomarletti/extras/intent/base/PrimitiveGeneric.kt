package me.eugeniomarletti.extras.intent.base

import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.intent.Generic
import me.eugeniomarletti.extras.intent.IntentExtra
import me.eugeniomarletti.extras.intent.getBooleanExtra
import me.eugeniomarletti.extras.intent.getByteExtra
import me.eugeniomarletti.extras.intent.getCharExtra
import me.eugeniomarletti.extras.intent.getDoubleExtra
import me.eugeniomarletti.extras.intent.getFloatExtra
import me.eugeniomarletti.extras.intent.getIntExtra
import me.eugeniomarletti.extras.intent.getLongExtra
import me.eugeniomarletti.extras.intent.getShortExtra
import me.eugeniomarletti.extras.intent.putExtra

inline fun <T> IntentExtra.Boolean(
    crossinline reader: TypeReader<T, Boolean?>,
    crossinline writer: TypeWriter<T, Boolean?>,
    name: String? = null
) =
    Generic(
        ::getBooleanExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Int(
    crossinline reader: TypeReader<T, Int?>,
    crossinline writer: TypeWriter<T, Int?>,
    name: String? = null
) =
    Generic(
        ::getIntExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Long(
    crossinline reader: TypeReader<T, Long?>,
    crossinline writer: TypeWriter<T, Long?>,
    name: String? = null
) =
    Generic(
        ::getLongExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Short(
    crossinline reader: TypeReader<T, Short?>,
    crossinline writer: TypeWriter<T, Short?>,
    name: String? = null
) =
    Generic(
        ::getShortExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Double(
    crossinline reader: TypeReader<T, Double?>,
    crossinline writer: TypeWriter<T, Double?>,
    name: String? = null
) =
    Generic(
        ::getDoubleExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Float(
    crossinline reader: TypeReader<T, Float?>,
    crossinline writer: TypeWriter<T, Float?>,
    name: String? = null
) =
    Generic(
        ::getFloatExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Char(
    crossinline reader: TypeReader<T, Char?>,
    crossinline writer: TypeWriter<T, Char?>,
    name: String? = null
) =
    Generic(
        ::getCharExtra,
        ::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.Byte(
    crossinline reader: TypeReader<T, Byte?>,
    crossinline writer: TypeWriter<T, Byte?>,
    name: String? = null
) =
    Generic(
        ::getByteExtra,
        ::putExtra,
        reader,
        writer,
        name)
