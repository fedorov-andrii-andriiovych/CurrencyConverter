package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fedorov.andrii.andriiovych.currencyconverter.MainViewModel

@Composable
fun HomeScreen(modifier: Modifier){
    val mainViewModel:MainViewModel = viewModel()
    MainScreen(modifier,mainViewModel)
}