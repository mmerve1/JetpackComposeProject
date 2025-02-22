package com.example.jetpack

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack.ui.theme.JetpackTheme
import java.lang.reflect.Modifier

@Composable
fun HomePage(navController: NavController){

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = androidx.compose.ui.Modifier.fillMaxWidth().padding(top = 100.dp))
    {
        Text(text = "WELCOME MY \n\nAPPLICATION",
            fontSize = 50.sp)


        Button(onClick = {
          navController.navigate("LogIn")
        }) {
            Text(text = "LOG IN")
        }

        Button(onClick = {

        }) {
            Text(text = "SIGN IN")
        }
    }
}


/*
@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    JetpackTheme {
        HomePage()
    }
}
*/
