package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class DashboardBarState(
    val actual: Float = 0f,
    val target: Float = 2000f,
    val name: String = "",
    val unit: String = "kcal",
    val color: Color = Color.Red,
    val isGoodOverflow: Boolean = true,
    val height: Dp = 16.dp
) {
    val progress: Float
        get() = if (target > 0) (actual / target).coerceIn(0f, 1f) else 0f

    val isOverLimit: Boolean
        get() = actual > target
}