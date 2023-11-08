package com.on.myjet.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.on.myjet.ModelView
import com.on.myjet.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, modelView: ModelView) {

    val focusRequester = remember { FocusRequester() }
    var counter = 5
    val image =
        rememberImagePainter(data = "https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png")
    val painter =
        rememberImagePainter(data = "https://images.unsplash.com/photo-1628373383885-4be0bc0172fa?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1301&q=80")

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "${modelView.count.value}", style = TextStyle(fontSize = 200.sp, color = Color.DarkGray))
        Button(onClick = { modelView.increment() }) { Text(text = "PLUS") }
        Button(onClick = { modelView.decrement() }) { Text(text = "MINUS") }
    }


}


//HorizontalPager(
//pageCount = 4
//) { pageIndex ->
//    Box(
//        modifier = Modifier
//            .padding(start = 20.dp, end = 12.dp, top = 8.dp, bottom = 8.dp)
//            .background(Color.LightGray)
//            .fillMaxSize(),
//    ) {
//        Column {
//            Image(
//                painter = image,
//                contentDescription = "Forest Image",
//                modifier = Modifier.fillMaxSize(),
//                contentScale = ContentScale.Crop
//            )
//            Icon(
//                Icons.Rounded.ShoppingCart,
//                contentDescription = stringResource(id = R.string.app_name),
//                modifier = Modifier.size(148.dp)
//            )
//            Spacer(modifier = Modifier
//                .height(160.dp)
//                .width(120.dp))
//            Size(width = 102F, height = 102F)
//            Text(text = "$pageIndex", style = MaterialTheme.typography.headlineLarge)
//        }
//    }
//
//}