package com.example.instagramthreads.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.instagramthreads.navigation.Routes

@Composable
@RequiresApi(Build.VERSION_CODES.O)
@OptIn(ExperimentalMaterial3Api::class)
fun Register(navController: NavHostController){


    var Name by remember { mutableStateOf("") }
    var Bio by remember { mutableStateOf("") }
    var UserName by remember  {mutableStateOf("")}
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column (
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)


    {
        Text(text="Create New Account",
            style = TextStyle(fontWeight= FontWeight.ExtraBold,
                fontSize = 24.sp

            ))
        Box(modifier= Modifier.height(5.dp))

        OutlinedTextField(
            value = Name,
            onValueChange = { Name = it },
            label = { Text(text ="Full Name") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ), singleLine = true,
            modifier= Modifier.fillMaxWidth()

        )
        OutlinedTextField(
            value = UserName,
            onValueChange = {UserName = it },
            label = { Text(text ="UserName") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ), singleLine = true,
            modifier= Modifier.fillMaxWidth()

        )
        OutlinedTextField(
            value = Bio,
            onValueChange = { Bio = it },
            label = { Text(text ="Bio") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text
            ), singleLine = true,modifier= Modifier.fillMaxWidth()

        )

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text ="Email") },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email
            ), singleLine = true,modifier= Modifier.fillMaxWidth()

        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text ="Password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            ) , singleLine = true,modifier= Modifier.fillMaxWidth()
        )
        Box(modifier= Modifier.height(5.dp))
        ElevatedButton(onClick = {

        }, modifier = Modifier.fillMaxWidth())

        {

            Text(text="Create Account",
                style = TextStyle(fontWeight= FontWeight.Bold,
                    fontSize = 20.sp
                ))
        }
        TextButton (onClick = {

            navController.navigate(Routes.Login.routes){
                    popUpTo(navController.graph.startDestinationId)
                launchSingleTop=true

            }

        }, modifier = Modifier.fillMaxWidth())

        {

            SelectionContainer {
                Row {
                    DisableSelection {
                        Text("Already a User?")
                    }
                    Text("  Login")
                }
            }
        }




    }
}

//  SelectionContainer {
//      Row {
//         DisableSelection {
//            Text("New User?")
//        }
///        Text("  Sign Up")
//    }
//  }



@RequiresApi(Build.VERSION_CODES.O)
@Preview(showBackground = true)
@Composable
fun Registerview(){

    //Register()
}
