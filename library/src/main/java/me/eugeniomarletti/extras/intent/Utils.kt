@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent

import android.content.Intent
import me.eugeniomarletti.extras.putExtra
import me.eugeniomarletti.extras.readBoolean
import me.eugeniomarletti.extras.readByte
import me.eugeniomarletti.extras.readChar
import me.eugeniomarletti.extras.readDouble
import me.eugeniomarletti.extras.readFloat
import me.eugeniomarletti.extras.readInt
import me.eugeniomarletti.extras.readLong
import me.eugeniomarletti.extras.readShort

@PublishedApi internal inline fun getBooleanExtra(
    receiver: Intent,
    name: String
) =
    receiver.readBoolean(
        Intent::hasExtra,
        Intent::getBooleanExtra,
        name)

@PublishedApi internal inline fun getIntExtra(
    receiver: Intent,
    name: String
) =
    receiver.readInt(
        Intent::hasExtra,
        Intent::getIntExtra,
        name)

@PublishedApi internal inline fun getLongExtra(
    receiver: Intent,
    name: String
) =
    receiver.readLong(
        Intent::hasExtra,
        Intent::getLongExtra,
        name)

@PublishedApi internal inline fun getShortExtra(
    receiver: Intent,
    name: String
) =
    receiver.readShort(
        Intent::hasExtra,
        Intent::getShortExtra,
        name)

@PublishedApi internal inline fun getDoubleExtra(
    receiver: Intent,
    name: String
) =
    receiver.readDouble(
        Intent::hasExtra,
        Intent::getDoubleExtra,
        name)

@PublishedApi internal inline fun getFloatExtra(
    receiver: Intent,
    name: String
) =
    receiver.readFloat(
        Intent::hasExtra,
        Intent::getFloatExtra,
        name)

@PublishedApi internal inline fun getCharExtra(
    receiver: Intent,
    name: String
) =
    receiver.readChar(
        Intent::hasExtra,
        Intent::getCharExtra,
        name)

@PublishedApi internal inline fun getByteExtra(
    receiver: Intent,
    name: String
) =
    receiver.readByte(
        Intent::hasExtra,
        Intent::getByteExtra,
        name)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Boolean?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Int?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Long?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Short?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Double?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Float?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Char?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)

@PublishedApi internal inline fun putExtra(
    receiver: Intent,
    name: String,
    value: Byte?
) =
    receiver.putExtra(
        Intent::removeExtra,
        Intent::putExtra,
        name,
        value)
