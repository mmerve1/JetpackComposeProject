package com.example.jetpack

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack.ui.theme.JetpackTheme

@Composable
fun LogIn(navController: NavController) {
    val username = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }


    Column (horizontalAlignment = Alignment.Start,
        modifier = Modifier.padding(top = 25.dp)){
        Button(onClick = {
            //navController.navigate(  "HomePage")
            navController.popBackStack()

        }) {
            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Password Icon")
        }
    }


    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp)
    ) {


        // Uygulama logosu
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Logo",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Kullanıcı Adı Girişi
        OutlinedTextField(
            value = username.value,
            onValueChange = { username.value = it },
            label = { Text(text = "Username") },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Person, contentDescription = "Username Icon")
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Şifre Girişi
        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            visualTransformation = PasswordVisualTransformation(),
            label = { Text(text = "Password") },
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "Password Icon")
            },
            modifier = Modifier.fillMaxWidth(0.8f)
        )

        Spacer(modifier = Modifier.height(24.dp))


        Button(
            onClick = {  },
            modifier = Modifier.fillMaxWidth(0.8f)
        ) {
            Text(text = "LOG IN")
        }

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Don't have an account?",
            modifier = Modifier.fillMaxWidth(0.8f),
            textAlign = TextAlign.End,
            fontSize = 15.sp
        )

        Text(
            text = "Sign Up",
            modifier = Modifier.fillMaxWidth(0.8f),
            textAlign = TextAlign.End,
            fontSize = 20.sp,
            color = MaterialTheme.colorScheme.primary,

        )

        Spacer(modifier = Modifier.height(24.dp))


        Row(
            modifier = Modifier.fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = {  }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background), // Google logosu
                    contentDescription = "Google Login",
                    modifier = Modifier.size(40.dp)
                )
            }

            IconButton(onClick = {  }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background), // Facebook logosu
                    contentDescription = "Facebook Login",
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun LogInPreview() {
    JetpackTheme {
        LogIn()
    }
}

 */
