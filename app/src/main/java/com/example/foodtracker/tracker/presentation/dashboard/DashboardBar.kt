package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.example.foodtracker.ui.theme.ErrorRed
import com.example.foodtracker.ui.theme.SecondaryText

val colorScheme @Composable get() = MaterialTheme.colorScheme

@Composable
fun DashboardBar(
    modifier: Modifier = Modifier,
    state: DashboardBarState = DashboardBarState()
) {

    val infiniteTransition = rememberInfiniteTransition(label = "shimmer")
    val shimmerOffset by infiniteTransition.animateFloat(
        initialValue = -1000f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 5000

                (-1000f) at 0
                (-900f) at 400
                (-400f) at 800
                1000f at 1200
                1000f at 5000
            },
            repeatMode = RepeatMode.Restart
        ),
        label = "shimmerOffset"
    )

    val isDone = state.progress >= 1f
    val bgColor = if (!state.isOverLimit || state.isGoodOverflow) {
        colorScheme.primaryContainer
    } else {
        ErrorRed
    }
    val fillColor = state.color
    val shimmerColor = colorScheme.onPrimary

    val sheenBrush = Brush.linearGradient(
        colors = listOf(
            fillColor,
            fillColor.copy(alpha = 0.2f),
            shimmerColor.copy(alpha = 0.7f),
            fillColor.copy(alpha = 0.2f),
            fillColor
        ),
        start = Offset(shimmerOffset, 0f),
        end = Offset(shimmerOffset + 300f, 300f)
    )

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (state.name.isNotBlank()) {
            Column(modifier = Modifier.weight(0.3f)) {
                Text(state.name, style = MaterialTheme.typography.labelSmall)
                Spacer(modifier = Modifier.width(8.dp))
            }
        }
        Box(modifier = Modifier.weight(0.8f), contentAlignment = Alignment.Center) {
            Canvas(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(state.height)
            ) {
                val cornerRadius = CornerRadius(size.height / 2, size.height / 2)

                drawRoundRect(
                    color = bgColor,
                    size = size,
                    cornerRadius = cornerRadius
                )

                drawRoundRect(
                    brush = if (isDone) sheenBrush else SolidColor(fillColor),
                    size = Size(size.width * state.progress, size.height),
                    cornerRadius = cornerRadius
                )
            }

            val actual = if (state.target > 100) state.actual.toInt() else state.actual
            val target = if (state.target > 100) state.target.toInt() else state.target

            Text(
                text = "$actual / $target ${state.unit}",
                style = MaterialTheme.typography.labelSmall,
                color = colorScheme.onSecondary
            )
        }
    }
}