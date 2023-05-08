package com.fedorov.andrii.andriiovych.currencyconverter

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.fedorov.andrii.andriiovych.currencyconverter.data.Currency

class MainViewModel:ViewModel(){
 val mainCurrencyState = mutableStateOf(Currency("USD","US Dollar", 1.0,"$","0"))
 val anotherCurrencyState = mutableStateOf(Currency("EUR","Euro", 0.86,"€","0"))
}