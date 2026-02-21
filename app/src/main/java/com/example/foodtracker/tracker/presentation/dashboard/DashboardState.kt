package com.example.foodtracker.tracker.presentation.dashboard

import com.example.foodtracker.ui.theme.ColorCarbs
import com.example.foodtracker.ui.theme.ColorFat
import com.example.foodtracker.ui.theme.ColorFiber
import com.example.foodtracker.ui.theme.ColorProtein

data class DashboardState(
    val caloricState: DashboardBarState = DashboardBarState(isGoodOverflow = false),
    val proteinState: DashboardBarState = DashboardBarState(
        name = "Protein",
        unit = "g",
        color = ColorProtein
    ),
    val carbState: DashboardBarState = DashboardBarState(
        name = "Kohlenhydrate",
        unit = "g",
        color = ColorCarbs
    ),
    val fatState: DashboardBarState = DashboardBarState(
        name = "Fette",
        unit = "g",
        isGoodOverflow = false,
        color = ColorFat
    ),
    val fiberState: DashboardBarState = DashboardBarState(
        name = "Ballaststoffe",
        unit = "g",
        color = ColorFiber
    ),
)