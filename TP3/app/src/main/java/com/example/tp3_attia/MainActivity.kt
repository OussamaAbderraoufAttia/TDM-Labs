package com.example.tp3_attia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tp3_attia.ui.navigation.Screen
import com.example.tp3_attia.ui.screens.LoginScreen
import com.example.tp3_attia.ui.screens.client.ClientMainScreen
import com.example.tp3_attia.ui.screens.livreur.LivreurMainScreen
import com.example.tp3_attia.ui.theme.TP3ATTIATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TP3ATTIATheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Login.route) {
        composable(Screen.Login.route) {
            LoginScreen { screen ->
                navController.navigate(screen.route) {
                    popUpTo(Screen.Login.route) { inclusive = true }
                }
            }
        }
        composable(Screen.ClientMain.route) {
            ClientMainScreen(navController)
        }
        composable(Screen.LivreurMain.route) {
            LivreurMainScreen(navController)
        }
    }
}