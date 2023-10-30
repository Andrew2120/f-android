package com.b_labs.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.b_labs.app.ui.theme.FiberAndroid1Theme
import com.b_labs.fiber_components.F_Text
import com.b_labs.fiber_components.F_Text2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiberAndroid1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column {
        F_Text(
            text = "Hello $name!",
        )
        F_Text2(
            text = "Hello $name!",
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FiberAndroid1Theme {
        Greeting("Android")
    }
}