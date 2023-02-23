package com.dev175.ecommercecompose.presentation.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dev175.ecommercecompose.model.Product
import com.dev175.ecommercecompose.presentation.Screen
import com.dev175.ecommercecompose.presentation.home.components.BackButton
import com.dev175.ecommercecompose.presentation.home.components.Products
import com.dev175.ecommercecompose.presentation.home.components.SearchButton

@Composable
fun HomeScreen(
    navController: NavController
) {
    val products = mutableListOf<Product>()
    products.add(Product(1, com.dev175.ecommercecompose.R.drawable.boat1, "P1", "175"))
    products.add(Product(2, com.dev175.ecommercecompose.R.drawable.boat2, "P2", "80"))
    products.add(Product(3, com.dev175.ecommercecompose.R.drawable.boat3, "P3", "180"))
    products.add(Product(4, com.dev175.ecommercecompose.R.drawable.boult1, "P4", "280"))


    val accessories = mutableListOf<Product>()
    accessories.add(Product(11, com.dev175.ecommercecompose.R.drawable.boultairbass1, "P11", "15"))
    accessories.add(Product(22, com.dev175.ecommercecompose.R.drawable.boatrockerz1, "P22", "30"))
    accessories.add(Product(33, com.dev175.ecommercecompose.R.drawable.boatairpods1, "P33", "140"))
    accessories.add(Product(44, com.dev175.ecommercecompose.R.drawable.boatbassheads1, "P44", "80"))


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            BackButton()
            SearchButton()
        }

        Spacer(modifier = Modifier.height(24.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Hi-Fi Shop & Service",
                color = Color.Black,
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(com.dev175.ecommercecompose.R.font.opensans_semi_bold))
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Audio Shop on Rustaveli Ave 57.\nThis shop offers both products and services",
                color = Color.LightGray,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(com.dev175.ecommercecompose.R.font.opensans_regular))
            )
            Spacer(modifier = Modifier.height(8.dp))
            Products("Products", products = products, {

            }) { p ->
                navController.navigate(Screen.ProductScreen.route + "/${p.id}")
            }

            Spacer(modifier = Modifier.height(32.dp))

            Products("Accessories", products = accessories, {}) { p ->
                navController.navigate(Screen.ProductScreen.route + "/${p.id}")

            }


        }


    }
}