package com.emanuel3k.learnTogether

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emanuel3k.R
import com.emanuel3k.happyBirthDay.ui.theme.CreateABasicLayoutTheme


@Composable
fun LearnTogether(title: String, resume: String, body: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box {
            Image(painter = image, contentDescription = null)
        }
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = resume,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun BirthdayCardPreview() {
    CreateABasicLayoutTheme {
        LearnTogether(
            title = stringResource(R.string.LearnTogether_title),
            resume = stringResource(R.string.LearnTogether_resume),
            body = stringResource(R.string.LearnTogether_body),
        )
    }
}