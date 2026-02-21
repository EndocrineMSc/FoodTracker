package com.example.foodtracker.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = OnPrimary,
    primaryContainer = PrimaryContainer,
    onPrimaryContainer = OnPrimaryContainer,
    secondary = Secondary,
    onSecondary = SecondaryText,
    background = LightBackground,
    surfaceBright = OffwhiteBackground,
    surface = Surface,
    onSurface = OnPrimary,
    error = ErrorRed,
    onError = LightBackground
)


@Composable
fun FoodTrackerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}