package com.example.jetpack_compose_mini_projects

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun StateTestScreen(viewModel: StateTestViewModel) {
    val name by viewModel.name.observeAsState(initial = "")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        MyText(name)
        MyTextField(name, onNameChanged = {viewModel.onNameUpdate(it)})
    }
}

@Composable
fun MyText(name : String) {
    Text(text = "Hello $name", fontSize = 30.sp)
}

@Composable
fun MyTextField(name : String, onNameChanged : (String)-> Unit) {
    OutlinedTextField(value = name, onValueChange = {onNameChanged(it)}, label = {
        Text(text = "Enter name")
    })
}