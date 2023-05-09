package com.fedorov.andrii.andriiovych.currencyconverter.data

import kotlin.properties.Delegates


abstract class Currency {
    open lateinit var name: String
    open lateinit var description: String
    open var course by Delegates.notNull<Double>()
    open lateinit var currencySign: String
    open lateinit var count: String
}

data class MainCurrency(
    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class DataCurrency(
    val cHF: CHFCurrency,
    val hRK: HRKCurrency,
    val mXN: MXNCurrency,
    val zAR: ZARCurrency,
    val iNR: INRCurrency,
    val cNY: CNYCurrency,
    val tHB: THBCurrency,
    val aUD: AUDCurrency,
    val iLS: ILSCurrency,
    val kRW: KRWCurrency,
    val jPY: JPYCurrency,
    val pLN: PLNCurrency,
    val gBP: GBPCurrency,
    val iDR: IDRCurrency,
    val hUF: HUFCurrency,
    val pHP: PHPCurrency,
    val tRY: TRYCurrency,
    val rUB: RUBCurrency,
    val iSK: ISKCurrency,
    val hKD: HKDCurrency,
    val eUR: EURCurrency,
    val dKK: DKKCurrency,
    val uSD: USDCurrency,
    val cAD: CADCurrency,
    val mYR: MYRCurrency,
    val bGN: BGNCurrency,
    val nOK: NOKCurrency,
    val rON: RONCurrency,
    val sGD: SGDCurrency,
    val cZK: CZKCurrency,
    val sEK: SEKCurrency,
    val nZD: NZDCurrency,
    val bRL: BRLCurrency
)


data class CZKCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class PLNCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class PHPCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class BRLCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class CHFCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class TRYCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class RONCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class MXNCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class ZARCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class KRWCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class SGDCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class JPYCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class NZDCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class GBPCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class IDRCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class EURCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class CADCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class DKKCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class MYRCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class BGNCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class HKDCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class USDCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class NOKCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class INRCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class SEKCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class CNYCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class THBCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class HUFCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class RUBCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class ILSCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class AUDCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class ISKCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()

data class HRKCurrency(

    override var name: String,
    override var description: String,
    override var course: Double,
    override var currencySign: String,
    override var count: String
) : Currency()
