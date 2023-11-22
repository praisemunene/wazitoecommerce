package com.example.wazitoapp.ui.theme.login.LoginScreen


import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoapp.R
import com.example.wazitoapp.data.AuthViewModel
import com.example.wazitoapp.navigation.HOME_URL
import com.example.wazitoapp.navigation.LOGIN_URL
import com.example.wazitoapp.navigation.SIGNUP_URL
import com.example.wazitoapp.navigation.VIEW_PRODUCTS_URL

import com.example.wazitoapp.ui.theme.WazitoAppTheme
import java.time.format.TextStyle


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignupScreen(navController: NavHostController) {

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ){
        Text(
            text = "Sign in",
            modifier = Modifier.padding(15.dp),
            style = androidx.compose.ui.text.TextStyle(
                Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(10.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.payslip),
                modifier = Modifier.height(300.dp),
                contentDescription = "background picture")
        }
        Spacer(modifier = Modifier.height(10.dp))


        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            var email by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                value = email,
                onValueChange = {email = it},
                label = { Text(text = "Email")},
                modifier = Modifier.fillMaxWidth(0.9f),
                shape = RoundedCornerShape(25.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            var name by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                value = name,
                onValueChange = {name = it},
                label = { Text(text = "username")},
                modifier = Modifier.fillMaxWidth(0.9f),
                shape = RoundedCornerShape(25.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )
            Spacer(modifier = Modifier.height(8.dp))
            var password by remember {
                mutableStateOf("")
            }
            OutlinedTextField(
                value = password,
                onValueChange = {password = it},
                label = { Text(text = "Password")},
                modifier = Modifier.fillMaxWidth(0.9f),
                shape = RoundedCornerShape(25.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            var context = LocalContext.current
            val authViewModel = AuthViewModel(navController, context)
            Button(onClick = {
                authViewModel.signup(name,email,password)
            },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Sign in")


            }
        }

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row {
                Text(
                    text = "Don't have an account?",
                )
                Text(
                    text = " Sign up",
                    color = Color.Blue
                )
            }

        }

        BottomAppBar(
            modifier = Modifier
                .background(Color.Transparent)
                .fillMaxWidth()
                .padding(top = 30.dp)


        ) {
            IconButton(
                onClick = {
                    navController.navigate(HOME_URL)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_home_24),
                    contentDescription = "dashboard"
                )
//            Icon(imageVector = Icons.Default.home, contentDescription = )
                Text(
                    text = "Home",
                    modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(VIEW_PRODUCTS_URL)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_account_balance_wallet_24),
                    contentDescription = "calculator"
                )
                Text(
                    text = "products",
                    modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(SIGNUP_URL)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_supervised_user_circle_24),
                    contentDescription = "signup"
                )
                Text(
                    text = "Signup",
                    modifier = Modifier.padding(top = 40.dp, bottom = 1.dp)
                )
            }
            IconButton(
                onClick = {
                    navController.navigate(LOGIN_URL)
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_settings_24),
                    contentDescription = "Intents"
                )
                Text(
                    text = "Login",
                    modifier = Modifier.padding(top = 35.dp, bottom = 1.dp)
                )
            }
        }



    }

}

@Preview(showBackground = true)
@Composable
fun SignupPreview() {
    WazitoAppTheme {
        SignupScreen(rememberNavController())
    }
}