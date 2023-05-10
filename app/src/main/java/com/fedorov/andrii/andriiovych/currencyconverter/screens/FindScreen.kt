package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fedorov.andrii.andriiovych.currencyconverter.MainViewModel
import com.fedorov.andrii.andriiovych.currencyconverter.Screens
import com.fedorov.andrii.andriiovych.currencyconverter.data.Currency


@Composable
fun FindScreen(modifier:Modifier = Modifier,mainViewModel: MainViewModel) {
    Scaffold() {
        Box(
            modifier = modifier
                .padding(it)
                .background(Color.White)
        ) {
            LazyColumn(modifier = modifier.fillMaxSize()) {
                items(mainViewModel.allCurrencies.value){item->
                    FindCard(
                        modifier = Modifier,
                        item,
                        onCardClicked = {name-> mainViewModel.getCurrencies(name)
                        mainViewModel.screen.value = Screens.MAIN}
                    )
                }
            }
        }
    }
}

@Composable
fun FindCard(
    modifier: Modifier,
    currency: Currency,
    onCardClicked:(String)->Unit
) {
    Card(backgroundColor = Color.Blue, modifier = modifier.padding(bottom = 1.dp).clickable {onCardClicked(currency.name)  }, elevation = 6.dp) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = currency.description,
                fontSize = 24.sp, color = Color.White,fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp,end = 8.dp)
            )
            Text(
                modifier = Modifier.weight(1f).padding(end = 16.dp, top = 16.dp, bottom = 16.dp),
                text = currency.currencySign,
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.End,
            )

        }
    }
}