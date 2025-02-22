package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    var number = remember {
      mutableStateOf(8)
    }
    var number2 = remember {
        mutableStateOf(0)
    }
           //kopyalanabilir
        SelectionContainer {
            Column (modifier = Modifier.fillMaxSize(),
                horizontalAlignment =Alignment.CenterHorizontally){

            Text(text = "deneme",
                fontStyle = FontStyle.Italic,
                color = Color.Red,

                )

            Text(text = "hello")
                Box(
                    modifier = Modifier
                        .size(100.dp)  // Boyut ekledik
                        .background(color = Color.Red)
                )
                //MyComposable fonksiyonundan aldım bunu
                MyText(text = "compose", color = Color.Blue, size = 25)

                Text(text = number.value.toString())
                Text(text = "Add",
                    modifier = Modifier.clickable{
                        number.value++
                    })


        }
    }


    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {

        Text(text = number2.value.toString(),
            fontSize = 25.sp)

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {

            OutlinedButton(onClick ={
                number2.value--
            },
                    modifier =Modifier.fillMaxWidth().weight(50f)) {
                
                Text("Azalt")
            }

            Button(onClick = {
                number2.value++
            },
                modifier = Modifier.fillMaxWidth().weight(50f)
            ) { Text("Arttır") }

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