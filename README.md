# TDM - Techniques de Développement Mobile

## 📱 Course Overview

| Property | Value |
|----------|-------|
| **Program** | TDM (Techniques de Développement Mobile) |
| **Specialization** | Systèmes Informatiques et Ingénierie de Logiciels (SIL) |
| **Instructor** | MOKEDDEM Hakim |
| **Student** | Oussama Abderraouf ATTIA |
| **Academic Year** | 2025-2026 (Semester 2) |
| **Institution** | Éole Nationale Superieure d'Informatique (ESI ex INI) Oued Smar - Alger - Algeria |

---

## 🎓 Course Structure

This course is divided into practical works (TP) that progressively build Android development skills:

### **TP1: Technologies de Développement Mobile 1** ✅
**Foundational Android Development - 30 hours**
- Mobile OS and system architectures
- Android platform and development environment
- Kotlin programming basics
- Android UI development (Activities, Fragments, Navigation)

📁 **Location:** `TP1/` → [TP1 README](TP1/README.md)

### **TP3: Navigation avec JetPack Compose** ✅ 
**Advanced Mobile Development - JetPack Compose Navigation - 30 hours**
- JetPack Compose as modern UI framework
- Advanced navigation patterns (nested navigation, role-based routing)
- Multi-role application architecture
- Bottom Navigation with Compose

📁 **Location:** `TP3/` → [TP3 README](TP3/README.md)

---

## 🛠️ Project Setup

### System Requirements
- **Java Development Kit (JDK)** 11 or higher
- **Android Studio** (latest version with Compose support)
- **Android SDK** API level 21+ minimum
- **Gradle** 7.0+
- **Kotlin** 1.8+

