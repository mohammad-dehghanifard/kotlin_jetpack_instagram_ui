package ir.dehghanifard.kotlin_jetpack_instagram_ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ir.dehghanifard.kotlin_jetpack_instagram_ui.ui.theme.Purple40

@Preview
@Composable
fun TopBarView() {
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(10.dp)) {

       Text(
           text = "Social Media",
           fontFamily = FontFamily.Cursive,
           fontSize = 22.sp,
           color = if( isSystemInDarkTheme()) Color.White else Purple40,
           modifier = Modifier.weight(1f)
       )

           IconButton(onClick = { /*TODO*/ }) {
               Box(contentAlignment = Alignment.BottomEnd) {
                   Icon(Icons.Filled.Send, contentDescription = null)

                   Card(
                       modifier = Modifier.size(12.dp),
                      shape = RoundedCornerShape(50)
                   ) {
                       Box(modifier = Modifier.fillMaxSize().background(Color.Red), contentAlignment = Alignment.Center) {
                           Text(
                               text = "+9",
                               color = Color.White,
                               fontSize = 8.sp,
                               textAlign = TextAlign.Center,
                           )
                       }
                   }
               }
           }

    }
}