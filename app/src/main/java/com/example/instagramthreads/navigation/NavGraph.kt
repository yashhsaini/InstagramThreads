package com.example.instagramthreads.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.instagramthreads.navigation.Routes.Register
import com.example.instagramthreads.screens.AddThreads
import com.example.instagramthreads.screens.BottomNav
import com.example.instagramthreads.screens.Home
import com.example.instagramthreads.screens.Login
import com.example.instagramthreads.screens.Notification
import com.example.instagramthreads.screens.Profile
import com.example.instagramthreads.screens.Register
import com.example.instagramthreads.screens.Search
import com.example.instagramthreads.screens.Splash

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun NavGraph(navController: NavHostController){

    NavHost(
        navController=navController,
        startDestination =Routes.Splash.routes
    ) {
        composable(Routes.Splash.routes) {

            Splash(navController)
        }
        composable(Routes.Home.routes) {

            Home()
        }
        composable(Routes.Search.routes) {

            Search()
        }
        composable(Routes.Notification.routes) {

            Notification()
        }
        composable(Routes.AddThread.routes) {

            AddThreads()
        }
        composable(Routes.Profile.routes) {

            Profile()
        }
        composable(Routes.BottomNav.routes) {

            BottomNav(navController)
        }
        composable(Routes.Login.routes) {

            Login(navController)
        }
        composable(Routes.Register.routes) {

            Register(navController)
        }


    }

}
