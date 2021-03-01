package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.model.puppyList
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DetailScreen(id: Int) {
    val pet = remember { mutableStateOf(puppyList.first { it.puppyId == id }) }

    DetailScreenContent(pet.value)
}

@Composable
private fun DetailScreenContent(pet: Puppy) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 16.dp)
    ) {

        item {
            Box(contentAlignment = Alignment.BottomEnd) {
                Image(
                    painter = painterResource(pet.puppyImage),
                    contentDescription = "Image of ${pet.puppyName}",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                )
            }
        }

        item {
            Text(
                text = pet.puppyName,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(top = 12.dp, bottom = 4.dp)
            )
        }

        item {
            Text(
                text = pet.puppyKind,
                maxLines = 1,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h6,
            )
        }

        item {
            Text(
                text = pet.puppyDescription,
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(top = 16.dp)
            )
        }
    }
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun PreviewDetailScreenContent() {
    MyTheme {
        DetailScreenContent(puppyList.first())
    }
}

@Preview(backgroundColor = 0xFF121212, showBackground = true)
@Composable
fun PreviewDetailScreenContentDark() {
    MyTheme(darkTheme = true) {
        DetailScreenContent(puppyList.first())
    }
}