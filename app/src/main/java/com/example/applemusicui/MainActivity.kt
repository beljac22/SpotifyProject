package com.example.applemusicui

import android.os.Bundle
import androidx.compose.ui.text.font.FontWeight
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.applemusicui.ui.theme.AppleMusicUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppleMusicUITheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFF87631B))
                            .padding(innerPadding),


                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "All My Heroes Are Cornballs",
                                modifier = Modifier.align(Alignment.TopCenter),
                                color = Color.White,
                                fontSize = 13.sp
                            )
                            Text(
                                text = "          \u2572\u2571",
                                modifier = Modifier.align(Alignment.TopStart),
                                color = Color.White,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "...          ",
                                modifier = Modifier.align(Alignment.TopEnd),
                                color = Color.White,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Image(
                                painter = painterResource(id = R.drawable.jpegmafia),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(330.dp)
                                    .height(330.dp)
                            )
                        }


                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                        ) {
                            Text(
                                text = "     Kenan Vs. Kel ",
                                modifier = Modifier.align(Alignment.TopStart),
                                color = Color.White,
                                fontSize = 30.sp,
                                fontWeight  = FontWeight.Bold
                            )
                            Text(
                                text = "0:01                                                                           -2:59",
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .offset(y = (-90).dp),
                                color = Color.White,
                                fontSize = 13.sp )
                            Text(
                                text = "\n\n         \uD83C\uDD74 JPEGMAFIA",
                                modifier = Modifier.align(Alignment.TopStart),
                                color = Color.Gray,
                                fontSize = 15.sp,
                                fontWeight  = FontWeight.Bold
                            )
                            var sliderPosition by remember { mutableStateOf(0f) }

                            Slider(
                                value = sliderPosition,
                                onValueChange = { sliderPosition = it },
                                valueRange = 0f..100f,
                                modifier = Modifier
                                    .fillMaxWidth(0.80f)
                                    .align(Alignment.Center)
                                    .offset(y = (-110).dp)
                            )

                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .padding(8.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.check_mark),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .width(30.dp)
                                        .height(30.dp)
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.button_spread),
                                contentDescription = null,
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .offset(y=(-30).dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.button_spread),
                                contentDescription = null,
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .offset(y=(-30).dp)
                            )

                            Image(
                                painter = painterResource(id = R.drawable.bottom_buttons),
                                contentDescription = null,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .offset(y=(-30).dp)
                            )
                            Text(
                                text = "         Jack Bellgowan's Audi A4",
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .offset(y=(-36).dp),
                                color = Color(0xFF1DB954),
                                fontSize = 15.sp,
                                fontWeight  = FontWeight.Bold
                            )



                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppleMusicUITheme {
        Greeting("Android")
    }
}