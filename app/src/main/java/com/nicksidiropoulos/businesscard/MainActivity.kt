package com.nicksidiropoulos.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nicksidiropoulos.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.primary

                ) {
                    Card()
                }
            }
        }
    }
}

@Composable
fun Card(){
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ProfileInfo()
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            InfoLine(emoji = "\uD83D\uDCE7", info = "nick*****@gmail.com")
            InfoLine(emoji = "\uD83D\uDCF1", info = "+30 697821****")
            InfoLine(emoji = "\uD83C\uDF0D", info = "linkedin: @nick-sidiropoulos")
        }


    }
}

@Composable
fun ProfileInfo(){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(25.dp)) {
        Row {
            Image(
                painter = painterResource(R.drawable.profilepic22),
                contentDescription = null,
                Modifier
                    .size(200.dp)
            )
        }
        Row {
            Text(
                text = "Nikolaos Sidiropoulos",
                fontSize = 30.sp
            )
        }
        Row {
            Text(
                text = "Android Software Engineer",
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun InfoLine(emoji: String, info: String) {
    Row {
        Text(
            text = "$emoji  ",fontSize = 20.sp
        )

        Text(
            text = info,fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        Card()
    }
}


