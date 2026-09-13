package com.example.challenge2.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.challenge2.ui.navigation.Screen
import androidx.compose.material.icons.rounded.Storefront

private val SelectedColor = Color(0xFF6D4C33)
private val UnselectedColor = Color(0xFF9E9E9E)

@Composable
fun BottomBar(navController: NavController) {
    val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        NavigationBar(
            modifier = Modifier.clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
        ) {
            NavigationBarItem(
                selected = currentRoute == Screen.ItemList.route,
                onClick = { navController.navigate(Screen.ItemList.route) },
                icon = { Icon(Icons.Rounded.Home, contentDescription = "Product") },
                label = { Text("Product") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = SelectedColor,
                    selectedTextColor = SelectedColor,
                    unselectedIconColor = UnselectedColor,
                    unselectedTextColor = UnselectedColor,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                selected = currentRoute == Screen.ItemDetail.route,
                onClick = { navController.navigate(Screen.ItemDetail.route) },
                icon = { Icon(Icons.Rounded.Search, contentDescription = "Search") },
                label = { Text("Search") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = SelectedColor,
                    selectedTextColor = SelectedColor,
                    unselectedIconColor = UnselectedColor,
                    unselectedTextColor = UnselectedColor,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                selected = currentRoute == Screen.ItemFavorites.route,
                onClick = { navController.navigate(Screen.ItemFavorites.route) },
                icon = { Icon(Icons.Rounded.ShoppingCart, contentDescription = "Cart") },
                label = { Text("Cart") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = SelectedColor,
                    selectedTextColor = SelectedColor,
                    unselectedIconColor = UnselectedColor,
                    unselectedTextColor = UnselectedColor,
                    indicatorColor = Color.Transparent
                )
            )
            NavigationBarItem(
                selected = currentRoute == Screen.Profile.route,
                onClick = { navController.navigate(Screen.Profile.route) },
                icon = { Icon(Icons.Rounded.Person, contentDescription = "Profile") },
                label = { Text("Profile") },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = SelectedColor,
                    selectedTextColor = SelectedColor,
                    unselectedIconColor = UnselectedColor,
                    unselectedTextColor = UnselectedColor,
                    indicatorColor = Color.Transparent
                )
            )
        }

        Box(
            modifier = Modifier
                .offset(y = (-28).dp)
                .size(56.dp)
                .clip(CircleShape)
                .background(SelectedColor),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Rounded.Storefront,
                contentDescription = "Menú central",
                tint = Color.White
            )
        }
    }
}

