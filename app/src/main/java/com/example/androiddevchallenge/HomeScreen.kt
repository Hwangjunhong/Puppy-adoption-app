package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
fun HomeScreen(onItemClicked: (Puppy) -> Unit) {

    val state = remember { mutableStateOf(puppyList) }

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(vertical = 16.dp, horizontal = 0.dp)
    ) {
        items(state.value) {
            ListItem(
                pet = it,
                modifier = Modifier.padding(horizontal = 16.dp),
                onClick = { onItemClicked.invoke(it) }
            )
        }
    }
}

@Composable
fun ListItem(pet: Puppy, modifier: Modifier = Modifier, onClick: () -> Unit = {}) {

    val cornerShape = RoundedCornerShape(12.dp)

    Card(
        shape = cornerShape,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .clickable(onClick = onClick)
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(pet.puppyImage),
                contentDescription = "Image of ${pet.puppyName}",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .requiredSize(64.dp)
                    .clip(cornerShape)
            )

            Spacer(Modifier.width(16.dp))

            Column(Modifier.weight(1f)) {
                Text(
                    text = pet.puppyName,
                    style = MaterialTheme.typography.h5,
                    color = MaterialTheme.colors.onSurface,
                    maxLines = 1,
                )


                Text(
                    text = "${pet.puppyKind}",
                    maxLines = 1,
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.body2,
                )
            }

            Spacer(Modifier.width(16.dp))

        }
    }
}

@Preview(backgroundColor = 0xFFFFFFFF, showBackground = true)
@Composable
fun PreviewListItem() {
    MyTheme {
        Column(Modifier.fillMaxWidth()) {
            ListItem(pet = puppyList.random(), modifier = Modifier.padding(16.dp))
        }
    }
}

@Preview(backgroundColor = 0xFF121212, showBackground = true)
@Composable
fun PreviewListItemDark() {
    MyTheme(darkTheme = true) {
        Column(Modifier.fillMaxWidth()) {
            ListItem(pet = puppyList.random(), modifier = Modifier.padding(16.dp))
        }
    }
}