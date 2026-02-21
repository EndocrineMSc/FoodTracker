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
                .background(colorScheme.primaryContainer)
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Text("Makro-Nährstoffe")
            Spacer(modifier = Modifier.height(8.dp))
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

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            Text("Mikro-Nährstoffe")
            Spacer(modifier = Modifier.height(8.dp))

            DashboardBar(state = state.vitaminAState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminCState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminDState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminEState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminB1State)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminB2State)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminB3State)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminB5State)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminB6State)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminB12State)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.vitaminKState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.folateState)

            Spacer(modifier = Modifier.height(8.dp))
            Text("Mikro-Nährstoffe")
            Spacer(modifier = Modifier.height(8.dp))

            DashboardBar(state = state.magnesiumState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.calciumState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.sodiumState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.ironState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.zincState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.copperState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.manganeseState)
            Spacer(modifier = Modifier.height(6.dp))

            DashboardBar(state = state.seleniumState)
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}