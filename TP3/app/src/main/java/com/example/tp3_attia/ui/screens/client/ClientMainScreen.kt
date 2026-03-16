package com.example.tp3_attia.ui.screens.client

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
fun ClientMainScreen(rootNavController: NavHostController) {
    val clientNavController = rememberNavController()
    
    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by clientNavController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                
                val items = listOf(
                    BottomNavItem.Accueil,
                    BottomNavItem.Commandes,
                    BottomNavItem.ProfilClient
                )
                
                items.forEach { item ->
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) },
                        selected = currentRoute == item.route,
                        onClick = {
                            clientNavController.navigate(item.route) {
                                popUpTo(clientNavController.graph.startDestinationId)
                                launchSingleTop = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = clientNavController,
            startDestination = BottomNavItem.Accueil.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(BottomNavItem.Accueil.route) { AccueilClient() }
            composable(BottomNavItem.Commandes.route) { CommandesClient { clientNavController.navigate(Screen.ClientDetails.route) } }
            composable(BottomNavItem.ProfilClient.route) { ProfilClient { rootNavController.navigate(Screen.Login.route) { popUpTo(0) } } }
            composable(Screen.ClientDetails.route) { DetailsCommande { clientNavController.popBackStack() } }
        }
    }
}

@Composable
fun AccueilClient() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text("Bienvenue Client", style = MaterialTheme.typography.headlineSmall)
    }
}

@Composable
fun CommandesClient(onDetailsClick: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("Liste commandes")
        Spacer(Modifier.height(16.dp))
        Button(onClick = onDetailsClick) { Text("Détails commande") }
    }
}

@Composable
fun ProfilClient(onLogout: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("Profil client")
        Spacer(Modifier.height(16.dp))
        Button(onClick = onLogout) { Text("Déconnexion") }
    }
}

@Composable
fun DetailsCommande(onBack: () -> Unit) {
    Column(Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text("Détails de la commande", style = MaterialTheme.typography.titleLarge)
        Spacer(Modifier.height(16.dp))
        Button(onClick = onBack) { Text("Retour") }
    }
}
