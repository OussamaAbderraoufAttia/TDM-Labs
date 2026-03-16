# TP3 - Navigation avec JetPack Compose

## 📱 Course Information

| Property | Value |
|----------|-------|
| **Practical Work** | TP3 - Navigation avec JetPack Compose |
| **Specialization** | Systèmes Informatiques et Ingénierie de Logiciels (SIL) |
| **Instructor** | MOKEDDEM Hakim |
| **Student** | Oussama Abderraouf ATTIA |
| **Academic Year** | 2025-2026 (Semester 2) |
| **Course Hours** | 30 hours |
| **Level** | Advanced Android Development |

---

## 🎯 Learning Objectives

After completing this practical work, you will be able to:

1. **Master JetPack Compose**
   - Build modern, declarative UIs with Compose
   - Understand composition and recomposition
   - Manage state effectively in Compose

2. **Implement Advanced Navigation**
   - Design nested navigation hierarchies
   - Create role-based routing patterns
   - Manage complex navigation flows
   - Implement back stack management

3. **Build Production-Ready Applications**
   - Apply MVVM/MVI architectural patterns
   - Implement proper separation of concerns
   - Create scalable app structures
   - Design for multiple user roles

4. **Apply Modern Android Best Practices**
   - Use dependency injection
   - Implement proper state management
   - Create testable code
   - Follow Material Design 3 guidelines

---

## 🚀 Features Overview

### **Authentication System**
- Role-based login (Client & Livreur)
- Secure credential validation
- Session management
- Auto-logout on app restart

### **Client Workspace**
- **Home Tab**: Dashboard with user greeting and quick actions
- **Orders Tab**: 
  - List of all orders with status indicators
  - Detailed order view with specifications
  - Real-time order tracking information
- **Profile Tab**:
  - User information display
  - Account settings
  - Secure logout

### **Delivery Partner Workspace**
- **Deliveries Tab**:
  - Active deliveries list
  - Delivery details and instructions
- **Route Tab**:
  - Optimized delivery route map
  - Navigation integration
  - Delivery status updates
- **Profile Tab**:
  - Partner statistics
  - Performance metrics
  - Account management

### **Advanced Architecture**
- **Nested Navigation**: Separate `NavHost` for each role
- **Bottom Navigation**: Context-aware navigation UI
- **Deep Linking**: Support for direct screen access
- **State Preservation**: Maintain UI state across navigation

---

## 🔐 Test Credentials

| User Role | Email | Password | Access |
|-----------|-------|----------|--------|
| **Client** | `client@test.com` | `client123` | Customer workspace |
| **Delivery Partner (Livreur)** | `livreur@test.com` | `livreur123` | Delivery workspace |

---

## 📂 Project Structure

