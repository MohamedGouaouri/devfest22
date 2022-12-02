package com.example.findmeadoctor.presentation.screens

sealed class Routes(val route: String) {
    object DevicesListScreen : Routes("devices_list_screen")
    object DeviceDetailScreen : Routes("device_details_screen")
}
