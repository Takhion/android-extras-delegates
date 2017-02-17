@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.intent.base

import me.eugeniomarletti.extras.intent.IntentExtra

inline fun IntentExtra.Boolean(name: String? = null, customPrefix: String? = null) =
    Boolean({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Boolean(defaultValue: Boolean, name: String? = null, customPrefix: String? = null) =
    Boolean({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Byte(name: String? = null, customPrefix: String? = null) =
    Byte({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Byte(defaultValue: Byte, name: String? = null, customPrefix: String? = null) =
    Byte({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Char(name: String? = null, customPrefix: String? = null) =
    Char({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Char(defaultValue: Char, name: String? = null, customPrefix: String? = null) =
    Char({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Int(name: String? = null, customPrefix: String? = null) =
    Int({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Int(defaultValue: Int, name: String? = null, customPrefix: String? = null) =
    Int({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Double(name: String? = null, customPrefix: String? = null) =
    Double({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Double(defaultValue: Double, name: String? = null, customPrefix: String? = null) =
    Double({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Float(name: String? = null, customPrefix: String? = null) =
    Float({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Float(defaultValue: Float, name: String? = null, customPrefix: String? = null) =
    Float({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Short(name: String? = null, customPrefix: String? = null) =
    Short({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Short(defaultValue: Short, name: String? = null, customPrefix: String? = null) =
    Short({ it ?: defaultValue }, { it }, name, customPrefix)

inline fun IntentExtra.Long(name: String? = null, customPrefix: String? = null) =
    Long({ it }, { it }, name, customPrefix)

inline fun IntentExtra.Long(defaultValue: Long, name: String? = null, customPrefix: String? = null) =
    Long({ it ?: defaultValue }, { it }, name, customPrefix)
