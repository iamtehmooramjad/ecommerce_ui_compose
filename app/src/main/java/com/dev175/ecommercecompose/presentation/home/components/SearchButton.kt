package com.dev175.ecommercecompose.presentation.home.components

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev175.ecommercecompose.R

@Preview(showBackground = true)
@Composable
fun SearchButton() {

    Card(
        modifier = Modifier
            .size(36.dp),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp,Color.LightGray)
    ) {

        Box(
            modifier = Modifier.fillMaxSize()

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
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "Search Button",
                    tint = Color.DarkGray,
                    modifier = Modifier.fillMaxSize(0.5f)
                )
            }
        }
    }
}