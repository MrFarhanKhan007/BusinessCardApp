package com.example.businesscardapp

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import java.util.concurrent.TimeoutException

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF082540)
                ) {
                    BusinessCardApp(
                        phonenumber = "+91 1234567899",
                        socialMediaHandle = "@github.com/mrfarhankhan007",
                        emailId = "NoEmail@gmail.com",
                        Name = "Farhan Khan",
                        Designation = "Kotlin Android Developer",
                        androidname = "android"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(
    phonenumber: String, socialMediaHandle: String,
    emailId: String, Name: String, Designation: String, androidname: String
) {
    val androidImage = painterResource(id = R.drawable.android_48px)
    val raleway1 = FontFamily(
        Font(R.font.raleway2)
    )
    val poppins = FontFamily(Font(R.font.poppins))
    Column(
        modifier = Modifier.padding(bottom = 150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Box {
            Text(
                text = androidname,
                fontFamily = poppins,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(top = 100.dp, start = 20.dp)
            )
            Image(
                painter = androidImage,
                contentDescription = null,
                modifier = Modifier.padding(top = 20.dp)
            )

        }
        Text(text = Name, fontSize = 50.sp, color = Color.White, fontFamily = raleway1)
        Text(text = Designation, color = Color(0xFF3DDC84))
    }


    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.padding(start = 50.dp, bottom = 40.dp)
    ) {
        val callImage = painterResource(id = R.drawable.call_48px)
        val shareImage = painterResource(id = R.drawable.share_48px)
        val emailImage = painterResource(id = R.drawable.mail_48px)

        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Image(painter = callImage, contentDescription = null)
            Text(
                text = phonenumber,
                color = Color.White,
                modifier = Modifier.padding(start = 30.dp, top = 3.dp)
            )
        }
        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Image(painter = shareImage, contentDescription = null)
            Text(
                text = socialMediaHandle,
                color = Color.White,
                modifier = Modifier.padding(start = 30.dp, top = 3.dp)
            )
        }
        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Image(painter = emailImage, contentDescription = null)
            Text(
                text = emailId,
                color = Color.White,
                modifier = Modifier.padding(start = 30.dp, top = 3.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardAppTheme {
        Surface() {
            BusinessCardApp(
                phonenumber = "+91 7838069691",
                socialMediaHandle = "@github.com/mrfarhankhan007",
                emailId = "fk95034@gmail.com",
                Name = "Farhan Khan",
                Designation = "Kotlin Android Developer",
                androidname = "android"
            )
        }
    }
}