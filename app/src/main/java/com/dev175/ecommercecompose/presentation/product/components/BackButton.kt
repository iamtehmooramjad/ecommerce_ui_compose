package com.dev175.ecommercecompose.presentation.product.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dev175.ecommercecompose.R

@Composable
fun BackButton(modifier: Modifier) {

    Card(
        modifier = modifier.size(36.dp) ,
        shape = RoundedCornerShape(8.dp)
    ) {

        Box(
            modifier = Modifier.size(36.dp)

        ) {

            IconButton(
                onClick = {},
                modifier = Modifier
                    .clip(RectangleShape)
                    .background(Color.White)
                    .align(Alignment.Center)
                    .fillMaxSize()
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_left),
                    contentDescription = "Back Button",
                    tint = Color.DarkGray,
                    modifier = Modifier.fillMaxSize(0.8f)
                )
            }
        }
    }
}