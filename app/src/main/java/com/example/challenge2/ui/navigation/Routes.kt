package com.example.challenge2.ui.navigation

sealed class Screen(val route: String) {
    data object ItemList : Screen("ItemList")
    data object ItemDetail   : Screen("ItemDetail")
    data object ItemFavorites: Screen("ItemFavorites")
    data object Settings: Screen("Settings")
    data object Profile: Screen("Profile")
}