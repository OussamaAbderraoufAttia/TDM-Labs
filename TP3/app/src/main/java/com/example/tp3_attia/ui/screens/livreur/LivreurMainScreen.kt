package com.example.tp3_attia.ui.screens.livreur

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.example.tp3_attia.ui.navigation.BottomNavItem
import com.example.tp3_attia.ui.navigation.Screen

@Composable
fun LivreurMainScreen(rootNavController: NavHostController) {
    val livreurNavController = rememberNavController()
    
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by livreurNavController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                
                val items = listOf(
                    BottomNavItem.Livraisons,
                    BottomNavItem.Itineraire,
                    BottomNavItem.ProfilLivreur
                )
                
                items.forEach { item ->
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) },
                        selected = currentRoute == item.route,
                        onClick = {
                            livreurNavController.navigate(item.route) {
                                popUpTo(livreurNavController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = livreurNavController,
            startDestination = BottomNavItem.Livraisons.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Livraisons.route) { LivraisonsScreen { livreurNavController.navigate(Screen.LivreurDetails.route) } }
            composable(BottomNavItem.Itineraire.route) { ItineraireScreen() }
            composable(BottomNavItem.ProfilLivreur.route) { ProfilLivreurScreen { rootNavController.navigate(Screen.Login.route) { popUpTo(0) } } }
            composable(Screen.LivreurDetails.route) { DetailsLivraison { livreurNavController.popBackStack() } }
        }
    }
}

@Composable
fun LivraisonsScreen(onDetailsClick: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("Mes livraisons", style = MaterialTheme.typography.headlineSmall)
        Spacer(Modifier.height(16.dp))
        Button(onClick = onDetailsClick) { Text("Détails livraison") }
    }
}

@Composable
fun ItineraireScreen() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Itinéraire du jour", style = MaterialTheme.typography.headlineSmall)
    }
}

@Composable
fun ProfilLivreurScreen(onLogout: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("Profil livreur")
        Spacer(Modifier.height(16.dp))
        Button(onClick = onLogout) { Text("Déconnexion") }
    }
}

@Composable
fun DetailsLivraison(onBack: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("Détails de la livraison", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(16.dp))
        Button(onClick = onBack) { Text("Retour") }
    }
}
