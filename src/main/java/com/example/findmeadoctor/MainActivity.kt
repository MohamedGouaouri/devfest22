package com.example.findmeadoctor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.findmeadoctor.presentation.screens.LauncherScreen
import com.example.findmeadoctor.presentation.screens.Routes
import com.example.findmeadoctor.presentation.screens.device_details.DeviceDetails
import com.example.findmeadoctor.presentation.screens.devices_list.Home
import com.example.findmeadoctor.presentation.screens.energy_cost.EnergyCost
import com.example.findmeadoctor.presentation.ui.theme.FindMeADoctorTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            FindMeADoctorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),
//                    color = Color.Black
                ) {
//                    LauncherScreen()
                    NavHost(navController = navController, startDestination = Routes.DevicesListScreen.route){
                        composable(route = Routes.DevicesListScreen.route){
                            Home(navController = navController)
                        }
                        composable(route = Routes.DeviceDetailScreen.route + "/{deviceId}"){
                            DeviceDetails(navController = navController)
                        }
                    }
//                    PredictionsScreen(navController = navController)
//                    EnergyCost(navController = navController)
                }
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LauncherScreen()
}

