package com.josuerdx.semana6

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.josuerdx.semana6.ui.theme.Screens.AccountScreen
import com.josuerdx.semana6.ui.theme.Screens.InfoScreen
import com.josuerdx.semana6.ui.theme.Screens.NotificationsScreen
import com.josuerdx.semana6.ui.theme.Screens.ProfileScreen
import com.josuerdx.semana6.ui.theme.Screens.SettingsScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            CustomScaffold(navController)
        }
        composable("profile") {
            ProfileScreen()
        }
        composable("account") {
            AccountScreen()
        }
        composable("info") {
            InfoScreen()
        }
        composable("notifications") {
            NotificationsScreen()
        }
        composable("settings") {
            SettingsScreen()
        }
    }
}