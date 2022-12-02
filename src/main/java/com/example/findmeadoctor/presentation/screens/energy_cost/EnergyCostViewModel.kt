package com.example.findmeadoctor.presentation.screens.energy_cost

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.findmeadoctor.domain.model.*
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EnergyCostViewModel @Inject constructor(): ViewModel() {


    val devices = mutableStateOf(listOf(
        Device(
            id = 1,
            name = "TV - SAMSUNG QLED Q60A",
            consumeFrom = ConsumptionType.RESERVE,
            state = DeviceState.ON
        ),
        Device(
            id = 2,
            name = "TV - SAMSUNG QLED Q60A",
            consumeFrom = ConsumptionType.RESERVE,
            state = DeviceState.ON
        ),
        Device(
            id = 3,
            name = "TV - SAMSUNG QLED Q60A",
            consumeFrom = ConsumptionType.RESERVE,
            state = DeviceState.OFF
        )
    ))

    val costs = mutableStateOf(listOf(
        Cost(devices.value[0], 70f),
        Cost(devices.value[1], 50f),
        Cost(devices.value[2], 40f)
    ))
}