package com.josuerdx.semana6.ui.theme.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen() {
    var isDarkMode by rememberSaveable { mutableStateOf(false) }
    var selectedLanguage by rememberSaveable { mutableStateOf("Español") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Título general
        Text(
            text = "Configuraciones",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Opción del modo oscuro
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Modo Oscuro", fontSize = 18.sp)
            Switch(
                checked = isDarkMode,
                onCheckedChange = { isDarkMode = it }
            )
        }

        // Selección de idioma
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Seleccionar Idioma", fontSize = 18.sp, modifier = Modifier.padding(bottom = 8.dp))

            LanguageButton(selectedLanguage, "Español") { selectedLanguage = "Español" }
            LanguageButton(selectedLanguage, "Inglés") { selectedLanguage = "Inglés" }
            LanguageButton(selectedLanguage, "Francés") { selectedLanguage = "Francés" }
            LanguageButton(selectedLanguage, "Alemán") { selectedLanguage = "Alemán" }
        }
    }
}

@Composable
fun LanguageButton(selectedLanguage: String, language: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (selectedLanguage == language) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onPrimaryContainer
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Text(text = language, fontSize = 16.sp, color = MaterialTheme.colorScheme.onPrimary)
    }
}
