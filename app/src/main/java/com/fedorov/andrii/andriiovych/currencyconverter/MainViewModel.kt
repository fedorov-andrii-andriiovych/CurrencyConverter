package com.fedorov.andrii.andriiovych.currencyconverter

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fedorov.andrii.andriiovych.currencyconverter.api.OkHttpClient
import com.fedorov.andrii.andriiovych.currencyconverter.data.Currency
import com.fedorov.andrii.andriiovych.currencyconverter.data.EURCurrency
import com.fedorov.andrii.andriiovych.currencyconverter.data.USDCurrency
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val okHttpClient: OkHttpClient = OkHttpClient()):ViewModel(){
 val mainCurrencyState = mutableStateOf<Currency>(USDCurrency("USD","US Dollar", 1.0,"$","0"))
 val anotherCurrencyState = mutableStateOf<Currency>(EURCurrency("EUR","Euro", 0.86,"€","0"))

 init {
     getCurrencies()
 }
 private fun getCurrencies() = viewModelScope.launch(Dispatchers.IO){
  val value = okHttpClient.getDataCurrency()
  mainCurrencyState.value = value?.pLN!!
  anotherCurrencyState.value = value.jPY
 }
}