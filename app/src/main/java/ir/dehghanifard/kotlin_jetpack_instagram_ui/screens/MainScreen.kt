package ir.dehghanifard.kotlin_jetpack_instagram_ui.screens
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ir.dehghanifard.kotlin_jetpack_instagram_ui.components.ButtonNavigation
import ir.dehghanifard.kotlin_jetpack_instagram_ui.components.HomeAppBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { HomeAppBar() },
        bottomBar = { ButtonNavigation(navController) }
    ) {
        NavHost(
           modifier = Modifier.padding(it),
           navController = navController,
           startDestination = "home",
        ) {
            composable("home") { HomeScreen() }
            composable("search") { SearchScreen() }
            composable("add") { AddScreen() }
            composable("activities") { ActivityScreen() }
            composable("profile") { ProfileScreen() }
        }
    }
}