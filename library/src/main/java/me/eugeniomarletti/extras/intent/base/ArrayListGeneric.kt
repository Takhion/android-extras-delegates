package me.eugeniomarletti.extras.intent.base

import android.content.Intent
import android.os.Parcelable
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter
import me.eugeniomarletti.extras.intent.Generic
import me.eugeniomarletti.extras.intent.IntentExtra
import java.util.ArrayList

inline fun <T> IntentExtra.IntArrayList(
    crossinline reader: TypeReader<T, ArrayList<Int?>?>,
    crossinline writer: TypeWriter<T, ArrayList<Int?>?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getIntegerArrayListExtra,
        Intent::putIntegerArrayListExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.CharSequenceArrayList(
    crossinline reader: TypeReader<T, ArrayList<CharSequence?>?>,
    crossinline writer: TypeWriter<T, ArrayList<CharSequence?>?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getCharSequenceArrayListExtra,
        Intent::putCharSequenceArrayListExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T> IntentExtra.StringArrayList(
    crossinline reader: TypeReader<T, ArrayList<String?>?>,
    crossinline writer: TypeWriter<T, ArrayList<String?>?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getStringArrayListExtra,
        Intent::putStringArrayListExtra,
        reader,
        writer,
        name,
        customPrefix)

inline fun <T, R : Parcelable> IntentExtra.ParcelableArrayList(
    crossinline reader: TypeReader<T, ArrayList<R?>?>,
    crossinline writer: TypeWriter<T, ArrayList<R?>?>,
    name: String? = null,
    customPrefix: String? = null
) =
    Generic(
        Intent::getParcelableArrayListExtra,
        Intent::putParcelableArrayListExtra,
        reader,
        writer,
        name,
        customPrefix)
