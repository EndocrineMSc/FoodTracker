package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.foodtracker.ui.theme.ColorFat
import com.example.foodtracker.ui.theme.ErrorRed
import com.example.foodtracker.ui.theme.FoodTrackerTheme
import com.example.foodtracker.ui.theme.LightBackground
import com.example.foodtracker.ui.theme.SuccessGreen

data class NutrientDonutState(
    val actual: Float = 0f,
    val target: Float = 2000f,
    val unit: String = "kcal",
    val color: Color = Color.Red,
    val isGoodOverflow: Boolean = true,
    val size: Dp = 125.dp,
) {
    val progress: Float
        get() = if (target > 0) (actual / target).coerceIn(0f, 1f) else 0f

    val isOverLimit: Boolean
        get() = actual >= target
}

@Composable
fun NutrientDonut(
    modifier: Modifier = Modifier,
    state: NutrientDonutState = NutrientDonutState()
) {
    // 1. Determine the "Status Color" based on overflow logic
    val statusColor by animateColorAsState(
        targetValue = when {
            !state.isOverLimit -> LightBackground// Neutral border when under
            state.isGoodOverflow -> SuccessGreen // Green if over Protein/Fiber
            else -> ErrorRed // Red if over Calories/Fat
        },
        animationSpec = tween(500),
        label = "StatusColor"
    )

    // 2. Animate the progress stroke
    val animatedProgress by animateFloatAsState(
        targetValue = state.progress,
        animationSpec = tween(1000),
        label = "Progress"
    )

    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.size(state.size)
    ) {
        Canvas(modifier = Modifier.size(state.size)) {
            val strokeWidth = 12.dp.toPx()
            val borderStrokeWidth = 2.dp.toPx()

            // A. Draw Background Track (Light version of the nutrient color)
            drawArc(
                color = state.color.copy(alpha = 0.15f),
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
            )

            // B. Draw Main Progress
            drawArc(
                color = state.color,
                startAngle = -90f,
                sweepAngle = 360f * animatedProgress,
                useCenter = false,
                style = Stroke(width = strokeWidth, cap = StrokeCap.Round)
            )

            // C. Draw the Outer "Status Border"
            // This is a thin ring that changes color when the goal is reached
            drawArc(
                color = statusColor,
                startAngle = 0f,
                sweepAngle = 360f,
                useCenter = false,
                style = Stroke(width = borderStrokeWidth),
                // Slightly larger than the main donut to act as an outline
                size = size.copy(
                    width = size.width + 16.dp.toPx(),
                    height = size.height + 16.dp.toPx()
                ),
                topLeft = androidx.compose.ui.geometry.Offset(-8.dp.toPx(), -8.dp.toPx())
            )
        }

        val actualText = state.actual.toInt().toString()
        val targetText = state.target.toInt().toString()
        val percentage = (state.actual / state.target * 100).toInt().toString()

        // D. Center Text Labels
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "$actualText / $targetText ${state.unit}",
                style = typography.labelMedium
            )
            Text(
                text = "$percentage%",
                style = typography.labelMedium
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DonutPreview() {
    val state = NutrientDonutState(
        actual = 1000f,
        target = 1000f,
        color = ColorFat,
        isGoodOverflow = true
    )

    FoodTrackerTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            NutrientDonut(modifier = Modifier, state = state)
        }
    }
}