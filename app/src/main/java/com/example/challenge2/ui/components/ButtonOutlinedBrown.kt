package com.example.challenge2.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.challenge2.ui.theme.Marron

@Composable
fun ButtonOutlinedBrown(
    texto: String,
){
    OutlinedButton(
        onClick = {},
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = Marron
        ),
        border = BorderStroke(1.dp, Marron)
    ){
        Text(texto, color = Marron)
    }
}