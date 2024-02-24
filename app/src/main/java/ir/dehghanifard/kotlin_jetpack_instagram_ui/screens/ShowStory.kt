package ir.dehghanifard.kotlin_jetpack_instagram_ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import ir.dehghanifard.kotlin_jetpack_instagram_ui.R
import ir.dehghanifard.kotlin_jetpack_instagram_ui.data.FakeData

@Composable
fun ShowStory(id : Int){
    val storyImage = FakeData.stories.first { s -> s.id == id }.image

    Card(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(0)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(storyImage)
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.loading),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }
}