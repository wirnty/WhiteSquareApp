package com.example.templateapk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
     Button(onClick = { 
    // Code to execute when clicked
        AsyncImage(
            model = "https://t3.ftcdn.net/jpg/01/84/15/84/360_F_184158416_TslXPfNdz4HsMoiK9kWziHaqvJaDkBZ4.jpg",
            contentDescription = "toast"
)
}) {
    Text("click me plz")
}
