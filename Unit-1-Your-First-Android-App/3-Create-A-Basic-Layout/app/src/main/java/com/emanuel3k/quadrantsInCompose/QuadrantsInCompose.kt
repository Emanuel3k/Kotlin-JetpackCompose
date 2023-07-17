package com.emanuel3k.quadrantsInCompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emanuel3k.R
import com.emanuel3k.happyBirthDay.ui.theme.CreateABasicLayoutTheme

@Composable
fun QuadrantsInCompose() {
    Column(Modifier.fillMaxSize()) {
        Row(Modifier.weight(1f)) {
            InfoQuadrantCard(
                title = stringResource(R.string.text_composable),
                description = stringResource(R.string.displays_text_and_follows_material_design_guidelines),
                backgroundColor = Color.Green
            )
            InfoQuadrantCard(
                title = stringResource(R.string.image_composable),
                description = stringResource(R.string.creates_a_composable_that_lays_out_and_draws_a_given_painter_class_object),
                backgroundColor = Color.Yellow
            )
        }
        Row(Modifier.weight(1f)) {
            InfoQuadrantCard(
                title = stringResource(R.string.row_composable),
                description = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_horizontal_sequence),
                backgroundColor = Color.Cyan
            )
            InfoQuadrantCard(
                title = stringResource(R.string.column_composable),
                description = stringResource(R.string.a_layout_composable_that_places_its_children_in_a_vertical_sequence),
                backgroundColor = Color.LightGray
            )
        }
    }
}


@Composable
fun InfoQuadrantCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantsInComposePrev() {
    CreateABasicLayoutTheme {
        QuadrantsInCompose()
    }
}