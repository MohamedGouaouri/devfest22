package com.example.findmeadoctor.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.findmeadoctor.domain.model.Device
import com.example.findmeadoctor.domain.model.DeviceState

@Composable
fun DeviceCard(
    device: Device,
    onClick: () -> Unit,
) {

    val context = LocalContext.current

    Row(modifier = Modifier
        .padding(vertical = 5.dp)
        .clickable {
            onClick()
        }
        ,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier
            .height(28.dp)
            .width(28.dp)
            .clip(CircleShape)
            .background(color = if (device.state == DeviceState.ON) Color.Green else Color.Gray)

        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = device.name)

//        Image(painter = , contentDescription = "")
    }
}