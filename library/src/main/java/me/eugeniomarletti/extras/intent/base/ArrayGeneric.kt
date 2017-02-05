package me.eugeniomarletti.extras.intent.base

import android.content.Intent
import android.os.Parcelable
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.intent.Generic
import me.eugeniomarletti.extras.intent.IntentExtra

inline fun <T> IntentExtra.ParcelableArray(
    crossinline reader: TypeReader<T, Array<Parcelable?>?>,
    crossinline writer: TypeWriter<T, Array<Parcelable?>?>,
    name: String? = null
) =
    Generic(
        Intent::getParcelableArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.CharSequenceArray(
    crossinline reader: TypeReader<T, Array<CharSequence?>?>,
    crossinline writer: TypeWriter<T, Array<CharSequence?>?>,
    name: String? = null
) =
    Generic(
        Intent::getCharSequenceArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name)

inline fun <T> IntentExtra.StringArray(
    crossinline reader: TypeReader<T, Array<String?>?>,
    crossinline writer: TypeWriter<T, Array<String?>?>,
    name: String? = null
) =
    Generic(
        Intent::getStringArrayExtra,
        Intent::putExtra,
        reader,
        writer,
        name)
