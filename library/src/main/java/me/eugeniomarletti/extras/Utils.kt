@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras

import kotlin.jvm.internal.CallableReference
import kotlin.reflect.KClass
import kotlin.reflect.KDeclarationContainer
import kotlin.reflect.KProperty

inline fun KProperty<*>.defaultDelegateName(customPrefix: String?, separator: String = "::") =
    (customPrefix ?: ownerCanonicalName)?.let { it + separator + name } ?: name

inline val KProperty<*>.ownerCanonicalName: String? get() = owner?.canonicalName
inline val KProperty<*>.owner: KDeclarationContainer? get() = if (this is CallableReference) owner else null
inline val KDeclarationContainer.canonicalName: String? get() = if (this is KClass<*>) this.java.canonicalName else null

internal typealias RemoveExtra<This> = This.(name: String) -> Any?
internal typealias HasExtra<This> = This.(name: String) -> Boolean
internal typealias ExtraReaderDefault<This, R> = This.(name: String, defaultValue: R) -> R

@PublishedApi internal inline fun <T, R : Any> T.putExtra(
    crossinline removeExtra: RemoveExtra<T>,
    crossinline writer: ExtraWriter<T, R>,
    name: String,
    value: R?
) =
    if (value != null) writer(name, value) else removeExtra(name)

@PublishedApi internal inline fun <T, R : Any> T.readPrimitive(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, R>,
    defaultValue: R,
    name: String
) =
    if (hasExtra(name)) reader(name, defaultValue) else null

@PublishedApi internal inline fun <T> T.readBoolean(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Boolean>,
    name: String
) =
    readPrimitive(hasExtra, reader, false, name)

@PublishedApi internal inline fun <T> T.readByte(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Byte>,
    name: String
) =
    readPrimitive(hasExtra, reader, 0, name)

@PublishedApi internal inline fun <T> T.readChar(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Char>,
    name: String
) =
    readPrimitive(hasExtra, reader, '0', name)

@PublishedApi internal inline fun <T> T.readInt(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Int>,
    name: String
) =
    readPrimitive(hasExtra, reader, 0, name)

@PublishedApi internal inline fun <T> T.readDouble(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Double>,
    name: String
) =
    readPrimitive(hasExtra, reader, 0.0, name)

@PublishedApi internal inline fun <T> T.readFloat(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Float>,
    name: String
) =
    readPrimitive(hasExtra, reader, 0f, name)

@PublishedApi internal inline fun <T> T.readShort(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Short>,
    name: String
) =
    readPrimitive(hasExtra, reader, 0, name)

@PublishedApi internal inline fun <T> T.readLong(
    crossinline hasExtra: HasExtra<T>,
    crossinline reader: ExtraReaderDefault<T, Long>,
    name: String
) =
    readPrimitive(hasExtra, reader, 0L, name)
