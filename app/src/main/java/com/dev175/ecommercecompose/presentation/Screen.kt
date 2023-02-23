package com.dev175.ecommercecompose.presentation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object ProductsScreen : Screen("products_screen")
    object ProductScreen : Screen("product_screen")
    object CheckOutScreen : Screen("check_out_screen")
}
