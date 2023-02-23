package com.dev175.ecommercecompose.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dev175.ecommercecompose.R
import com.dev175.ecommercecompose.model.Product

@Composable
fun Product(
    product: Product,
    onItemClick: (Product) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(product) }
            .padding(12.dp),
        verticalArrangement = Arrangement.Top
    ) {

        Card(
            elevation = 4.dp, modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
                .height(96.dp),
            backgroundColor = Color.LightGray,
            shape = RoundedCornerShape(12.dp)
        ) {
            Image(
                painter = painterResource(id = product.image),
                contentDescription = "",
                modifier = Modifier.padding(
                    16.dp
                )
            )

        }

        Text(
            text = product.name,
            fontSize = 16.sp,
            color = Color.Black,
            fontFamily = FontFamily(Font(R.font.opensans_semi_bold)),
            modifier = Modifier.fillMaxWidth(),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "$" + product.price,
            fontSize = 14.sp,
            color = Color.Gray,
            fontFamily = FontFamily(Font(R.font.opensans_semi_bold))
        )


    }

}

