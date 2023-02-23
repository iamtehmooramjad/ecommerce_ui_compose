package com.dev175.ecommercecompose.presentation.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.dev175.ecommercecompose.R
import com.dev175.ecommercecompose.model.Product

@Composable
fun Products(
    name: String,
    products: List<Product>,
    showAll: () -> Unit,
    onProductClick: (product: Product) -> Unit
) {
    ConstraintLayout(modifier = Modifier.fillMaxWidth()) {

        val (title, count, viewAll, productsList) = createRefs()
        Text(
            text = name,
            fontSize = 18.sp,
            color = Color.Black,
            fontFamily = FontFamily(Font(R.font.opensans_semi_bold)),
            modifier = Modifier.constrainAs(title) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
            }
        )

        Text(
            text = "( " + products.size + " )",
            fontSize = 16.sp,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.opensans_semi_bold)),
            modifier = Modifier
                .padding(horizontal = 4.dp)
                .constrainAs(count) {
                    top.linkTo(parent.top)
                    bottom.linkTo(title.bottom)
                    start.linkTo(title.end)
                }
        )


        Text(
            text = "Show all",
            fontSize = 14.sp,
            color = Color.Blue,
            fontFamily = FontFamily(Font(R.font.opensans_semi_bold)),
            modifier = Modifier
                .clickable { showAll() }
                .constrainAs(viewAll) {
                    top.linkTo(title.top)
                    bottom.linkTo(title.bottom)
                    end.linkTo(parent.end)
                }
        )


        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .constrainAs(productsList) {
                top.linkTo(title.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }) {
            items(products) { product ->
                Product(
                    product = product,
                    onItemClick = {
                        onProductClick(product)
                    }
                )
            }
        }

    }
}