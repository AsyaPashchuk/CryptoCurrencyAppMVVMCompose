package com.example.cryptocurrencyappmvvmcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.cryptocurrencyappmvvmcompose.presentation.ui.theme.CryptoCurrencyAppMVVMComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptoCurrencyAppMVVMComposeTheme {
                Surface(color = MaterialTheme.colors.background) {

                }
            }
        }
    }
}
