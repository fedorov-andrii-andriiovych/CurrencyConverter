package com.fedorov.andrii.andriiovych.currencyconverter.api

import com.google.gson.annotations.SerializedName

data class CurrencyResponse(

	@field:SerializedName("data")
	val data: Data
)

data class CZK(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class PLN(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class PHP(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class BRL(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class CHF(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class TRY(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class RON(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class Data(

	@field:SerializedName("CHF")
	val cHF: CHF,

	@field:SerializedName("HRK")
	val hRK: HRK,

	@field:SerializedName("MXN")
	val mXN: MXN,

	@field:SerializedName("ZAR")
	val zAR: ZAR,

	@field:SerializedName("INR")
	val iNR: INR,

	@field:SerializedName("CNY")
	val cNY: CNY,

	@field:SerializedName("THB")
	val tHB: THB,

	@field:SerializedName("AUD")
	val aUD: AUD,

	@field:SerializedName("ILS")
	val iLS: ILS,

	@field:SerializedName("KRW")
	val kRW: KRW,

	@field:SerializedName("JPY")
	val jPY: JPY,

	@field:SerializedName("PLN")
	val pLN: PLN,

	@field:SerializedName("GBP")
	val gBP: GBP,

	@field:SerializedName("IDR")
	val iDR: IDR,

	@field:SerializedName("HUF")
	val hUF: HUF,

	@field:SerializedName("PHP")
	val pHP: PHP,

	@field:SerializedName("TRY")
	val tRY: TRY,

	@field:SerializedName("RUB")
	val rUB: RUB,

	@field:SerializedName("ISK")
	val iSK: ISK,

	@field:SerializedName("HKD")
	val hKD: HKD,

	@field:SerializedName("EUR")
	val eUR: EUR,

	@field:SerializedName("DKK")
	val dKK: DKK,

	@field:SerializedName("USD")
	val uSD: USD,

	@field:SerializedName("CAD")
	val cAD: CAD,

	@field:SerializedName("MYR")
	val mYR: MYR,

	@field:SerializedName("BGN")
	val bGN: BGN,

	@field:SerializedName("NOK")
	val nOK: NOK,

	@field:SerializedName("RON")
	val rON: RON,

	@field:SerializedName("SGD")
	val sGD: SGD,

	@field:SerializedName("CZK")
	val cZK: CZK,

	@field:SerializedName("SEK")
	val sEK: SEK,

	@field:SerializedName("NZD")
	val nZD: NZD,

	@field:SerializedName("BRL")
	val bRL: BRL
)

data class MXN(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class ZAR(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class KRW(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class SGD(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class JPY(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class NZD(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class GBP(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class IDR(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class EUR(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class CAD(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class DKK(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class MYR(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class BGN(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class HKD(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class USD(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class NOK(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class INR(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class SEK(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class CNY(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class THB(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class HUF(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class RUB(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class ILS(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class AUD(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class ISK(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)

data class HRK(

	@field:SerializedName("symbol")
	val symbol: String,

	@field:SerializedName("name_plural")
	val namePlural: String,

	@field:SerializedName("symbol_native")
	val symbolNative: String,

	@field:SerializedName("code")
	val code: String,

	@field:SerializedName("decimal_digits")
	val decimalDigits: Int,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("rounding")
	val rounding: Int
)
