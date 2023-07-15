package com.aradevs.safe

/**
 * Created by AraDevs on 14/07/2023
 * Oscar Argueta
 */

/**
 * Null safe [String]
 * @property default default value to return if the string is null
 * @return the string or the default value ("" by default)
 */
fun String?.safeString(default: String = "") = this ?: default

/**
 * Null safe [Int]
 * @property default default value to return if the int is null
 * @return the int or the default value (0 by default)
 */
fun Int?.safeInt(default: Int = 0) = this ?: default

/**
 * Null safe [Long]
 * @property default default value to return if the long is null
 * @return the long or the default value (0L by default)
 */
fun Long?.safeLong(default: Long = 0L) = this ?: default

/**
 * Null safe [Float]
 * @property default default value to return if the float is null
 * @return the float or the default value (0f by default)
 */
fun Float?.safeFloat(default: Float = 0f) = this ?: default

/**
 * Null safe [Double]
 * @property default default value to return if the double is null
 * @return the double or the default value (0.0 by default)
 */
fun Double?.safeDouble(default: Double = 0.0) = this ?: default

/**
 * Null safe [Boolean]
 * @property default default value to return if the boolean is null
 * @return the boolean or the default value (false by default)
 */
fun Boolean?.safeBoolean(default: Boolean = false) = this ?: default

/**
 * Null safe [List]
 * @property default default value to return if the list is null
 * @return the list or the default value (emptyList() by default)
 */
fun <T> List<T>?.safeList(default: List<T> = listOf()) = this ?: default

/**
 * Null safe [MutableList]
 * @property default default value to return if the list is null
 * @return the mutable list or the default value (mutableListOf() by default)
 */
fun <T> MutableList<T>?.safeMutableList(default: MutableList<T> = mutableListOf()) = this ?: default

/**
 * Null safe [Map]
 * @property default default value to return if the map is null
 * @return the map or the default value (mapOf() by default)
 */
fun <K, V> Map<K, V>?.safeMap(default: Map<K, V> = mapOf()) = this ?: default

/**
 * Null safe [MutableMap]
 * @property default default value to return if the map is null
 * @return the mutable map or the default value (mutableMapOf() by default)
 */
fun <K,V> MutableMap<K, V>?.safeMutableMap(default: MutableMap<K, V> = mutableMapOf()) = this ?: default

/**
 * Null safe [Set]
 * @property default default value to return if the set is null
 * @return the set or the default value (setOf() by default)
 */
fun <T> Set<T>?.safeSet(default: Set<T> = setOf()) = this ?: default

/**
 * Null safe [MutableSet]
 * @property default default value to return if the set is null
 * @return the mutable set or the default value (mutableSetOf() by default)
 */
fun <T> MutableSet<T>?.safeMutableSet(default: MutableSet<T> = mutableSetOf()) = this ?: default

/**
 * Null safe [Any]
 * @property default default value to return if the any is null
 * @return null or the provided default value
 */
fun <T> T?.safe(default: T) = this ?: default