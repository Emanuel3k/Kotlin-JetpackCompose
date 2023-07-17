package com.emanuel3k.businessCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emanuel3k.R
import com.emanuel3k.happyBirthDay.ui.theme.CreateABasicLayoutTheme


@Composable
fun BusinessCard(
    modifier: Modifier = Modifier,
    name: String,
    title: String,
    number: String,
    socialMedia: String,
    email: String
) {
    val image = painterResource(id = R.drawable.profile_picture)
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(150.dp)
                .clip(shape = CircleShape)
                .border(width = 2.dp, shape = CircleShape, color = Color.LightGray)
        )
        Text(text = name, fontWeight = FontWeight.Bold, fontSize = 24.sp)
        Text(text = title, textDecoration = TextDecoration.Underline, fontSize = 18.sp)

        Spacer(modifier = Modifier.size(75.dp))

        Row {
            Icon(imageVector = Icons.Default.Call, contentDescription = null)
            Text(
                text = " (${
                    number.substring(
                        0, 2
                    )
                }) ${
                    number.substring(
                        2, 6
                    )
                } - ${
                    number.substring(
                        6,
                        10
                    )
                }",
            )
        }
        Row {
            Icon(imageVector = Icons.Default.Person, contentDescription = null)
            Text(text = " @$socialMedia")
        }
        Row {
            Icon(imageVector = Icons.Default.Email, contentDescription = null)
            Text(text = " $email")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPrev() {
    CreateABasicLayoutTheme {
        BusinessCard(
            name = "Emanuel Santos",
            title = "Android Developer",
            number = "11951575265",
            socialMedia = "_Emanuel3k",
            email = "emanuelsantos_677@hotmail.com"
        )
    }
}