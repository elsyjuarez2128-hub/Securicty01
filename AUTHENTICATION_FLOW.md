# Flujo de Autenticación - Guía Didáctica

## 🎯 Objetivo de Aprendizaje
Comprender paso a paso cómo funciona el sistema de autenticación desde que el usuario
abre la app hasta que cierra sesión.

---

## 🟢 Fase 1: Apertura de la App (Splash Screen)

### ¿Qué pasa?
1. El usuario abre la app
2. Se muestra el Splash Screen
3. Se verifica si existe sesión guardada

### Código Relevante:
```kotlin
// SplashScreen.kt
val isLoggedIn = viewModel.isLoggedIn()

if (isLoggedIn) {
    viewModel.validateToken()
    onNavigateToHome()
} else {
    onNavigateToLogin()
}
