package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackTheme {
                Surface (
                    modifier =Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ){
                        Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
           //kopyalanabilir
        SelectionContainer {
            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment =Alignment.CenterHorizontally){
            Text(text = "deneme",
                fontStyle = FontStyle.Italic,
                color = Color.Red,

                )

            Text(text = "hello")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTheme {
     Greeting()
    }
}