package com.example.challenge2.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.challenge2.R
import com.example.challenge2.ui.components.Card
import com.example.challenge2.ui.theme.Caqui

data class Producto(
    val imagen: Int,
    val titulo: String,
    val precio: String,
    val descripcion: String
)

@Composable
fun ItemListScreen(

) {
    val productos = listOf(
        Producto(
            imagen = R.drawable.media,
            titulo = stringResource(R.string.nombre_producto),
            precio = stringResource(R.string.precio_producto),
            descripcion = stringResource(R.string.descripcion_producto)
        ),
        Producto(
            imagen = R.drawable.media,
            titulo = stringResource(R.string.nombre_producto),
            precio = stringResource(R.string.precio_producto),
            descripcion = stringResource(R.string.descripcion_producto)
        ),
        Producto(
            imagen = R.drawable.media,
            titulo = stringResource(R.string.nombre_producto),
            precio = stringResource(R.string.precio_producto),
            descripcion = stringResource(R.string.descripcion_producto)
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Caqui)
    ) {
        LazyColumn(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(productos) { producto ->
                Card(
                    imagen = producto.imagen,
                    titulo = producto.titulo,
                    precio = producto.precio,
                    descripcion = producto.descripcion,
                    onFavourite = {},
                    onBuy = {},
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Spacer(modifier = Modifier.height(30.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemListScreenPreview() {
    ItemListScreen()
}