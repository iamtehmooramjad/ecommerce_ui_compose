package com.dev175.ecommercecompose.presentation.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.dev175.ecommercecompose.R
import com.dev175.ecommercecompose.presentation.product.components.BackButton

@Composable
fun ProductScreen(productId: String?) {
    ConstraintLayout() {

        val (backButton, productCv) = createRefs()


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .constrainAs(productCv) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                }

        ) {

            Image(
                painter = painterResource(id = R.drawable.boat1),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.LightGray)
                    .padding(18.dp)

            )

        }


        BackButton(
            modifier = Modifier
                .constrainAs(backButton) {
                    top.linkTo(parent.top, margin = 16.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )

    }
}