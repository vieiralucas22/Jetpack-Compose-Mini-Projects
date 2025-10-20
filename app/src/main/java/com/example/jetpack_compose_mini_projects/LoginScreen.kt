package com.example.jetpack_compose_mini_projects

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack_compose_mini_projects.ui.theme.White

@SuppressLint("RememberReturnType")
@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "Login image",
            Modifier.width(200.dp)
        )
        Text(text = "Welcome back", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email")
        })

        Spacer(Modifier.height(8.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            label = {
                Text(text = "Password")
            }, visualTransformation = PasswordVisualTransformation())

        Spacer(Modifier.height(8.dp))

        Button(onClick = {}) {
            Text(text = "Login")
        }

        Spacer(Modifier.height(32.dp))

        TextButton(onClick = {}) {
            Text(text = "Forgot Password?")
        }

        Spacer(Modifier.height(32.dp))

        Text(text = "Or sign in with")

        Spacer(Modifier.height(32.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp),
            horizontalArrangement = Arrangement.SpaceAround
        )
        {
            Image(
                painter = painterResource(R.drawable.google),
                contentDescription = "Google icon",
                modifier = Modifier
                    .width(48.dp)
                    .clickable {})
            Image(
                painter = painterResource(R.drawable.instagram),
                contentDescription = "Google icon",
                modifier = Modifier
                    .width(48.dp)
                    .clickable {})
            Image(
                painter = painterResource(R.drawable.facebook),
                contentDescription = "Google icon",
                modifier = Modifier
                    .width(48.dp)
                    .clickable {})

        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}