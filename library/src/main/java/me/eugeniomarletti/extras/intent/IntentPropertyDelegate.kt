package me.eugeniomarletti.extras.intent

import android.content.Intent
import me.eugeniomarletti.extras.ExtraReader
import me.eugeniomarletti.extras.ExtraWriter
import me.eugeniomarletti.extras.PropertyDelegate
import me.eugeniomarletti.extras.TypeReader
import me.eugeniomarletti.extras.TypeWriter

typealias IntentPropertyDelegate<T> = PropertyDelegate<Intent, T>

/**
 * Helper to create an [IntentPropertyDelegate].
 *
 * @param R The raw type that will be read/written directly to the [Intent].
 * @param T The transformed type (from [R]) that will be read/written from the property.
 * @param typeReader Transforms the raw type [R] in the property type [T] when reading from the [Intent].
 * @param typeWriter Transforms the property type [T] in the raw type [R] when writing to the [Intent].
 * @param intentReader Reads the value from the [Intent].
 * @param intentWriter Writes the value to the [Intent].
 * @param name An optional name for the [Intent] extra. If missing, a compile-time constant will be used equal to the qualified name of the class
 * in which the property is declared plus the name of the property itself.
 * @param customPrefix An optional prefix for the [Intent] extra, to be used before the property name.
 * Note that this is ignored if [name] is present.
 */
inline fun <T, R> IntentExtra.Generic(
    crossinline intentReader: ExtraReader<Intent, R>,
    crossinline intentWriter: ExtraWriter<Intent, R>,
    crossinline typeReader: TypeReader<T, R>,
    crossinline typeWriter: TypeWriter<T, R>,
    name: String? = null,
    customPrefix: String? = null
): IntentPropertyDelegate<T> =
    PropertyDelegate(intentReader, intentWriter, typeReader, typeWriter, name, customPrefix)
