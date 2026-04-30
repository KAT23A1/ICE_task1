package com.example.icetask1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.icetask1.ui.theme.ICETASK1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ICETASK1Theme {
                // Task 2: Correctly setting the content view of the application
                MainAppScreen()
            }
        }
    }
}

@Composable
fun MainAppScreen() {
    // Entry point for the application functionality
    Text(text = "ICE Task 2: Content View Set Successfully")
}