package ir.dehghanifard.kotlin_jetpack_instagram_ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import ir.dehghanifard.kotlin_jetpack_instagram_ui.components.PostView
import ir.dehghanifard.kotlin_jetpack_instagram_ui.components.StoryViw
import ir.dehghanifard.kotlin_jetpack_instagram_ui.data.FakeData
import ir.dehghanifard.kotlin_jetpack_instagram_ui.ui.theme.LightGray

@Composable
fun HomeScreen() {
    Column {
        StoryViw(storyList = FakeData.stories)
        Spacer(modifier = Modifier.height(7.dp))
        Divider(color = LightGray, thickness = 1.dp)
        Spacer(modifier = Modifier.height(12.dp))
        PostView(posts = FakeData.posts)
    }
}