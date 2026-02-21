package com.example.foodtracker.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

// Theme.kt
private val LightColorScheme = lightColorScheme(
    primary = PersimmonOrange,
    onPrimary = WhitePure,
    primaryContainer = ApricotSoft,
    onPrimaryContainer = BurntSienna,
    secondary = SageHealth,
    background = LinenWarm,
    surfaceBright = Cream,
    surface = LinenWarm,
    onSurface = DeepCocoa,
    error = EnergyRed,
    onError = WhitePure
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