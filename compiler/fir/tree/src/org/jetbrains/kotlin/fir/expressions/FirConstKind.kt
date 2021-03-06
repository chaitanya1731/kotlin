/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions

sealed class FirConstKind<T>(val asString: kotlin.String) {
    object Null : FirConstKind<Nothing?>("Null")
    object Boolean : FirConstKind<kotlin.Boolean>("Boolean")
    object Char : FirConstKind<kotlin.Char>("Char")
    object Byte : FirConstKind<kotlin.Byte>("Byte")
    object Short : FirConstKind<kotlin.Short>("Short")
    object Int : FirConstKind<kotlin.Int>("Int")
    object Long : FirConstKind<kotlin.Long>("Long")
    object String : FirConstKind<kotlin.String>("String")
    object Float : FirConstKind<kotlin.Float>("Float")
    object Double : FirConstKind<kotlin.Double>("Double")
    object IntegerLiteral : FirConstKind<kotlin.Long>("IntegerLiteral")

    override fun toString() = asString
}
