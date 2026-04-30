package com.example.icetask1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.icetask1.ui.theme.ICETASK1Theme
import IceData.IceData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ICETASK1Theme {
                Scaffold { innerPadding ->
                    // ICE Task 3: Implementation
                    MainAppScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainAppScreen(modifier: Modifier = Modifier) {
    // This uses the IceData class you created in Task 4
    val myData = IceData(
        title = "Android Development",
        text = "ICE Task 3 is now functional.",
        type = "Educational"
    )

    Column(modifier = modifier.padding(16.dp)) {
        Text(text = "Title: ${myData.title}")
        Text(text = "Text: ${myData.text}")
        Text(text = "Type: ${myData.type}")
    }
}