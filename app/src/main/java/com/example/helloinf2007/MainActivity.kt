package com.example.helloinf2007

import android.R
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.helloinf2007.ui.theme.HelloINF2007Theme
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Date


class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simple_list_item_1)

        // Get the current time
        val currentTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())

        //Get the current date and time
        val currentDateTime = LocalDateTime.now()

        //Define a custom date and time format
        val formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss")

        //Format the current date and time using the formatter
        val formattedDateTime = currentDateTime.format(formatter)

        // Log a debug message
        Log.d("MainActivity", "OnCreate function is created at $currentTime")
    }
}

// class MainActivity : ComponentActivity() {
// override fun onCreate(savedInstanceState: Bundle?) {
// super.onCreate(savedInstanceState)
// setContent {
// HelloINF2007Theme {
// // A surface container using the 'background' color from the theme
// Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
// Greeting("Sean")
// }
// }
// }
// Log.d()
// }
// }
//
// @Composable
// fun Greeting(name: String, modifier: Modifier = Modifier) {
// Surface(color = Color.Cyan) {
// Text(
// text = "Hello INF2007 , my name is $name!",
// modifier = modifier.padding(24.dp)
// )
// }
// }
//
// @Preview(showBackground = true)
// @Composable
// fun GreetingPreview() {
// HelloINF2007Theme {
// Greeting("Sean")
// }
// }
//
// @Composable
// fun From(name: String , modifier: Modifier= Modifier) {
// Surface(color = Color.Cyan) {
// Text(
// text = "From $name!",
// modifier = modifier.padding(24.dp)
// )
// }
// }
//
// @Preview(showBackground = true)
// @Composable
// fun FromPreview() {
// HelloINF2007Theme {
// From("Michael")
// }