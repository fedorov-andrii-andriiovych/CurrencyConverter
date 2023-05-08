package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen(modifier: Modifier) {
    val currencyState = remember {
        mutableStateOf("")
    }
    Scaffold() {
        Box(
            modifier = modifier
                .padding(it)
                .background(Color.Gray)
        ) {
            Column(modifier = modifier.fillMaxSize()) {
                MainCard(
                    changedTextField = {},
                    modifier = Modifier.weight(0.2f),
                    currencyState = currencyState
                )
                MainCard(
                    changedTextField = {},
                    modifier = Modifier.weight(0.2f),
                    currencyState = currencyState
                )
                Calculate(modifier = Modifier.weight(0.6f), currencyState)
            }
        }
    }
}

@Composable
fun MainCard(modifier: Modifier, changedTextField: (String) -> Unit, currencyState: State<String>) {
    Card(backgroundColor = Color.Blue, modifier = modifier, elevation = 6.dp) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = modifier.fillMaxWidth()) {
            Text(
                text = "USD",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold, color = Color.White,
                modifier = modifier.padding(start = 16.dp, end = 16.dp)
            )
            Text(
                text = "US Dollar",
                fontSize = 24.sp, color = Color.White, modifier = modifier.padding(end = 16.dp)
            )
            Text(
                text = "$",
                modifier = modifier.weight(1f),
                color = Color.White,
                textAlign = TextAlign.End,
                fontSize = 20.sp
            )

            Text(
                modifier = modifier
                    .padding(start = 4.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                    .widthIn(min = 1.dp),
                text = currencyState.value, color = Color.White, fontSize = 24.sp
            )

        }
    }
}

@Composable
fun Calculate(modifier: Modifier, currencyState: MutableState<String>) {
    Column(modifier = modifier) {
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.25f)
        ) {
            Button(
                onClick = { currencyState.value += "7" }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "7", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "8"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "8", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "9"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "9", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { /*TODO*/ }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "*", fontSize = 32.sp, color = Color.Black)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.25f)
        ) {
            Button(
                onClick = { currencyState.value += "4"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "4", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "5"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "5", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "6"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "6", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "", fontSize = 32.sp, color = Color.Black)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.25f)
        ) {
            Button(
                onClick = { currencyState.value += "1" }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "1", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "2"}, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "2", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "3" }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "3", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "3"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "", fontSize = 32.sp, color = Color.Black)
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.25f)
        ) {
            Button(
                onClick = { currencyState.value += "." }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = ".", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value += "0"  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "0", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value = currencyState.value.dropLast(1)  }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "DEL", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { /*TODO*/ }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "*", fontSize = 32.sp, color = Color.Black)
            }
        }
    }
}