package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodtracker.ui.theme.ColorCalories
import com.example.foodtracker.ui.theme.ColorCarbs
import com.example.foodtracker.ui.theme.ColorFat
import com.example.foodtracker.ui.theme.ColorFiber
import com.example.foodtracker.ui.theme.ColorProtein
import com.example.foodtracker.ui.theme.FoodTrackerTheme

@Preview(showBackground = true)
@Composable
fun DashboardPreview(modifier: Modifier = Modifier) {
    val state = DashboardState(
        caloricState = DashboardBarState(
            name = "Kalorien",
            unit = "kcal",
            actual = 1450f,
            target = 2000f,
            isGoodOverflow = false,
            color = ColorCalories
        ),
        proteinState = DashboardBarState(
            name = "Protein",
            unit = "g",
            actual = 85f,
            target = 120f,
            color = ColorProtein
        ),
        carbState = DashboardBarState(
            name = "Kohlenhydrate",
            unit = "g",
            actual = 180f,
            target = 250f,
            color = ColorCarbs
        ),
        fatState = DashboardBarState(
            name = "Fette",
            unit = "g",
            actual = 45f,
            target = 70f,
            isGoodOverflow = false,
            color = ColorFat
        ),
        fiberState = DashboardBarState(
            name = "Ballaststoffe",
            unit = "g",
            actual = 18f,
            target = 30f,
            color = ColorFiber
        )
    )

    FoodTrackerTheme {
        Dashboard(modifier = modifier, state = state)
    }
}