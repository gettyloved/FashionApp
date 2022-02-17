package com.ciru.fashionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ciru.fashionapp.ui.theme.FashionAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FashionAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Collections()
                }
            }
        }
    }
}

@Composable
fun Collections() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
            ) {

            Text(
                text = "Collections",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
                )
        }

        LazyColumn(){
            
            item {
                Text(
                    text = "Collections",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(20.dp)
                )
            }
            
            item { 
                LazyRow{
                    items(count = 10){
                        Card (
                            modifier = Modifier
                                .width(150.dp)
                                .height(200.dp)
                                .padding(10.dp, 2.dp, 2.dp, 0.dp)
                                .clip(RoundedCornerShape(10.dp)),
                            elevation = 5.dp)
                        {

                            Column(
                                    modifier = Modifier.padding(5.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center)
                            {

                                Image(
                                        painter = painterResource(id = R.drawable.img_20211110_123336_155),
                                        contentDescription = "model",
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .padding(5.dp)
                                            .size(100.dp)
                                            .clip(CircleShape)
                                    )

                                Spacer(modifier = Modifier.padding(5.dp))

                                Text(
                                    text = "Erico",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(5.dp)
                                )
                            }
                        }
                    }
                }
            }

            item{
                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween)
                {
                    Text(
                        text = "New In",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                    )

                    Text(
                        text = "See All",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        LazyRow(){
            items( count = 10 ){
                Card(
                    modifier = Modifier
                        .width(400.dp)
                        .height(600.dp)
                        .padding(10.dp, 5.dp, 10.dp, 5.dp)
                        .clip(RoundedCornerShape(10.dp)),
                    elevation = 5.dp
                ) {
                    Column(
                        modifier = Modifier.padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eric_dark),
                            contentDescription = "black eric",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(450.dp)
                                .clip(RoundedCornerShape(20.dp)))

                        Row(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(
                            ) {
                                Text(
                                    text = "$60.00",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp
                                )

                                Text(
                                    text = "Hoodie Rose",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.ic_baseline_add_circle_outline_24),
                                contentDescription = "add items",

                                )
                        }

                    }
                }
            }
        }
    }
}






















@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}