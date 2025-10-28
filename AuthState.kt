// AuthState.kt
package mx.edu.utng.ejgj.security01.models

sealed class AuthState {
    object Idle : AuthState()
    object Loading : AuthState()
    data class Success(val user: `User.kt`) : AuthState()
    data class Error(val message: String) : AuthState()
    object Logout : AuthState()
}

