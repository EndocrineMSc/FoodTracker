package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.ui.unit.dp
import com.example.foodtracker.ui.theme.ColorCarbs
import com.example.foodtracker.ui.theme.ColorFat
import com.example.foodtracker.ui.theme.ColorFiber
import com.example.foodtracker.ui.theme.ColorProtein

data class DashboardState(
    val caloricState: NutrientDonutState = NutrientDonutState(isGoodOverflow = false),
    val proteinState: NutrientDonutState = NutrientDonutState(
        unit = "g",
        color = ColorProtein,
        size = 50.dp
    ),
    val carbState: NutrientDonutState = NutrientDonutState(
        unit = "g",
        color = ColorCarbs
    ),
    val fatState: NutrientDonutState = NutrientDonutState(
        unit = "g",
        isGoodOverflow = false,
        color = ColorFat
    ),
    val fiberState: NutrientDonutState = NutrientDonutState(
        unit = "g",
        color = ColorFiber
    ),
)