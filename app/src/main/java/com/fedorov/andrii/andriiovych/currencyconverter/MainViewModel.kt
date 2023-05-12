package com.fedorov.andrii.andriiovych.currencyconverter

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fedorov.andrii.andriiovych.currencyconverter.api.OkHttpClient
import com.fedorov.andrii.andriiovych.currencyconverter.data.Currency
import com.fedorov.andrii.andriiovych.currencyconverter.data.DataCurrency
import com.fedorov.andrii.andriiovych.currencyconverter.data.EURCurrency
import com.fedorov.andrii.andriiovych.currencyconverter.data.USDCurrency
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val okHttpClient: OkHttpClient = OkHttpClient()) : ViewModel() {
    val screen = mutableStateOf(Screens.MAIN)
    val mainCurrencyState = mutableStateOf<Currency>(USDCurrency("USD", "US Dollar", 1.0, "$", "0"))
    val anotherCurrencyState = mutableStateOf<Currency>(EURCurrency("EUR", "Euro", 0.86, "€", "0"))
    var allCurrencies = mutableStateOf<List<Currency>>(emptyList())
    var current = Current.MAIN
    lateinit var value:DataCurrency

    init {
        getCurrencies("")
    }

    fun convertCurrencies() {
        val main = anotherCurrencyState.value
        val another = mainCurrencyState.value
        main.count = another.count
        another.count = "0"
        anotherCurrencyState.value = another
        mainCurrencyState.value = main
        current = Current.MAIN
        getCurrencies(main.name)
    }

     fun getCurrencies(name:String = "USD") = viewModelScope.launch(Dispatchers.IO) {
         if (current == Current.MAIN){
             value = okHttpClient.getDataCurrency(name)!!
         }
        value.let {
            val list = value.toListCurrency()
            allCurrencies.value = list
            if(current == Current.MAIN){
                list.forEach {
                    if (it.name == name) {
                        it.count =  mainCurrencyState.value.count
                        mainCurrencyState.value = it
                    }
                }
            }else{
                list.forEach {
                    if (it.name == mainCurrencyState.value.name) {
                        it.count =  mainCurrencyState.value.count
                        mainCurrencyState.value = it
                    }
                }
            }
            if(current == Current.ANOTHER){
                list.forEach {
                    if (it.name == name) {
                        it.count =  anotherCurrencyState.value.count
                        anotherCurrencyState.value = it
                    }
                }
            }else{
                list.forEach {
                    if (it.name == anotherCurrencyState.value.name) {
                        it.count =  anotherCurrencyState.value.count
                        anotherCurrencyState.value = it
                    }
                }
            }
        }
     }
}

enum class Current{
    MAIN,
    ANOTHER
}
enum class Screens {
    MAIN,
    FIND
}