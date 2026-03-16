package com.example.tp3_attia.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object ClientMain : Screen("client_main")
    object LivreurMain : Screen("livreur_main")
    object ClientDetails : Screen("client_details")
    object LivreurDetails : Screen("livreur_details")
}

sealed class BottomNavItem(val route: String, val icon: ImageVector, val label: String) {
    // Client Tabs
    object Accueil : BottomNavItem("accueil", Icons.Default.Home, "Accueil")
    object Commandes : BottomNavItem("commandes", Icons.Default.List, "Commandes")
    object ProfilClient : BottomNavItem("profil_client", Icons.Default.Person, "Profil")

    // Livreur Tabs
    object Livraisons : BottomNavItem("livraisons", Icons.Default.List, "Livraisons")
    object Itineraire : BottomNavItem("itineraire", Icons.Default.Place, "Itinéraire")
    object ProfilLivreur : BottomNavItem("profil_livreur", Icons.Default.Person, "Profil")
}
