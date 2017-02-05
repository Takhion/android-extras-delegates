@file:Suppress("NOTHING_TO_INLINE")

package me.eugeniomarletti.extras.bundle.base

import me.eugeniomarletti.extras.bundle.BundleExtra

inline fun BundleExtra.Boolean(name: String? = null) =
    Boolean({ it }, { it }, name)

inline fun BundleExtra.Boolean(defaultValue: Boolean, name: String? = null) =
    Boolean({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Byte(name: String? = null) =
    Byte({ it }, { it }, name)

inline fun BundleExtra.Byte(defaultValue: Byte, name: String? = null) =
    Byte({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Char(name: String? = null) =
    Char({ it }, { it }, name)

inline fun BundleExtra.Char(defaultValue: Char, name: String? = null) =
    Char({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Int(name: String? = null) =
    Int({ it }, { it }, name)

inline fun BundleExtra.Int(defaultValue: Int, name: String? = null) =
    Int({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Double(name: String? = null) =
    Double({ it }, { it }, name)

inline fun BundleExtra.Double(defaultValue: Double, name: String? = null) =
    Double({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Float(name: String? = null) =
    Float({ it }, { it }, name)

inline fun BundleExtra.Float(defaultValue: Float, name: String? = null) =
    Float({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Short(name: String? = null) =
    Short({ it }, { it }, name)

inline fun BundleExtra.Short(defaultValue: Short, name: String? = null) =
    Short({ it ?: defaultValue }, { it }, name)

inline fun BundleExtra.Long(name: String? = null) =
    Long({ it }, { it }, name)

inline fun BundleExtra.Long(defaultValue: Long, name: String? = null) =
    Long({ it ?: defaultValue }, { it }, name)
