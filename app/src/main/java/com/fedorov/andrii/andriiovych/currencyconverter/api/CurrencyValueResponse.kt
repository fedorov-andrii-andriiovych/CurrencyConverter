package com.fedorov.andrii.andriiovych.currencyconverter.api

import com.google.gson.annotations.SerializedName

data class CurrencyValueResponse(

	@field:SerializedName("data")
	val data: DataValue
)

data class DataValue(

	@field:SerializedName("CHF")
	val cHF: Double,

	@field:SerializedName("HRK")
	val hRK: Double,

	@field:SerializedName("MXN")
	val mXN: Double,

	@field:SerializedName("ZAR")
	val zAR: Double,

	@field:SerializedName("INR")
	val iNR: Double,

	@field:SerializedName("CNY")
	val cNY: Double,

	@field:SerializedName("THB")
	val tHB: Double,

	@field:SerializedName("AUD")
	val aUD: Double,

	@field:SerializedName("ILS")
	val iLS: Double,

	@field:SerializedName("KRW")
	val kRW: Double,

	@field:SerializedName("JPY")
	val jPY: Double,

	@field:SerializedName("PLN")
	val pLN: Double,

	@field:SerializedName("GBP")
	val gBP: Double,

	@field:SerializedName("IDR")
	val iDR: Double,

	@field:SerializedName("HUF")
	val hUF: Double,

	@field:SerializedName("PHP")
	val pHP: Double,

	@field:SerializedName("TRY")
	val tRY: Double,

	@field:SerializedName("RUB")
	val rUB: Double,

	@field:SerializedName("HKD")
	val hKD: Double,

	@field:SerializedName("ISK")
	val iSK: Double,

	@field:SerializedName("EUR")
	val eUR: Double,

	@field:SerializedName("DKK")
	val dKK: Double,

	@field:SerializedName("CAD")
	val cAD:Double,

	@field:SerializedName("MYR")
	val mYR: Double,

	@field:SerializedName("USD")
	val uSD: Double,

	@field:SerializedName("BGN")
	val bGN: Double,

	@field:SerializedName("NOK")
	val nOK: Double,

	@field:SerializedName("RON")
	val rON: Double,

	@field:SerializedName("SGD")
	val sGD: Double,

	@field:SerializedName("CZK")
	val cZK:Double,

	@field:SerializedName("SEK")
	val sEK: Double,

	@field:SerializedName("NZD")
	val nZD: Double,

	@field:SerializedName("BRL")
	val bRL: Double
)