### Initial Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd TDM-Labs
   ```

2. **Open each project**
   - Open `TP1` folder in Android Studio for basic Android development
   - Open `TP3` folder in Android Studio for JetPack Compose

3. **Build and Run**
   ```bash
   # From the respective TP directory
   ./gradlew build
   ./gradlew installDebug
   ```

---

## 📚 Learning Path

```
Start Here: TP1
↓
Master Basic Android Concepts
├── Android Runtime & Architecture
├── Activities & Lifecycles  
├── Intent & Intent Filters
├── Layouts & Resources
└── Fragments & Navigation
↓
Progress to: TP3
↓
Learn Modern UI Development
├── JetPack Compose Basics
├── State Management
├── Navigation in Compose
├── Role-Based Architecture
└── Advanced App Patterns
```

---

## 📂 Project Directory Structure

```
TDM-Labs/
├── TP1/                           # Basic Android Development
│   ├── README.md                  # TP1 Documentation
│   ├── app/
│   │   ├── src/main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java/             # Kotlin source code
│   │   │   └── res/              # Resources (layouts, strings, drawables)
│   │   └── build.gradle.kts
│   ├── gradle/                   # Gradle configuration
│   ├── build.gradle.kts
│   └── settings.gradle.kts
│
├── TP3/                           # JetPack Compose Navigation
│   ├── README.md                  # TP3 Documentation
│   ├── app/
│   │   ├── src/main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java/             # Kotlin + Compose code
│   │   │   └── res/              # Resources
│   │   └── build.gradle.kts
│   ├── gradle/
│   ├── build.gradle.kts
│   └── settings.gradle.kts
│
└── README.md                      # This file
```

---

## 🎯 Learning Objectives

After completing both TPs, you will be able to:

### **TP1 Objectives**
- ✅ Understand mobile OS architecture and limitations
- ✅ Set up Android development environment
- ✅ Write Kotlin code for Android
- ✅ Create responsive UI with Activities and Fragments
- ✅ Implement inter-app communication with Intents
- ✅ Manage app lifecycle properly

### **TP3 Objectives**
- ✅ Master JetPack Compose for modern UI development
- ✅ Implement nested navigation patterns
- ✅ Build role-based application architecture
- ✅ Manage complex navigation flows
- ✅ Apply MVVM/MVI patterns with Compose
- ✅ Create professional production-ready apps

---

## 📖 Key Technologies

### **Android Platform**
- Android 5.0 (API 21) - Minimum
- Android 14 (API 34) - Target
- Android Operating System fundamentals

### **Languages & Frameworks**
| Technology | Purpose | TPs |
|-----------|---------|-----|
| **Kotlin** | Primary programming language | TP1, TP3 |
| **Android Framework** | Core platform APIs | TP1, TP3 |
| **JetPack Compose** | Modern UI toolkit | TP3 |
| **Navigation Component** | App navigation | TP1, TP3 |
| **Gradle** | Build automation | TP1, TP3 |

### **Tools**
- Android Studio IDE
- Android Emulator / Physical Devices
- ADB (Android Debug Bridge)
- Gradle Build System

---

## 📋 Competencies Developed

**From Official Curriculum (CF4 - Compétences)**

| Competency | Element | Type | Level |
|-----------|---------|------|-------|
| C4.7: Develop Mobile Apps | Analyze Mobile OS Architecture | Technical | Intermediate |
| C4.7: Develop Mobile Apps | Use Programming Language for Mobile Dev | Operational | Intermediate/Advanced |
| C4.7: Develop Mobile Apps | Create Mobile UI | Operational | Advanced |


---

## 🔗 Quick Links

### TP1 Resources
- [TP1 Detailed README](TP1/README.md)
- [Android Developer Docs](https://developer.android.com)
- [Kotlin Documentation](https://kotlinlang.org/docs)
- [Material Design](https://material.io/design)

### TP3 Resources  
- [TP3 Detailed README](TP3/README.md)
- [JetPack Compose Documentation](https://developer.android.com/jetpack/compose)
- [Navigation in Compose](https://developer.android.com/jetpack/compose/navigation)
- [Modern Android Architecture](https://developer.android.com/jetpack/guide)

---

## 📝 Assignment Guidelines

### Before Starting Each TP:
- Read the individual TP README thoroughly
- Review the prerequisite materials
- Set up your development environment
- Test on both emulator and physical device if possible

### During Development:
- Follow Kotlin coding conventions
- Use meaningful variable names
- Comment complex logic
- Test edge cases
- Follow Android best practices

### Before Submission:
- [ ] Code builds without errors or warnings
- [ ] All required features are implemented
- [ ] App runs without crashes
- [ ] Code is properly formatted
- [ ] Resources are organized correctly
- [ ] Tested on multiple Android versions
- [ ] Comments and documentation complete

---

## 🚀 How to Run Each TP

### **TP1**
```bash
cd TP1
./gradlew build
./gradlew installDebug
# Or use Android Studio Run button
```

### **TP3**  
```bash
cd TP3
./gradlew build
./gradlew installDebug
# Or use Android Studio Run button

# Test Credentials:
# Client: client@test.com / client123
# Livreur: livreur@test.com / livreur123
```

---

## 🐛 Troubleshooting

### Build Issues
- Ensure JDK version matches gradle requirements
- Update Android SDK to latest version
- Clear `.gradle` and `build` directories
- Run `./gradlew clean build`

### Runtime Issues
- Check Android API level compatibility
- Verify all permissions in AndroidManifest.xml
- Test on appropriate emulator API version
- Check logcat for error messages

### Gradle Issues
- Ensure gradle wrapper is executable: `chmod +x gradlew`
- Update gradle.properties with correct Java version
- Verify internet connection for dependency downloads

---

## 📧 Course Contact

**Instructor:** MOKEDDEM Hakim  
**Student Name:** Oussama Abderraouf ATTIA  
**Academic Year:** 2025-2026 S2  

---

## 📄 License & Attribution

This course material is part of the SIL (Systèmes Informatiques et Ingénierie de Logiciels) specialization program.

---

**Last Updated:** March 2026  
**Status:** Both TP1 and TP3 Completed ✅

---

## 📧 Contact

**Instructor:** MOKEDDEM Hakim  
**Student:** Oussama Abderraouf ATTIA  
**Academic Year:** 2025-2026 S2

---

**Last Updated:** March 2026
