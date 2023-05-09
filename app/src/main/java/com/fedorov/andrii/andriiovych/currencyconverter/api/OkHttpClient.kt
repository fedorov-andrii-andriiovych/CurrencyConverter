package com.fedorov.andrii.andriiovych.currencyconverter.api

import com.fedorov.andrii.andriiovych.currencyconverter.data.*
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException

class OkHttpClient {
    private val client = OkHttpClient()
    private val gson = Gson()

    fun getDataCurrency(currency: String = ""): DataCurrency? {
        val currencies = getCurrencies()
        val value = getValueCurrencies(currency)
        if (currencies != null && value != null) {
            return toDataCurrency(currencies, value)
        }
        return null
    }

    private fun getCurrencies(): CurrencyResponse? {
        val url =
            "https://api.freecurrencyapi.com/v1/currencies?apikey=t7XIAqj136BpGvf1zfL7hCjKbnkJbuzRSBA6oRBV&currencies="
        val request = Request.Builder()
            .url(url)
            .build()
        try {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    throw IOException(
                        "Запрос к серверу не был успешен:" +
                                " ${response.code} ${response.message}"
                    )
                }
                return gson.fromJson(response.body!!.string(), CurrencyResponse::class.java)

            }
        } catch (e: IOException) {
            println("Ошибка подключения: $e");
        }
        return null
    }

    private fun getValueCurrencies(currency: String = ""): CurrencyValueResponse? {
        val url =
            "https://api.freecurrencyapi.com/v1/latest?apikey=t7XIAqj136BpGvf1zfL7hCjKbnkJbuzRSBA6oRBV&currencies=&base_currency=$currency"
        val request = Request.Builder()
            .url(url)
            .build()
        try {
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    throw IOException(
                        "Запрос к серверу не был успешен:" +
                                " ${response.code} ${response.message}"
                    )
                }
                return gson.fromJson(response.body!!.string(), CurrencyValueResponse::class.java)
            }
        } catch (e: IOException) {
            println("Ошибка подключения: $e");
        }
        return null
    }

    private fun toDataCurrency(
        response: CurrencyResponse,
        value: CurrencyValueResponse
    ): DataCurrency {
        return DataCurrency(
            cAD = CADCurrency(
                response.data.cAD.code,
                response.data.cAD.name,
                value.data.cAD,
                response.data.cAD.symbol,
                "0"
            ),
            uSD = USDCurrency(
                response.data.uSD.code,
                response.data.uSD.name,
                value.data.uSD,
                response.data.uSD.symbol,
                "0"
            ),
            eUR = EURCurrency(
                response.data.eUR.code,
                response.data.eUR.name,
                value.data.eUR,
                response.data.eUR.symbol,
                "0"
            ),
            sEK = SEKCurrency(
                response.data.sEK.code,
                response.data.sEK.name,
                value.data.sEK,
                response.data.sEK.symbol,
                "0"
            ),
            cHF = CHFCurrency(
                response.data.cHF.code,
                response.data.cHF.name,
                value.data.cHF,
                response.data.cHF.symbol,
                "0"
            ),
            cNY = CNYCurrency(
                response.data.cNY.code,
                response.data.cNY.name,
                value.data.cNY,
                response.data.cNY.symbol,
                "0"
            ),
            cZK = CZKCurrency(
                response.data.cZK.code,
                response.data.cZK.name,
                value.data.cZK,
                response.data.cZK.symbol,
                "0"
            ),
            hKD = HKDCurrency(
                response.data.hKD.code,
                response.data.hKD.name,
                value.data.hKD,
                response.data.hKD.symbol,
                "0"
            ),
            hRK = HRKCurrency(
                response.data.hRK.code,
                response.data.hRK.name,
                value.data.hRK,
                response.data.hRK.symbol,
                "0"
            ),
            hUF = HUFCurrency(
                response.data.hUF.code,
                response.data.hUF.name,
                value.data.hUF,
                response.data.hUF.symbol,
                "0"
            ),
            pHP = PHPCurrency(
                response.data.pHP.code,
                response.data.pHP.name,
                value.data.pHP,
                response.data.pHP.symbol,
                "0"
            ),
            pLN = PLNCurrency(
                response.data.pLN.code,
                response.data.pLN.name,
                value.data.pLN,
                response.data.pLN.symbol,
                "0"
            ),
            gBP = GBPCurrency(
                response.data.gBP.code,
                response.data.gBP.name,
                value.data.gBP,
                response.data.gBP.symbol,
                "0"
            ),
            mXN = MXNCurrency(
                response.data.mXN.code,
                response.data.mXN.name,
                value.data.mXN,
                response.data.mXN.symbol,
                "0"
            ),
            mYR = MYRCurrency(
                response.data.mYR.code,
                response.data.mYR.name,
                value.data.mYR,
                response.data.mYR.symbol,
                "0"
            ),
            bGN = BGNCurrency(
                response.data.bGN.code,
                response.data.bGN.name,
                value.data.bGN,
                response.data.bGN.symbol,
                "0"
            ),
            bRL = BRLCurrency(
                response.data.bRL.code,
                response.data.bRL.name,
                value.data.bRL,
                response.data.bRL.symbol,
                "0"
            ),
            rUB = RUBCurrency(
                response.data.rUB.code,
                response.data.rUB.name,
                value.data.rUB,
                response.data.rUB.symbol,
                "0"
            ),
            rON = RONCurrency(
                response.data.rON.code,
                response.data.rON.name,
                value.data.rON,
                response.data.rON.symbol,
                "0"
            ),
            zAR = ZARCurrency(
                response.data.zAR.code,
                response.data.zAR.name,
                value.data.zAR,
                response.data.zAR.symbol,
                "0"
            ),
            nZD = NZDCurrency(
                response.data.nZD.code,
                response.data.nZD.name,
                value.data.nZD,
                response.data.nZD.symbol,
                "0"
            ),
            iDR = IDRCurrency(
                response.data.iDR.code,
                response.data.iDR.name,
                value.data.iDR,
                response.data.iDR.symbol,
                "0"
            ),
            iLS = ILSCurrency(
                response.data.iLS.code,
                response.data.iLS.name,
                value.data.iLS,
                response.data.iLS.symbol,
                "0"
            ),
            iNR = INRCurrency(
                response.data.iNR.code,
                response.data.iNR.name,
                value.data.iNR,
                response.data.iNR.symbol,
                "0"
            ),
            iSK = ISKCurrency(
                response.data.iSK.code,
                response.data.iSK.name,
                value.data.iSK,
                response.data.iSK.symbol,
                "0"
            ),
            tHB = THBCurrency(
                response.data.tHB.code,
                response.data.tHB.name,
                value.data.tHB,
                response.data.tHB.symbol,
                "0"
            ),
            tRY = TRYCurrency(
                response.data.tRY.code,
                response.data.tRY.name,
                value.data.tRY,
                response.data.tRY.symbol,
                "0"
            ),
            aUD = AUDCurrency(
                response.data.aUD.code,
                response.data.aUD.name,
                value.data.aUD,
                response.data.aUD.symbol,
                "0"
            ),
            kRW = KRWCurrency(
                response.data.kRW.code,
                response.data.kRW.name,
                value.data.kRW,
                response.data.kRW.symbol,
                "0"
            ),
            jPY = JPYCurrency(
                response.data.jPY.code,
                response.data.jPY.name,
                value.data.jPY,
                response.data.jPY.symbol,
                "0"
            ),
            dKK = DKKCurrency(
                response.data.dKK.code,
                response.data.dKK.name,
                value.data.dKK,
                response.data.dKK.symbol,
                "0"
            ),
            nOK = NOKCurrency(
                response.data.nOK.code,
                response.data.nOK.name,
                value.data.nOK,
                response.data.nOK.symbol,
                "0"
            ),
            sGD = SGDCurrency(
                response.data.sGD.code,
                response.data.sGD.name,
                value.data.sGD,
                response.data.sGD.symbol,
                "0"
            )
        )

    }
}