package com.josuerdx.semana6.ui.theme.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.josuerdx.semana6.R

@Composable
fun InfoScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Logo de la app
        Image(
            painter = painterResource(id = R.drawable.guante),
            contentDescription = "Logo",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Información de la aplicación
        Text(text = "Versión 1.0.0", fontSize = 20.sp)
        Text(text = "Desarrollador: Rodrigo Apaza", fontSize = 16.sp, lineHeight = 100.sp)


        // Botón para detalles
        Button(onClick = { /* Acción para mostrar más detalles */ }) {
            Text(text = "Acerca de la App")
        }
    }
}
