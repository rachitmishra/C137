package com.rachitmishra.c137.ui.design

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun C137Tab(text: String, selected: Boolean, onClick: () -> Unit) {
    Tab(selected, onClick, selectedContentColor = Color.Red, unselectedContentColor = Color.Gray) {
        Column(
            Modifier
                .padding(0.dp, 8.dp)
                .height(20.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                text = text, style = MaterialTheme.typography.titleSmall, modifier = Modifier.align(Alignment.Start)
            )
        }
    }
}
