package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fedorov.andrii.andriiovych.currencyconverter.MainViewModel
import com.fedorov.andrii.andriiovych.currencyconverter.R
import com.fedorov.andrii.andriiovych.currencyconverter.Screens
import com.fedorov.andrii.andriiovych.currencyconverter.data.Currency


@Composable
fun FindScreen(modifier: Modifier = Modifier, mainViewModel: MainViewModel) {
    val searchState = remember {
        mutableStateOf("")
    }
    Scaffold() {
        Column(
            modifier = modifier
                .padding(it)
                .background(Color.Blue)
        ) {
            SearchBlock(modifier, searchState)
            LazyColumn(modifier = modifier.weight(1f)) {
                items(mainViewModel.allCurrencies.value.filter { it.name.contains(searchState.value,true) }) { item ->
                    FindCard(
                        modifier = Modifier,
                        item,
                        onCardClicked = { name ->
                            mainViewModel.getCurrencies(name)
                            mainViewModel.screen.value = Screens.MAIN
                        }
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
    onCardClicked: (String) -> Unit
) {
    Card(
        backgroundColor = Color.Blue, modifier = modifier
            .padding(bottom = 1.dp)
            .clickable { onCardClicked(currency.name) }, elevation = 6.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = currency.description,
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp, end = 8.dp)
            )
            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp, top = 16.dp, bottom = 16.dp),
                text = currency.currencySign,
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.End,
            )

        }
    }
}

@Composable
fun SearchBlock(modifier: Modifier, state: MutableState<String>) {
    Box(modifier = modifier
        .fillMaxWidth()
        .background(Color.Blue)) {
        OutlinedTextField(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp),
            value = state.value,
            onValueChange = { state.value = it }, singleLine = true, leadingIcon = { IconButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.icon_search), contentDescription = "")
            }}, shape = RoundedCornerShape(50), colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search)
        )
    }

}