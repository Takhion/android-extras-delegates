@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.bundle

import android.os.Bundle
import me.eugeniomarletti.extras.putExtra
import me.eugeniomarletti.extras.readBoolean
import me.eugeniomarletti.extras.readByte
import me.eugeniomarletti.extras.readChar
import me.eugeniomarletti.extras.readDouble
import me.eugeniomarletti.extras.readFloat
import me.eugeniomarletti.extras.readInt
import me.eugeniomarletti.extras.readLong
import me.eugeniomarletti.extras.readShort

@PublishedApi internal inline fun getBoolean(
    receiver: Bundle,
    name: String
) =
    receiver.readBoolean(
        Bundle::containsKey,
        Bundle::getBoolean,
        name)

@PublishedApi internal inline fun getInt(
    receiver: Bundle,
    name: String
) =
    receiver.readInt(
        Bundle::containsKey,
        Bundle::getInt,
        name)

@PublishedApi internal inline fun getLong(
    receiver: Bundle,
    name: String
) =
    receiver.readLong(
        Bundle::containsKey,
        Bundle::getLong,
        name)

@PublishedApi internal inline fun getShort(
    receiver: Bundle,
    name: String
) =
    receiver.readShort(
        Bundle::containsKey,
        Bundle::getShort,
        name)

@PublishedApi internal inline fun getDouble(
    receiver: Bundle,
    name: String
) =
    receiver.readDouble(
        Bundle::containsKey,
        Bundle::getDouble,
        name)

@PublishedApi internal inline fun getFloat(
    receiver: Bundle,
    name: String
) =
    receiver.readFloat(
        Bundle::containsKey,
        Bundle::getFloat,
        name)

@PublishedApi internal inline fun getChar(
    receiver: Bundle,
    name: String
) =
    receiver.readChar(
        Bundle::containsKey,
        Bundle::getChar,
        name)

@PublishedApi internal inline fun getByte(
    receiver: Bundle,
    name: String
) =
    receiver.readByte(
        Bundle::containsKey,
        Bundle::getByte,
        name)

@PublishedApi internal inline fun putBoolean(
    receiver: Bundle,
    name: String,
    value: Boolean?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putBoolean,
        name,
        value)

@PublishedApi internal inline fun putInt(
    receiver: Bundle,
    name: String,
    value: Int?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putInt,
        name,
        value)

@PublishedApi internal inline fun putLong(
    receiver: Bundle,
    name: String,
    value: Long?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putLong,
        name,
        value)

@PublishedApi internal inline fun putShort(
    receiver: Bundle,
    name: String,
    value: Short?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putShort,
        name,
        value)

@PublishedApi internal inline fun putDouble(
    receiver: Bundle,
    name: String,
    value: Double?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putDouble,
        name,
        value)

@PublishedApi internal inline fun putFloat(
    receiver: Bundle,
    name: String,
    value: Float?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putFloat,
        name,
        value)

@PublishedApi internal inline fun putChar(
    receiver: Bundle,
    name: String,
    value: Char?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putChar,
        name,
        value)

@PublishedApi internal inline fun putByte(
    receiver: Bundle,
    name: String,
    value: Byte?
) =
    receiver.putExtra(
        Bundle::remove,
        Bundle::putByte,
        name,
        value)
