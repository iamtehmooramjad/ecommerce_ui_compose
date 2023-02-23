package com.dev175.ecommercecompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dev175.ecommercecompose.presentation.checkout.CheckoutScreen
import com.dev175.ecommercecompose.presentation.home.HomeScreen
import com.dev175.ecommercecompose.presentation.product.ProductScreen
import com.dev175.ecommercecompose.presentation.products.ProductsScreen
import com.dev175.ecommercecompose.presentation.ui.theme.EcommerceComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcommerceComposeTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.HomeScreen.route
                ) {
                    composable(route = Screen.HomeScreen.route) {
                        HomeScreen(navController)
                    }
                    composable(route = Screen.ProductsScreen.route) {
                      ProductsScreen(navController)
                    }
                    composable(route = Screen.ProductScreen.route + "/{productId}") {
                        val productId = it.arguments?.getString("productId")
                        ProductScreen(productId)
                    }
                    composable(route = Screen.CheckOutScreen.route) {
                        CheckoutScreen()
                    }
                }
            }
        }
    }
}

