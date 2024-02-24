package ir.dehghanifard.kotlin_jetpack_instagram_ui.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import ir.dehghanifard.kotlin_jetpack_instagram_ui.utils.NavItem

@Composable
fun ButtonNavigation(navController: NavHostController) {

    val menu = listOf(
        NavItem.Home,
        NavItem.Search,
        NavItem.Add,
        NavItem.Activity,
        NavItem.Profile,
    )
    var selectedRoute by remember { mutableStateOf("home") }
    BottomAppBar {
        menu.forEach {
            NavigationBarItem(
                selected = selectedRoute == it.route,
                onClick = {
                    navController.navigate(it.route) {
                        selectedRoute = it.route
                        navController.graph.startDestinationRoute?.let{route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }

                },
                icon = {
                    Icon(painterResource(id = it.icon), contentDescription = null)
                })
        }
    }
}