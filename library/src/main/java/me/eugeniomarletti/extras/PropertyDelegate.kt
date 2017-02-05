package me.eugeniomarletti.extras

import kotlin.reflect.KProperty

typealias TypeReader<T, R> = (R) -> T
typealias TypeWriter<T, R> = (T) -> R

typealias ExtraReader<This, R> = This.(name: String) -> R
typealias ExtraWriter<This, R> = This.(name: String, value: R) -> Any?

/**
 * A property delegate that can read and write from a receiver of type [This], and has a name.
 */
interface PropertyDelegate<in This, T> {
    operator fun provideDelegate(thisRef: Any?, property: KProperty<*>): PropertyDelegate<This, T>
    operator fun getValue(thisRef: This, property: KProperty<*>): T
    operator fun setValue(thisRef: This, property: KProperty<*>, value: T)
}

/**
 * Helper to create a [PropertyDelegate].
 *
 * @param R The raw type that will be read/written directly to the receiver of type [This].
 * @param T The transformed type (from [R]) that will be read/written from the property.
 * @param typeReader Transforms the raw type [R] in the property type [T] when reading from the receiver of type [This].
 * @param typeWriter Transforms the property type [T] in the raw type [R] when writing to the receiver of type [This].
 * @param extraReader Reads the value from the receiver of type [This].
 * @param extraWriter Writes the value to the receiver of type [This].
 * @param name An optional name for the property. If missing, a compile-time constant will be used equal to the qualified name of the class
 * in which the property is declared plus the real name of the property itself.
 */
@PublishedApi internal inline fun <This, T, R> PropertyDelegate(
    crossinline extraReader: ExtraReader<This, R>,
    crossinline extraWriter: ExtraWriter<This, R>,
    crossinline typeReader: TypeReader<T, R>,
    crossinline typeWriter: TypeWriter<T, R>,
    name: String? = null
) = object : PropertyDelegate<This, T> {

    private lateinit var name: String private set

    override operator fun provideDelegate(thisRef: Any?, property: KProperty<*>) = apply {
        this.name = name
            ?: property.ownerCanonicalName?.let { "$it::${property.name}" }
            ?: property.name
    }

    override fun getValue(thisRef: This, property: KProperty<*>): T =
        typeReader(extraReader(thisRef, this.name))

    override fun setValue(thisRef: This, property: KProperty<*>, value: T) {
        value?.let { extraWriter(thisRef, this.name, typeWriter(it)) }
    }
}