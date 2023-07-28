package com.emanuel3k.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emanuel3k.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {

    var action by remember { mutableStateOf(1) }



    Surface(
        modifier = modifier.fillMaxWidth(),
        shadowElevation = 10.dp,
        color = Color.Black
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        when (action) {
            1 -> {
                TitleAndDescription(
                    drawable = R.drawable.akaliprofile,
                    title = R.string.akali_a_assassina_renegada,
                    description = R.string.akali_description,
                    previous = {
                        action = 3
                    },
                    next = {
                        action = 2
                    }
                )
            }

            2 -> {
                TitleAndDescription(
                    drawable = R.drawable.yorickprofile,
                    title = R.string.yorick_o_pastor_de_almas,
                    description = R.string.yorick_description,
                    previous = {
                        action = 1
                    },
                    next = {
                        action = 3
                    }
                )
            }

            3 -> {
                TitleAndDescription(
                    drawable = R.drawable.azirprofile,
                    title = R.string.azir_o_imperador_das_areias,
                    description = R.string.azir_description,
                    previous = {
                        action = 2
                    },
                    next = {
                        action = 1
                    }
                )
            }
        }
    }
}


@Composable
fun TitleAndDescription(
    modifier: Modifier = Modifier,
    drawable: Int,
    title: Int,
    description: Int,
    previous: () -> Unit,
    next: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            modifier = modifier
                .padding(18.dp)
                .border(5.dp, Color.Gray),
            painter = painterResource(id = drawable),
            contentDescription = "Image profile"
        )

        Text(
            text = stringResource(id = title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline,
            modifier = modifier.padding(horizontal = 15.dp)
        )

        Spacer(modifier = modifier.height(24.dp))

        Text(
            text = stringResource(id = description),
            textAlign = TextAlign.Justify,
            fontSize = 17.sp,
            modifier = modifier.padding(horizontal = 15.dp)
        )

        Spacer(modifier = modifier.height(24.dp))

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            ButtonActions(label = "Previous", onClick = previous)
            ButtonActions(label = "Next", onClick = next)
        }
    }
}

@Composable
fun ButtonActions(
    modifier: Modifier = Modifier,
    label: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .padding(horizontal = 10.dp)
            .size(width = 120.dp, height = 50.dp),
        colors = ButtonDefaults.buttonColors(Color.Black)
    ) {
        Text(
            text = label,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            color = Color.White
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ArtSpacePreview() {
    ArtSpaceTheme {
        HomeScreen()
    }
}