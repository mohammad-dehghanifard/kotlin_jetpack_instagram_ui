package ir.dehghanifard.kotlin_jetpack_instagram_ui.screens
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import ir.dehghanifard.kotlin_jetpack_instagram_ui.components.ButtonNavigation
import ir.dehghanifard.kotlin_jetpack_instagram_ui.components.TopBarView

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    var fullScreen by remember { mutableStateOf(false) }
    Scaffold(
        topBar = { if (!fullScreen) TopBarView() },
        bottomBar = { if (!fullScreen) ButtonNavigation(navController) }
    ) {
        NavHost(
           modifier = Modifier.padding(it),
           navController = navController,
           startDestination = "home",
        ) {
            composable("home") {
                fullScreen = false
                HomeScreen(navController = navController)
            }
            composable("search") {
                fullScreen = false
                SearchScreen() }
            composable("add") {
                fullScreen = false
                AddScreen() }
            composable("activities") {
                fullScreen = false
                ActivityScreen() }
            composable("profile") {
                fullScreen = false
                ProfileScreen() }
            composable("showStory/{id}",
                arguments = listOf( navArgument("id") {type = NavType.IntType} )
            ) { args ->
                fullScreen = true
                ShowStory(id = args.arguments?.getInt("id") ?: 0 ) }
        }
    }
}