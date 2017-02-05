@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent.base

import me.eugeniomarletti.extras.intent.IntentExtra

inline fun IntentExtra.Boolean(name: String? = null) =
    Boolean({ it }, { it }, name)

inline fun IntentExtra.Boolean(defaultValue: Boolean, name: String? = null) =
    Boolean({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Byte(name: String? = null) =
    Byte({ it }, { it }, name)

inline fun IntentExtra.Byte(defaultValue: Byte, name: String? = null) =
    Byte({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Char(name: String? = null) =
    Char({ it }, { it }, name)

inline fun IntentExtra.Char(defaultValue: Char, name: String? = null) =
    Char({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Int(name: String? = null) =
    Int({ it }, { it }, name)

inline fun IntentExtra.Int(defaultValue: Int, name: String? = null) =
    Int({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Double(name: String? = null) =
    Double({ it }, { it }, name)

inline fun IntentExtra.Double(defaultValue: Double, name: String? = null) =
    Double({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Float(name: String? = null) =
    Float({ it }, { it }, name)

inline fun IntentExtra.Float(defaultValue: Float, name: String? = null) =
    Float({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Short(name: String? = null) =
    Short({ it }, { it }, name)

inline fun IntentExtra.Short(defaultValue: Short, name: String? = null) =
    Short({ it ?: defaultValue }, { it }, name)

inline fun IntentExtra.Long(name: String? = null) =
    Long({ it }, { it }, name)

inline fun IntentExtra.Long(defaultValue: Long, name: String? = null) =
    Long({ it ?: defaultValue }, { it }, name)
