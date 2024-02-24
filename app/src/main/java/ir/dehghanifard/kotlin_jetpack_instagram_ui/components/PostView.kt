package ir.dehghanifard.kotlin_jetpack_instagram_ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import ir.dehghanifard.kotlin_jetpack_instagram_ui.R
import ir.dehghanifard.kotlin_jetpack_instagram_ui.model.Post
import ir.dehghanifard.kotlin_jetpack_instagram_ui.ui.theme.RedColor

@Composable
 fun PostView(posts : ArrayList<Post>){
     LazyColumn(modifier = Modifier.padding(horizontal = 10.dp)) {
         items(posts.size) { index -> PostItem(post = posts[index])}
     }
 }

@Composable
fun PostItem(post: Post){
    var liked by remember { mutableStateOf(false) }
    Column {
        // user header
        Row {
            // user image
            Card(
                modifier = Modifier.size(60.dp),
                shape = RoundedCornerShape(12)
            ){
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(post.user.image)
                        .crossfade(true)
                        .build(),
                    placeholder = painterResource(R.drawable.loading),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            // full name and location
            Column(modifier = Modifier.weight(1f), verticalArrangement = Arrangement.Center) {
                Text(text = post.user.fullName, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = post.location,
                    fontSize = 12.sp,
                    color = if(isSystemInDarkTheme()) Color.White else Color.LightGray
                )
            }
            IconButton(onClick = {}) {
                Icon(Icons.Filled.MoreVert, contentDescription = null )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        // post image
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(8.dp)
            ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(post.image)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.loading),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        // like and share button
        Row{
            IconButton(
                onClick = { liked = !liked }
            ) {
                Icon(
                    if (liked) Icons.Outlined.Favorite else Icons.Outlined.FavoriteBorder,
                    modifier = Modifier.size(28.dp),
                    tint = if(liked) RedColor else Color.Black,
                    contentDescription = null )
            }
            Spacer(modifier = Modifier.width(4.dp))
            IconButton(onClick = {}) {
                Icon(
                    Icons.Filled.Send,
                    modifier = Modifier.size(28.dp),
                    contentDescription = null )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = post.caption, textAlign = TextAlign.Justify)
        Spacer(modifier = Modifier.height(32.dp))
    }
}