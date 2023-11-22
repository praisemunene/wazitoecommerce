package com.example.wazitoapp.ui.theme.screens.home

import com.example.wazitoapp.R


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoapp.navigation.ADD_PRODUCTS_URL
import com.example.wazitoapp.navigation.LOGIN_URL
import com.example.wazitoapp.navigation.HOME_URL
import com.example.wazitoapp.navigation.SIGNUP_URL
import com.example.wazitoapp.navigation.VIEW_PRODUCTS_URL
import com.example.wazitoapp.ui.theme.WazitoAppTheme
import java.nio.file.WatchEvent


@Composable
fun HomeScreen(navController: NavController) {
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Button(onClick = {
            navController.navigate(ADD_PRODUCTS_URL)
        }) {
            Text(text = "Add products")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            navController.navigate(VIEW_PRODUCTS_URL)
        }) {
            Text(text = "view products")
        }
    }
    BottomAppBar(
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxWidth()
            .padding(top = 610.dp)


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

//}
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WazitoAppTheme {
        HomeScreen(rememberNavController())
    }
}