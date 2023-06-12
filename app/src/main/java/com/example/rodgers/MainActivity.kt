package com.example.rodgers

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.core.app.ComponentActivity
import com.example.rodgers.ui.theme.RodgersTheme

class MainActivity : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {



               Greeting()


               



        }
    }
}

//columns are always added insided the functions.
//functions cannot be placed inside a column

//column contents are always arranged vertically
//Row contents are always arranged horizontally

//90% = 90/100 = 0.9

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .fillMaxSize(0.9f)
            .fillMaxSize()
            .background(color = Color.Gray),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center





    ) {

        Sliders()

            Spacer(
                modifier = Modifier
                .height(30.dp)
            )


        Text(
            text = "Hello!",
            color = Color.Blue,
            fontSize = 35.sp,
//            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Thin,
            textDecoration = TextDecoration.Underline,
            letterSpacing = 0.5.em


        )

        Text(text = "Rodgers",)

        Text(text = "New text")

        Rodgers()
        
    }



}
//Layouts: 1 Columns
//
@Composable
fun Rodgers(){
    Text(text = "copyright 2023")
}

@Composable
fun Sliders(){
    Text(text = "This is the slider area")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RodgersTheme {
        Greeting()
//        Rodgers()
    }
}