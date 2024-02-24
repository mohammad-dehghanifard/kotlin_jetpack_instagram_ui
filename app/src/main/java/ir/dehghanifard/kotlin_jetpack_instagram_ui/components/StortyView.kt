package ir.dehghanifard.kotlin_jetpack_instagram_ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import ir.dehghanifard.kotlin_jetpack_instagram_ui.R
import ir.dehghanifard.kotlin_jetpack_instagram_ui.model.Story
import ir.dehghanifard.kotlin_jetpack_instagram_ui.ui.theme.Purple80
import ir.dehghanifard.kotlin_jetpack_instagram_ui.ui.theme.RedColor

@Composable
fun  StoryViw(storyList : ArrayList<Story> ) {
    LazyRow(
        modifier = Modifier.padding(10.dp)
    ){
        items(storyList.size) { index -> StoryItem(story = storyList[index]) }
    }
}

@Composable
fun StoryItem(story: Story) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        // user image
        Box(
            modifier = Modifier
                .size(90.dp)
                .padding(8.dp)
        ) {
            Card(
                shape = RoundedCornerShape(50),
                border = BorderStroke(width = 2.dp, color = if(story.isLive) RedColor else Purple80)
            ) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(story.image)
                        .crossfade(true)
                        .build(),
                    placeholder = painterResource(R.drawable.loading),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clip(CircleShape)
                )
            }


        }

        Text(text = story.username, fontSize = 12.sp)
    }
}