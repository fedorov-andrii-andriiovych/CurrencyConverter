package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fedorov.andrii.andriiovych.currencyconverter.MainViewModel
import com.fedorov.andrii.andriiovych.currencyconverter.Screens

@Composable
fun HomeScreen(modifier: Modifier){
    val mainViewModel:MainViewModel = viewModel()
    when(mainViewModel.screen.value){
        Screens.MAIN-> MainScreen(modifier,mainViewModel)
        Screens.FIND-> FindScreen(modifier,mainViewModel)
    }

}
