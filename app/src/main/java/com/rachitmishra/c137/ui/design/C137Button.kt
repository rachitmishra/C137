package com.rachitmishra.c137.ui.design

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.rachitmishra.c137.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun C137ScrollToTop(onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(
        shape = CircleShape, onClick = onClick, elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Icon(
            ImageVector.vectorResource(id = R.drawable.ic_up),
            contentDescription = "Scroll to top",
            modifier = Modifier
                .size(36.dp)
                .background(Color.White),
            tint = Color.Gray
        )
    }
}
