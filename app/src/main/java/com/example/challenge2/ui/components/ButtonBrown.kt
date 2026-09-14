package com.example.challenge2.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.challenge2.ui.theme.Marron

@Composable
fun ButtonBrown(
    texto: String,
){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Marron
        )
    ) {
        Text(texto)
    }
}

fun spacer(modifier: Modifier) {}
