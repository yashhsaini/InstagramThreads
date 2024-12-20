package com.example.instagramthreads

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.instagramthreads.navigation.NavGraph
import com.example.instagramthreads.ui.theme.InstagramThreadsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramThreadsTheme {
                Surface (
                    modifier =Modifier.fillMaxSize(),
                    color= MaterialTheme.colorScheme.background
                ){
                    val navController= rememberNavController()
                    NavGraph(navController=navController)

                }
            }
        }
    }
}
