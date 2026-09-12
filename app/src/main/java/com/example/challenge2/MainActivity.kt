package com.example.challenge2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.challenge2.ui.theme.Challenge2Theme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.challenge2.ui.navigation.Screen
import com.example.challenge2.ui.screens.ItemListScreen
import com.example.challenge2.ui.screens.ItemDetailScreen
import com.example.challenge2.ui.screens.ItemFavoritesScreen
import com.example.challenge2.ui.screens.ProfileScreen
import com.example.challenge2.ui.screens.SettingsScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Challenge2Theme {
                val nav = rememberNavController()
                Scaffold(modifier = Modifier.fillMaxSize()) { inner ->
                    NavHost(
                        navController = nav,
                        startDestination = Screen.ItemList.route,
                        modifier = Modifier.padding(inner)
                    ) {
                        composable(Screen.ItemList.route) {
                            ItemListScreen(

                            )
                        }

                        composable(Screen.ItemDetail.route) {
                            ItemDetailScreen(

                            )
                        }

                        composable(Screen.ItemFavorites.route) {
                            ItemFavoritesScreen(

                            )
                        }

                        composable(Screen.Settings.route) {
                            SettingsScreen(

                            )
                        }

                        composable(Screen.Profile.route) {
                            ProfileScreen(

                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Challenge2Theme {
        Greeting("Android")
    }
}