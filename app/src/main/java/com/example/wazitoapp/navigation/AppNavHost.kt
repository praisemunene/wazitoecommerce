package com.example.wazitoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoapp.ui.theme.login.LoginScreen.LoginScreen
import com.example.wazitoapp.ui.theme.login.LoginScreen.SignupScreen
import com.example.wazitoapp.ui.theme.screens.home.HomeScreen
import com.example.wazitoapp.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoapp.ui.theme.screens.products.ViewProductsScreen



@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = HOME_URL
) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(HOME_URL) {
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL) {
            AddProductsScreen(navController = navController)
        }
        composable(LOGIN_URL) {
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL) {
            SignupScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL) {
            ViewProductsScreen(navController = navController)
        }



    }
}