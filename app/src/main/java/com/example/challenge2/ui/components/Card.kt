package com.example.challenge2.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Text
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.challenge2.R
import com.example.challenge2.ui.theme.Blanco

@Composable
fun Card(
    @DrawableRes imagen: Int,
    titulo: String,
    precio: String,
    descripcion: String,
    onFavourite: () -> Unit,
    onBuy: () -> Unit,
    modifier: Modifier = Modifier
){
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Blanco
        ),
        modifier = modifier
    ) {
        Column {
            Image(
                painter = painterResource(imagen),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    titulo,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    precio
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    descripcion
                )

                Spacer(modifier = Modifier.height(15.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    ButtonOutlinedBrown(stringResource(R.string.add_fav))
                    Spacer(modifier = Modifier.padding(7.dp))
                    ButtonBrown(stringResource(R.string.buy))
                }
            }
        }
    }
}