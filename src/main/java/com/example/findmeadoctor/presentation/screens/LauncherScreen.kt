package com.example.findmeadoctor.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.findmeadoctor.R
import com.example.findmeadoctor.presentation.ui.theme.LightGreen

@Composable
fun LauncherScreen() {
    return Box(modifier = Modifier
        .fillMaxSize()
        .padding(bottom = 50.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                ,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = R.drawable.undraw_doctors_re_jjho), contentDescription = "", modifier = Modifier
                .height(200.dp)
                .width(200.dp))
            Text(
                text = stringResource(id = R.string.launcher_title),
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            
            Text(
                text = stringResource(id = R.string.launcher_description),
                textAlign = TextAlign.Center
            )

        }
        Box(modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .background(LightGreen)
            .padding(horizontal = 70.dp, vertical = 20.dp)
            .align(Alignment.BottomCenter)

        ){
            Text(text = "Get Started")
        }
    }
}
