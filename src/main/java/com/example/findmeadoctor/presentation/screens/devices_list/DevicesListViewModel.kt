package com.example.findmeadoctor.presentation.screens.devices_list

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.findmeadoctor.domain.model.ConsumptionType
import com.example.findmeadoctor.domain.model.Device
import com.example.findmeadoctor.domain.model.DeviceState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DevicesListViewModel @Inject constructor(): ViewModel() {

    private var _state = mutableStateOf(listOf(
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
    var state = _state


}