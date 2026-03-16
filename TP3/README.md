# TP N° 3 : La navigation avec JetPack Compose

Cette application Android démontre l'utilisation de **JetPack Compose Navigation** pour gérer une application multi-rôles (Client et Livreur) avec des espaces de travail distincts et une navigation imbriquée.

## Fonctionnalités

- **Écran de Connexion** : Authentification simple pour deux rôles différents.
- **Espace Client** :
    - Bottom Navigation avec 3 onglets : Accueil, Commandes, Profil.
    - Navigation vers les détails d'une commande.
    - Déconnexion sécurisée.
- **Espace Livreur** :
    - Bottom Navigation avec 3 onglets : Livraisons, Itinéraire, Profil.
    - Navigation vers les détails d'une livraison.
    - Déconnexion sécurisée.
- **Architecture Propre** : Utilisation de `NavHost` imbriqués pour séparer les flux de navigation.

## Identifiants de Test

| Rôle | Email | Mot de passe |
| :--- | :--- | :--- |
| **Client** | `client@test.com` | `client123` |
| **Livreur** | `livreur@test.com` | `livreur123` |

## 🛠 Structure du Projet

```text
app/src/main/java/com/example/tp3_attia/
├── MainActivity.kt           # Point d'entrée, contient le NavHost racine
├── ui/
│   ├── navigation/
│   │   └── NavRoutes.kt      # Définition des routes et des items de la BottomNav
│   ├── screens/
│   │   ├── LoginScreen.kt    # Écran de login avec logique de redirection
│   │   ├── client/
│   │   │   └── ClientMainScreen.kt  # Espace Client (BottomNav + Screens)
│   │   └── livreur/
│   │       └── LivreurMainScreen.kt # Espace Livreur (BottomNav + Screens)
│   └── theme/                # Thème Material3 généré
```

## 📱 Navigation

L'application utilise une structure de navigation à deux niveaux :
1. **Root Navigation** : Gère la transition entre l'écran de Login et les espaces (Main Screens) par rôle.
2. **Inner Navigation** : Chaque espace (Client/Livreur) possède son propre `NavHost` pour gérer la navigation entre les onglets de la `BottomNavigationBar` et les écrans de détails.

## 🛠 Installation

1. Clonez le dépôt.
2. Ouvrez le projet dans **Android Studio**.
3. Assurez-vous que les dépendances sont installées (notamment `androidx.navigation:navigation-compose`).
4. Lancez l'application sur un émulateur ou un appareil physique.

## Auteur
Oussama Abderraouf ATTIA