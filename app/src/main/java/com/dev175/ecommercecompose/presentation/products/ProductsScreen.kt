package com.dev175.ecommercecompose.presentation.products

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dev175.ecommercecompose.model.Product
import com.dev175.ecommercecompose.presentation.home.components.Product

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductsScreen(navController: NavHostController) {

    val products = mutableListOf<Product>()
    products.add(Product(1, com.dev175.ecommercecompose.R.drawable.boat1, "P1", "175"))
    products.add(Product(2, com.dev175.ecommercecompose.R.drawable.boat2, "P2", "80"))
    products.add(Product(3, com.dev175.ecommercecompose.R.drawable.boat3, "P3", "180"))
    products.add(Product(4, com.dev175.ecommercecompose.R.drawable.boult1, "P4", "280"))
    products.add(Product(11, com.dev175.ecommercecompose.R.drawable.boultairbass1, "P11", "15"))
    products.add(Product(22, com.dev175.ecommercecompose.R.drawable.boatrockerz1, "P22", "30"))
    products.add(Product(33, com.dev175.ecommercecompose.R.drawable.boatairpods1, "P33", "140"))
    products.add(Product(44, com.dev175.ecommercecompose.R.drawable.boatbassheads1, "P44", "80"))


    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        )
    ) {
        items(products.size) {index->
            Product(
                product = products[index],
                onItemClick = {

                }
            )
        }
    }

}

