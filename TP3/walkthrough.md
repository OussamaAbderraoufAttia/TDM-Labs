# TP3 Navigation Multi-Role Application Walkthrough

I have implemented the multi-role application according to the requirements using JetPack Compose Navigation.

## Changes Made

### 1. Navigation Structure
- Defined routes in `NavRoutes.kt` for Login, Client Main, and Livreur Main.
- Implemented nested navigation for Client and Livreur workspaces to handle their respective BottomNavigation tabs.

### 2. Login Screen
- Implemented in `LoginScreen.kt`.
- Supports credentials:
    - **Client**: `client@test.com` / `client123`
    - **Livreur**: `livreur@test.com` / `livreur123`

### 3. Client Workspace
- Implemented in `ui/screens/client/ClientMainScreen.kt`.
- **Accueil**: Welcome message.
- **Commandes**: List of orders with a button to "Détails commande".
- **Profil**: Logout button that returns to the login screen.

### 4. Livreur Workspace
- Implemented in `ui/screens/livreur/LivreurMainScreen.kt`.
- **Livraisons**: List of deliveries with a button to "Détails livraison".
- **Itinéraire**: Daily route information.
- **Profil**: Logout button that returns to the login screen.

## Verification

### Navigation Flows
- [x] Login as Client -> Redirect to Client Workspace.
- [x] Navigate between Accueil, Commandes, and Profil tabs in Client Workspace.
- [x] Navigate to Commandes Details.
- [x] Logout from Client Workspace -> Redirect to Login.
- [x] Login as Livreur -> Redirect to Livreur Workspace.
- [x] Navigate between Livraisons, Itinéraire, and Profil tabs in Livreur Workspace.
- [x] Navigate to Livraisons Details.
- [x] Logout from Livreur Workspace -> Redirect to Login.

## Code Structure
- `com.example.tp3_attia.MainActivity`: Entry point and root navigation.
- `com.example.tp3_attia.ui.navigation.NavRoutes`: Route definitions.
- `com.example.tp3_attia.ui.screens.LoginScreen`: Login logic.
- `com.example.tp3_attia.ui.screens.client.*`: Client specific screens.
- `com.example.tp3_attia.ui.screens.livreur.*`: Livreur specific screens.
