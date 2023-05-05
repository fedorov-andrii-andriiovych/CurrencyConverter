package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier) {
    Scaffold() {
        Box(modifier = modifier.padding(it).background(Color.Gray)) {
            LazyColumn(modifier = modifier.padding(start = 4.dp, end = 4.dp, top = 4.dp)) {
                items(10) { MainCard(modifier, changedTextField = {}) }
            }
        }
    }
}

@Composable
fun MainCard(modifier: Modifier, changedTextField: (String) -> Unit) {
    Card(backgroundColor = Color.Blue, modifier = modifier.padding(bottom = 4.dp), elevation = 6.dp) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier.fillMaxWidth()) {
            Text(
                text = "USD",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold, color = Color.White,
                modifier = modifier.padding(start = 16.dp, end = 16.dp)
            )
            Text(
                text = "US Dollar",
                fontSize = 18.sp, color = Color.White, modifier = modifier.padding(end = 16.dp)
            )
            Text(text = "$", modifier = modifier.weight(1f), color = Color.White, textAlign = TextAlign.End, fontSize = 20.sp)

            TextField(
                modifier = modifier
                    .padding(start = 4.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                    .widthIn(min = 1.dp),
                value = "10000",
                onValueChange = { changedTextField(it) },
            colors = TextFieldDefaults.textFieldColors(textColor = Color.White, cursorColor = Color.White),textStyle = TextStyle.Default.copy(
                    textAlign = TextAlign.End, fontSize = 16.sp
                ), maxLines = 1)

        }
    }
}