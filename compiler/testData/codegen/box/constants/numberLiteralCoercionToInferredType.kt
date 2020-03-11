// IGNORE_BACKEND: JS, JS_IR
// IGNORE_BACKEND_FIR: JVM_IR

// FILE: J.java

public class J {
    public static long platformLong() {
        return 42;
    }

    public static Comparable<Long> platformCLong() {
        return new Long(42);
    }
}

// FILE: test.kt

inline fun <reified T> check(value: Any) {
    if (value !is T) throw Exception("value: $value should have type ${T::class.simpleName}")
}

fun <K> selectFirst(vararg xs: K): K = xs[0]

fun takeNLong(nL: Long?) {}

fun box(): String {
    check<Long>(selectFirst(0, 0L))
    check<Byte>(selectFirst(0, 0.toByte()))
    check<Short>(selectFirst(0, 0.toShort()))

    takeNLong(0)

    val cLong: Comparable<Long> = 0L
    check<Long>(selectFirst(0, cLong))

    val cByte: Comparable<Byte> = 0.toByte()
    check<Byte>(selectFirst(0, cByte))

    val cShort: Comparable<Short> = 0.toShort()
    check<Short>(selectFirst(0, cShort))

    val cStar: Comparable<*> = 0L
    check<Int>(selectFirst(0, cStar))

    check<Long>(selectFirst(0, J.platformLong()))
    check<Long>(selectFirst(0, J.platformCLong()))

    check<Int>(selectFirst(0, 0L, "string"))
    check<Int>(selectFirst(0, 0L, true))
    check<Int>(selectFirst(0, 0L, 0.toByte()))
    check<Int>(selectFirst(0, 0L, 0f))
    check<Int>(selectFirst(0, 0L, 0f, 0.0))

    val r = 0
    check<Int>(
        when (r) {
            0 -> 0
            1 -> 0L
            2 -> "string"
            else -> TODO()
        }
    )

    return "OK"
}