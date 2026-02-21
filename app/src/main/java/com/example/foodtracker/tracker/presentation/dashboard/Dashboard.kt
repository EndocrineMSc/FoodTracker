package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.example.foodtracker.core.presentation.AppHeader

@Composable
fun Dashboard(modifier: Modifier = Modifier, state: DashboardState = DashboardState()) {
    Column(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(10.dp, spotColor = colorScheme.onSurface, shape = RoundedCornerShape(10))
                    .background(colorScheme.background, shape = RoundedCornerShape(10))
                    .padding(horizontal = 8.dp, vertical = 6.dp),
            ) {
                DashboardBar(state = state.caloricState)
                Spacer(modifier = Modifier.height(12.dp))

                Spacer(modifier = Modifier.height(8.dp))

                DashboardBar(state = state.proteinState)
                Spacer(modifier = Modifier.height(6.dp))

                DashboardBar(state = state.carbState)
                Spacer(modifier = Modifier.height(6.dp))

                DashboardBar(state = state.fatState)
                Spacer(modifier = Modifier.height(6.dp))

                DashboardBar(state = state.fiberState)
            }

            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}