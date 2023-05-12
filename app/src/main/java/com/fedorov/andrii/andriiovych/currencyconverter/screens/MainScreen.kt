package com.fedorov.andrii.andriiovych.currencyconverter.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fedorov.andrii.andriiovych.currencyconverter.Current
import com.fedorov.andrii.andriiovych.currencyconverter.MainViewModel
import com.fedorov.andrii.andriiovych.currencyconverter.R
import com.fedorov.andrii.andriiovych.currencyconverter.Screens
import com.fedorov.andrii.andriiovych.currencyconverter.data.Currency
import com.fedorov.andrii.andriiovych.currencyconverter.data.MainCurrency

@Composable
fun MainScreen(modifier: Modifier, mainViewModel: MainViewModel) {
    Scaffold() {
        Box(
            modifier = modifier
                .padding(it)
                .background(Color.White)
        ) {
            Column(modifier = modifier.fillMaxSize()) {
                MainCard(
                    modifier = Modifier.weight(0.2f),
                    currencyMainState = mainViewModel.mainCurrencyState,
                    onCardClicked = {
                        mainViewModel.screen.value = Screens.FIND
                        mainViewModel.current = Current.MAIN
                    }
                )
                AnotherCard(
                    modifier = Modifier.weight(0.2f),
                    currencyMainState = mainViewModel.mainCurrencyState,
                    currencyAnotherState = mainViewModel.anotherCurrencyState,
                    onCardClicked = {
                        mainViewModel.screen.value = Screens.FIND
                        mainViewModel.current = Current.ANOTHER
                    }

                    )
                Calculate(
                    modifier = Modifier.weight(0.6f),
                    currencyState = mainViewModel.mainCurrencyState,
                    onClickedConvert = { mainViewModel.convertCurrencies() }
                )
            }
        }
    }
}

@Composable
fun MainCard(
    modifier: Modifier,
    currencyMainState: State<Currency>,
    onCardClicked:()->Unit
) {
    Card(backgroundColor = Color.Blue, modifier = modifier.clickable { onCardClicked() }, elevation = 6.dp) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = currencyMainState.value.name,
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold, color = Color.White,
                modifier = Modifier.padding(start = 16.dp, end = 8.dp)
            )
            Text(text = "",modifier = Modifier.weight(1f))
            Text(
                text = currencyMainState.value.currencySign,
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.End,
            )

            Text(
                modifier = Modifier
                    .padding(start = 4.dp, end = 16.dp, top = 16.dp, bottom = 16.dp),
                textAlign = TextAlign.End, maxLines = 3,
                text = currencyMainState.value.count,
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

        }
    }
}

@Composable
fun AnotherCard(
    modifier: Modifier,
    currencyMainState: State<Currency>,
    currencyAnotherState: State<Currency>,
    onCardClicked:()->Unit
) {
    Card(backgroundColor = Color.Blue, modifier = modifier.clickable { onCardClicked() }, elevation = 6.dp) {
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
            Text(
                text = currencyAnotherState.value.name,
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold, color = Color.White,
                modifier = Modifier.padding(start = 16.dp, end = 8.dp)
            )
            Text(text = "",modifier = Modifier.weight(1f))
            Text(
                text = currencyAnotherState.value.currencySign,
                color = Color.White,
                textAlign = TextAlign.End,
                fontSize = 24.sp
            )

            Text(
                modifier = Modifier
                    .padding(start = 4.dp, end = 16.dp, top = 16.dp, bottom = 16.dp)
                    .wrapContentWidth(), maxLines = 3,
                text = validateExit(
                    currencyMainState.value.count,
                    currencyAnotherState.value.course
                ), color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold
            )

        }
    }
}

@Composable
fun Calculate(modifier: Modifier, currencyState: MutableState<Currency>,onClickedConvert:()->Unit) {
    Column(modifier = modifier) {
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.25f)
        ) {
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            7
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "7", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            8
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "8", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            9
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "9", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { onClickedConvert()}, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Icon(modifier = Modifier
                    .height(32.dp)
                    .width(32.dp), painter = painterResource(id = R.drawable.icon_convert), contentDescription = "convert")
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(0.25f)
        ) {
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            4
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "4", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            5
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "5", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            6
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "6", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { }, modifier = modifier
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
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            1
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "1", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            2
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "2", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            3
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "3", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = { currencyState.value.count += "3" }, modifier = modifier
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
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(
                            currencyState.value.count,
                            -1
                        )
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = ".", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        validateEnter(currencyState.value.count, 0)
                    )
                }, modifier = modifier
                    .fillMaxHeight()
                    .weight(0.25f), colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Text(text = "0", fontSize = 32.sp, color = Color.Black)
            }
            Button(
                onClick = {
                    currencyState.value = MainCurrency(
                        currencyState.value.name,
                        currencyState.value.description,
                        currencyState.value.course,
                        currencyState.value.currencySign,
                        if (currencyState.value.count.length == 1) "0" else currencyState.value.count.dropLast(
                            1
                        )
                    )
                }, modifier = modifier
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

fun validateEnter(string: String, int: Int): String {
    return when {
        string.contains(".") && int == -1 -> string
        int == -1 -> "$string."
        string.contains(".0") && int == 0 && string.last() == '0' -> string
        string.isNotEmpty() && string.toDouble() == 0.0 -> int.toString()
        else -> "$string$int"
    }
}

fun validateExit(mainValue: String, anotherCourse: Double): String {
    val result = if (mainValue.toDouble() != 0.0) mainValue.toDouble() * anotherCourse else 0.0
    if (result == 0.0) return "0"
    return String.format("%.2f", result)
}