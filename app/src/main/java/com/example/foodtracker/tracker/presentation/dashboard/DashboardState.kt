package com.example.foodtracker.tracker.presentation.dashboard

import com.example.foodtracker.ui.theme.ColorCalcium
import com.example.foodtracker.ui.theme.ColorCarbs
import com.example.foodtracker.ui.theme.ColorFat
import com.example.foodtracker.ui.theme.ColorFiber
import com.example.foodtracker.ui.theme.ColorIron
import com.example.foodtracker.ui.theme.ColorMagnesium
import com.example.foodtracker.ui.theme.ColorPotassium
import com.example.foodtracker.ui.theme.ColorProtein
import com.example.foodtracker.ui.theme.ColorSodium
import com.example.foodtracker.ui.theme.ColorTraceElement
import com.example.foodtracker.ui.theme.ColorVitaminFatSoluble
import com.example.foodtracker.ui.theme.ColorVitaminWaterSoluble
import com.example.foodtracker.ui.theme.ColorZinc

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
    val vitaminB12State: DashboardBarState = DashboardBarState(
        name = "Vitamin B12",
        unit = "µg",
        color = ColorVitaminWaterSoluble
    ),
    val vitaminAState: DashboardBarState = DashboardBarState(
        name = "Vitamin A",
        unit = "µg",
        color = ColorVitaminFatSoluble
    ),
    val vitaminCState: DashboardBarState = DashboardBarState(
        name = "Vitamin C",
        unit = "mg",
        color = ColorVitaminWaterSoluble
    ),
    val vitaminDState: DashboardBarState = DashboardBarState(
        name = "Vitamin D",
        unit = "µg",
        color = ColorVitaminFatSoluble
    ),
    val vitaminEState: DashboardBarState = DashboardBarState(
        name = "Vitamin E",
        unit = "mg",
        color = ColorVitaminFatSoluble
    ),
    val vitaminKState: DashboardBarState = DashboardBarState(
        name = "Vitamin K",
        unit = "µg",
        color = ColorVitaminFatSoluble
    ),
    val vitaminB1State: DashboardBarState = DashboardBarState(
        name = "Vitamin B1",
        unit = "mg",
        color = ColorVitaminWaterSoluble
    ),
    val vitaminB2State: DashboardBarState = DashboardBarState(
        name = "Vitamin B2",
        unit = "mg",
        color = ColorVitaminWaterSoluble
    ),
    val vitaminB3State: DashboardBarState = DashboardBarState(
        name = "Vitamin B3",
        unit = "mg",
        color = ColorVitaminWaterSoluble
    ),
    val vitaminB5State: DashboardBarState = DashboardBarState(
        name = "Vitamin B5",
        unit = "mg",
        color = ColorVitaminWaterSoluble
    ),
    val vitaminB6State: DashboardBarState = DashboardBarState(
        name = "Vitamin B6",
        unit = "mg",
        color = ColorVitaminWaterSoluble
    ),
    val folateState: DashboardBarState = DashboardBarState(
        name = "Folat",
        unit = "µg",
        color = ColorTraceElement
    ),
    val magnesiumState: DashboardBarState = DashboardBarState(
        name = "Magnesium",
        unit = "mg",
        color = ColorMagnesium
    ),
    val calciumState: DashboardBarState = DashboardBarState(
        name = "Kalzium",
        unit = "mg",
        color = ColorCalcium
    ),
    val potassiumState: DashboardBarState = DashboardBarState(
        name = "Kalium",
        unit = "mg",
        color = ColorPotassium
    ),
    val sodiumState: DashboardBarState = DashboardBarState(
        name = "Natrium",
        unit = "mg",
        color = ColorSodium,
        isGoodOverflow = false
    ),
    val ironState: DashboardBarState = DashboardBarState(
        name = "Eisen",
        unit = "mg",
        color = ColorIron
    ),
    val zincState: DashboardBarState = DashboardBarState(
        name = "Zink",
        unit = "mg",
        color = ColorZinc
    ),
    val copperState: DashboardBarState = DashboardBarState(
        name = "Kupfer",
        unit = "mg",
        actual = 20f,
        target = 10f,
        color = ColorTraceElement
    ),
    val manganeseState: DashboardBarState = DashboardBarState(
        name = "Mangan",
        unit = "mg",
        color = ColorTraceElement
    ),
    val seleniumState: DashboardBarState = DashboardBarState(
        name = "Selen",
        unit = "µg",
        color = ColorTraceElement
    ),
    val iodineState: DashboardBarState = DashboardBarState(
        name = "Jod",
        unit = "µg",
        color = ColorTraceElement
    ),
)