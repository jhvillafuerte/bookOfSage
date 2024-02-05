package com.jvcorp.bookofsage

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jvcorp.bookofsage.ui.theme.BookOfSageTheme
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookOfSageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = with (Modifier){
                            fillMaxSize()
                                .paint(
                                    // Replace with your image id
                                    painterResource(id = R.drawable.bookofsage3),
                                    contentScale = ContentScale.FillHeight)

                        })
                    {
                        Spacer(modifier = Modifier.width(8.dp))
                        Column (modifier = Modifier.align(Alignment.Center)) {
                            Image(painter = painterResource(id = R.drawable.bos_main_title),
                                contentDescription = "title")
                            
                            Spacer(modifier = Modifier.height(4.dp))
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = "Enter")
                            }
                        }
                    }
                }
            }
        }
    }
}
