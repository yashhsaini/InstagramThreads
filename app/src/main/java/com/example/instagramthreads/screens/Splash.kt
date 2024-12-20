package com.example.instagramthreads.screens

import com.example.instagramthreads.R

import androidx.annotation.NavigationRes
import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavHostController
import com.example.instagramthreads.navigation.Routes
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavHostController){


    ConstraintLayout (modifier=Modifier.fillMaxSize()){

        val (image)=createRefs()
        Image(painter = painterResource(id = R.drawable.logo),contentDescription = "logo",
            modifier= Modifier.constrainAs(image){
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                start.linkTo(parent.start)
                end.linkTo(parent.end)

            })


    }


    Text(text="Splash")
    LaunchedEffect(true) {
        delay(5000)
        if(FirebaseAuth.getInstance().currentUser!=null)
        navController.navigate(Routes.BottomNav.routes){
            navController.navigate(Routes.Register.routes){
                popUpTo(navController.graph.startDestinationId)
                launchSingleTop=true
            }
        }
        else
            navController.navigate(Routes.Login.routes){
                navController.navigate(Routes.Register.routes){
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop=true
                }
            }

    }

}
