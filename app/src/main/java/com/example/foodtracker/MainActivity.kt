package com.example.foodtracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.foodtracker.tracker.presentation.dashboard.DashboardPreview
import com.example.foodtracker.ui.theme.FoodTrackerTheme

class MainActivity : ComponentActivity() {
    val colorScheme @Composable get() = MaterialTheme.colorScheme

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodTrackerTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorScheme.background)
                ) { innerPadding ->
                    DashboardPreview(Modifier.padding(innerPadding))
                }
            }
        }
    }
}