package com.example.findmeadoctor.presentation.screens.devices_list

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.findmeadoctor.presentation.components.CircularProgressBar
import com.example.findmeadoctor.presentation.components.DeviceCard
import com.example.findmeadoctor.presentation.screens.Routes


//@SuppressLint("SuspiciousIndentation")
@Composable
fun Home(
    navController: NavController,
    viewModel: DevicesListViewModel = hiltViewModel(),
) {



//    val state by viewModel.state
    val devices by viewModel.state

    Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
//        .background(color = GreenWhite)
                .padding(horizontal = 20.dp)
                .padding(top = 10.dp)
        ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(10.dp)
        ) {
            Icon(imageVector = Icons.Rounded.Home, contentDescription = "Back", modifier = Modifier.clickable {
//                navController.navigate(Routes.DevicesListScreen.route){
//                    popUpTo(route = Routes.DevicesListScreen.route)
//                }
            })
        }
            CircularProgressBar(percentage = 0.8f, number = 100, message = "Consumable for 20 more hours")

            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Connected devices", fontWeight = FontWeight.Bold, fontSize = 28.sp)
                Spacer(modifier = Modifier.height(10.dp))
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                ){
                    itemsIndexed(devices){index, device ->
                        DeviceCard(device = device) {
                            navController.navigate(Routes.DeviceDetailScreen.route + "/${device.id}")
                        }
                        if (index < devices.lastIndex){
                            Divider(color = Color.Gray, thickness = 1.dp)
                        }
                    }
            }
        }
    }
}



