package com.example.foodtracker.core.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.foodtracker.R

val ColorScheme @Composable get() = MaterialTheme.colorScheme

@Composable
fun AppHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(ColorScheme.primaryContainer)
            .padding(16.dp)
    ) {
        Icon(
            painterResource(R.drawable.baseline_menu_24), "Burger Menu"
        )
    }
}