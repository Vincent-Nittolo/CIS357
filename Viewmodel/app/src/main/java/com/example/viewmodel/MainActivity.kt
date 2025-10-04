package com.example.viewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.compose.runtime.setValue



class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val authViewModel: AuthViewModel by viewModels()
        setContent {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    TopAppBar(
                        colors = topAppBarColors(
                            containerColor = Color.Green,
                            titleContentColor = Color.White
                        ),
                        title = { Text("Vinny's Login Screen") }
                    )
                }
            ) { innerPadding ->
                LoginScreen(
                    modifier = Modifier.padding(innerPadding),
                    viewModel = authViewModel
                )
            }
        }
    }
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    viewModel: AuthViewModel
) {
    val isAuthenticated by viewModel.isAuthenticated.collectAsState(initial = null)
    val email by viewModel.userEmail.collectAsState("")

    var password by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        OutlinedTextField(
            value = email,
            onValueChange = { viewModel.setUserEmail(it) },
            label = { Text("Email") },
            placeholder = { Text("Enter email") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            placeholder = { Text("Enter password") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )

        ElevatedButton(
            onClick = {
                viewModel.authenticate(email, password)
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Sign In")
        }
    }
}

class AuthViewModel : ViewModel() {
    val EMAIL_REGEX = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"
    private val _isAuthenticated = MutableStateFlow<Boolean?>(null)
    private val _userEmail = MutableStateFlow("")

    val isAuthenticated = _isAuthenticated.asStateFlow()
    val userEmail = _userEmail.asStateFlow()

    fun authenticate(email: String, password: String) {
        _isAuthenticated.value = null
        if (email.isBlank() || password.isBlank() || !email.matches(EMAIL_REGEX.toRegex())) {
            _isAuthenticated.value = false
            return
        }
        _isAuthenticated.value = password.lowercase().contains("traxy")
    }
    fun setUserEmail(e: String) {
        _isAuthenticated.value = null
        _userEmail.value = e
    }
}