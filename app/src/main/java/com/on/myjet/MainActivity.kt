package com.on.myjet

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import coil.compose.rememberImagePainter
import com.on.myjet.ui.Greeting
import com.on.myjet.ui.theme.MyJetTheme

class MainActivity : ComponentActivity() {

    private val modelView by lazy { ViewModelProvider(this)[ModelView::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
                newText()
            }
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun newText() {
    var counter = remember {
        mutableStateOf(0)
    }
    val painter =
        rememberImagePainter(data = "https://images.unsplash.com/photo-1628373383885-4be0bc0172fa?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1301&q=80")
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp).clickable { counter.value++ },
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 20.dp
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                contentScale = ContentScale.Crop,
                painter = painterResource(id = R.drawable.img),
                contentDescription = "image",
                modifier = Modifier
                    .size(84.dp)
                    .padding(12.dp)
                    .clip(CircleShape)
                    .clickable {
                        Log.d("OLOLO", "newText: NewText")
                    }
            )

            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = "Ibrahim",
                    style = TextStyle(fontSize = 28.sp),
                )
                Text(
                    text = counter.value.toString() ,
                    style = TextStyle(fontSize = 20.sp),
                )
            }

        }
    }
}


//MyJetTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Android", modelView = modelView)
//                }
//            }

class ModelView() : ViewModel() {

    private var counter = 0
    val count = mutableStateOf(0)


    fun increment() {
        counter++
        count.value = counter
    }

    fun decrement() {
        counter--
        count.value = counter
    }

}