### **Directory Layout**
```
TP3/
├── README.md                          # This file
├── app/
│   ├── build.gradle.kts              # App dependencies and configuration
│   ├── proguard-rules.pro            # Code obfuscation rules
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml   # App permissions and declarations
│   │   │   ├── java/com/example/tp3_attia/
│   │   │   │   ├── MainActivity.kt   # Application entry point
│   │   │   │   ├── ui/
│   │   │   │   │   ├── navigation/
│   │   │   │   │   │   └── NavRoutes.kt      # Route definitions
│   │   │   │   │   ├── screens/
│   │   │   │   │   │   ├── LoginScreen.kt   # Authentication UI
│   │   │   │   │   │   ├── client/
│   │   │   │   │   │   │   ├── ClientMainScreen.kt    # Client workspace
│   │   │   │   │   │   │   ├── ClientHomeScreen.kt    # Home tab
│   │   │   │   │   │   │   ├── ClientOrdersScreen.kt  # Orders
│   │   │   │   │   │   │   ├── ClientProfileScreen.kt # Profile
│   │   │   │   │   │   │   └── OrderDetailsScreen.kt  # Order details
│   │   │   │   │   │   └── livreur/
│   │   │   │   │   │       ├── LivreurMainScreen.kt   # Livreur workspace
│   │   │   │   │   │       ├── DeliveriesScreen.kt    # Deliveries list
│   │   │   │   │   │       ├── RouteScreen.kt         # Route view
│   │   │   │   │   │       ├── LivreurProfileScreen.kt# Profile
│   │   │   │   │   │       └── DeliveryDetailsScreen.kt # Details
│   │   │   │   │   ├── components/
│   │   │   │   │   │   ├── BottomNavBar.kt    # Navigation bar
│   │   │   │   │   │   └── [Other composables]
│   │   │   │   │   └── theme/
│   │   │   │   │       ├── Color.kt           # Material3 colors
│   │   │   │   │       ├── Theme.kt           # Theme definition
│   │   │   │   │       └── Typography.kt      # Text styles
│   │   │   │   └── data/
│   │   │   │       ├── models/                # Data models
│   │   │   │       └── repositories/          # Data repositories
│   │   │   └── res/
│   │   │       ├── drawable/                  # Images and graphics
│   │   │       ├── values/
│   │   │       │   ├── strings.xml           # String resources
│   │   │       │   ├── colors.xml            # Color definitions
│   │   │       │   └── themes.xml            # Theme configuration
│   │   │       └── mipmap/                    # App icons
│   │   ├── test/                      # Unit tests
│   │   └── androidTest/               # Instrumented tests
│   └── build/                         # Compiled output (generated)
├── gradle/
│   ├── wrapper/                       # Gradle wrapper
│   ├── gradle-daemon-jvm.properties   # Gradle JVM config
│   └── libs.versions.toml             # Dependency versions
├── build.gradle.kts                   # Project build configuration
├── settings.gradle.kts                # Project settings
└── gradle.properties                  # Gradle properties
```

---

## 🏗️ Application Architecture

### **Navigation Structure**
```
Root Navigation (NavHost)
├── LoginScreen
└── Based on User Role:
    ├── ClientMainScreen (NavHost)
    │   ├── HomeScreen
    │   ├── OrdersScreen
    │   ├── ProfileScreen
    │   └── OrderDetailsScreen (nested)
    │
    └── LivreurMainScreen (NavHost)
        ├── DeliveriesScreen
        ├── RouteScreen
        ├── ProfileScreen
        └── DeliveryDetailsScreen (nested)
```

### **Data Flow Pattern**
```
UI Layer (Compose Screens)
        ↓
ViewModel (State Management)
        ↓
Repository Pattern
        ↓
Local/Remote Data Sources
```

---

## 🔧 Technologies & Dependencies

### **Core Technologies**
| Technology | Version | Purpose |
|-----------|---------|---------|
| **Kotlin** | 1.8+ | Primary language |
| **JetPack Compose** | Latest | UI framework |
| **Navigation Compose** | Latest | Navigation management |
| **Material Design 3** | Latest | Design system |
| **Android SDK** | 21-34 | Platform support |

### **Key Dependencies**
- `androidx.compose.ui:ui` - Compose UI components
- `androidx.compose.material3:material3` - Material Design 3
- `androidx.navigation:navigation-compose` - Navigation
- `androidx.lifecycle:lifecycle-viewmodel-compose` - State management
- `androidx.activity:activity-compose` - Compose integration

---

## 📋 Prerequisites

### **Knowledge Requirements**
- ✅ Kotlin fundamentals (from TP1)
- ✅ Android Activity lifecycle concepts
- ✅ Basic UI development understanding
- ✅ Object-oriented programming
- ✅ State management basics

### **Software Setup**
- Android Studio (latest version)
- JDK 11 or higher
- Android SDK (API 21+)
- Gradle 7.0+

---

## 🛠️ Getting Started

### **1. Clone Repository**
```bash
git clone <repository-url>
cd TDM-Labs/TP3
```

### **2. Build the Project**
```bash
# Using gradle wrapper
./gradlew build

# Or from Android Studio
# Build → Make Project
```

### **3. Run the Application**
```bash
# Install on emulator/device
./gradlew installDebug

# Or from Android Studio
# Run → Run 'app' (Shift+F10)
```

### **4. Test the Application**
Use the test credentials provided above:
- Login as Client: `client@test.com` / `client123`
- Login as Delivery Partner: `livreur@test.com` / `livreur123`

---

## 🎯 Key Concepts Demonstrated

