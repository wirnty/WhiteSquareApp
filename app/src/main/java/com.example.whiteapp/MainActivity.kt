package com.example.templateapk

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyScreen()
        }
    }
}

@Composable
fun MyScreen() {
    Button(onClick = {
        // действие при клике
    }) {
        Text("click me plz")
    }

    AsyncImage(
        model = "https://t3.ftcdn.net/jpg/01/84/15/84/360_F_184158416_TslXPfNdz4HsMoiK9kWziHaqvJaDkBZ4.jpg",
        contentDescription = "toast"
    )
}
