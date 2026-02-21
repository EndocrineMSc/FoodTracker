package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Dashboard(modifier: Modifier = Modifier, state: DashboardState = DashboardState()) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Calories",
            style = typography.headlineLarge
        )
        Spacer(modifier = Modifier.height(20.dp))
        NutrientDonut(state = state.caloricState)
        Spacer(modifier = Modifier.height(50.dp))
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Protein",
                        style = typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    NutrientDonut(state = state.proteinState)
                }



                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Fiber",
                        style = typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    NutrientDonut(state = state.fiberState)
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Fat",
                        style = typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    NutrientDonut(state = state.fatState)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Carbs",
                        style = typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    NutrientDonut(state = state.carbState)
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
    }
}