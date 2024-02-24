package ir.dehghanifard.kotlin_jetpack_instagram_ui.utils

import ir.dehghanifard.kotlin_jetpack_instagram_ui.R

open class NavItem(route: String, icon: Int, title: String) {
    object Home : NavItem(route = "home", icon = R.drawable.outline_home_24, title = "Home")
    object Search : NavItem(route = "search", icon = R.drawable.search_svgrepo_com, title = "Search")
    object Add : NavItem(route = "add", icon = R.drawable.baseline_add_circle_outline_24, title = "Add")
    object Activity : NavItem(route = "activities", icon = R.drawable.heart_svgrepo_com, title = "Activity")
    object Profile : NavItem(route = "profile", icon = R.drawable.person_svgrepo_com, title = "Profile")
}