### **JetPack Compose**
- **Composable Functions**: Declarative UI components
- **State Management**: `rememberSaveable`, `State<T>`
- **Recomposition**: Efficient UI updates
- **Modifiers**: UI node customization
- **Material Design 3**: Modern design system

### **Navigation**
- **NavHost**: Navigation container
- **NavController**: Navigation management
- **Routes**: Screen destinations
- **Back Stack**: Navigation history
- **Nested Navigation**: Hierarchical navigation

### **Architectural Patterns**
- **MVVM**: Model-View-ViewModel
- **Repository Pattern**: Data abstraction
- **Dependency Injection**: Loose coupling
- **State Hoisting**: Lifting state up

---

## 📝 Assignment Requirements

### **Functional Requirements**
- [ ] Login screen with authentication
- [ ] Role-based navigation to appropriate workspace
- [ ] Client workspace with all three tabs
- [ ] Livreur workspace with all three tabs
- [ ] Order/Delivery details screens
- [ ] Secure logout functionality
- [ ] Back navigation handling

### **Code Quality**
- [ ] Code builds without errors or warnings
- [ ] Follows Kotlin naming conventions
- [ ] Implements proper compose best practices
- [ ] Clear comments on complex logic
- [ ] Separated concerns (UI, Logic, Data)

### **Testing & Validation**
- [ ] Tested on API 21 emulator (minimum)
- [ ] Tested on API 34 emulator (target)
- [ ] All navigation flows work correctly
- [ ] No crashes or exceptions
- [ ] Back button behaves correctly

---

## 🐛 Common Issues & Solutions

### **Gradle Build Failures**
```bash
# Clear gradle cache and rebuild
./gradlew clean build

# Update Gradle
./gradlew wrapper --gradle-version=latest
```

### **Recomposition Issues**
- Avoid creating new objects in composables
- Use `remember` for non-state values
- Use `rememberSaveable` for state across recomposition

### **Navigation Not Working**
- Verify route names match exactly
- Check NavController is properly initialized
- Ensure NavHost is at root level
- Verify arguments are properly passed

### **Memory Leaks**
- Use `rememberUpdatedState` for lambdas
- Properly manage ViewModel lifecycle
- Avoid capturing Activities in composables

---

## 📚 Resources & References

### **Official Documentation**
- [JetPack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Navigation Compose](https://developer.android.com/jetpack/compose/navigation)
- [Material Design 3](https://material.io/documentation)
- [Kotlin Documentation](https://kotlinlang.org/docs)

### **Learning Resources**
- [Android Developers Blog](https://android-developers.googleblog.com)
- [Google Codelabs](https://codelabs.developers.google.com)
- [JetPack Compose Samples](https://github.com/android/compose-samples)
- [Architecture Guide](https://developer.android.com/jetpack/guide)

---

## 📊 Comparison: TP1 vs TP3

| Aspect | TP1 | TP3 |
|--------|-----|-----|
| **UI Framework** | XML Layouts | JetPack Compose |
| **Navigation** | Activity-based | Navigation Compose |
| **State Management** | Bundle/SavedState | Compose State |
| **Architecture** | MVC/MVP | MVVM/MVI |
| **Complexity** | Basic | Advanced |
| **Modern Approach** | Traditional | Contemporary |

---

## ✅ Submission Checklist

Before submitting TP3:
- [ ] Application builds successfully
- [ ] All features from TP3 are implemented
- [ ] Both user roles work correctly
- [ ] Navigation flows are complete
- [ ] No crashes or runtime errors
- [ ] Code is well-documented
- [ ] Tested on multiple API levels
- [ ] Git repository is organized
- [ ] README is up to date

---

## 📧 Support & Contact

For questions or issues regarding this practical work:

**Instructor:** MOKEDDEM Hakim  
**Student:** Oussama Abderraouf ATTIA  
**Academic Year:** 2025-2026 S2  

---

## 🔗 Related Resources

- [Back to Main README](../README.md)
- [TP1 Documentation](../TP1/README.md)
- [JetPack Compose Roadmap](https://developer.android.com/jetpack/androidx/compose)

---

**Last Updated:** March 2026  
**Status:** Completed ✅
