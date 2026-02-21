package com.example.foodtracker.tracker.presentation.dashboard

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
            isGoodOverflow = false
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
        ),
        vitaminB12State = DashboardBarState(
            name = "Vitamin B12",
            unit = "µg",
            actual = 1.5f,
            target = 4.0f,
            color = ColorVitaminWaterSoluble
        ),
        vitaminAState = DashboardBarState(
            name = "Vitamin A",
            unit = "µg",
            actual = 400f,
            target = 800f,
            color = ColorVitaminFatSoluble
        ),
        vitaminCState = DashboardBarState(
            name = "Vitamin C",
            unit = "mg",
            actual = 65f,
            target = 110f,
            color = ColorVitaminWaterSoluble
        ),
        vitaminDState = DashboardBarState(
            name = "Vitamin D",
            unit = "µg",
            actual = 5f,
            target = 20f,
            color = ColorVitaminFatSoluble
        ),
        vitaminEState = DashboardBarState(
            name = "Vitamin E",
            unit = "mg",
            actual = 8f,
            target = 12f,
            color = ColorVitaminFatSoluble
        ),
        vitaminKState = DashboardBarState(
            name = "Vitamin K",
            unit = "µg",
            actual = 40f,
            target = 70f,
            color = ColorVitaminFatSoluble
        ),
        vitaminB1State = DashboardBarState(
            name = "Vitamin B1",
            unit = "mg",
            actual = 0.7f,
            target = 1.1f,
            color = ColorVitaminWaterSoluble
        ),
        vitaminB2State = DashboardBarState(
            name = "Vitamin B2",
            unit = "mg",
            actual = 0.9f,
            target = 1.4f,
            color = ColorVitaminWaterSoluble
        ),
        vitaminB3State = DashboardBarState(
            name = "Vitamin B3",
            unit = "mg",
            actual = 10f,
            target = 15f,
            color = ColorVitaminWaterSoluble
        ),
        vitaminB5State = DashboardBarState(
            name = "Vitamin B5",
            unit = "mg",
            actual = 3f,
            target = 6f,
            color = ColorVitaminWaterSoluble
        ),
        vitaminB6State = DashboardBarState(
            name = "Vitamin B6",
            unit = "mg",
            actual = 1.1f,
            target = 1.4f,
            color = ColorVitaminWaterSoluble
        ),
        folateState = DashboardBarState(
            name = "Folat",
            unit = "µg",
            actual = 150f,
            target = 300f,
            color = ColorTraceElement
        ),
        magnesiumState = DashboardBarState(
            name = "Magnesium",
            unit = "mg",
            actual = 210f,
            target = 350f,
            color = ColorMagnesium
        ),
        calciumState = DashboardBarState(
            name = "Kalzium",
            unit = "mg",
            actual = 600f,
            target = 1000f,
            color = ColorCalcium
        ),
        potassiumState = DashboardBarState(
            name = "Kalium",
            unit = "mg",
            actual = 2400f,
            target = 4000f,
            color = ColorPotassium
        ),
        sodiumState = DashboardBarState(
            name = "Natrium",
            unit = "mg",
            actual = 900f,
            target = 1500f,
            color = ColorSodium,
            isGoodOverflow = false
        ),
        ironState = DashboardBarState(
            name = "Eisen",
            unit = "mg",
            actual = 6f,
            target = 14f,
            color = ColorIron
        ),
        zincState = DashboardBarState(
            name = "Zink",
            unit = "mg",
            actual = 10f,
            target = 8f,
            color = ColorZinc
        ),
        copperState = DashboardBarState(
            name = "Kupfer",
            unit = "mg",
            actual = 0.8f,
            target = 1.2f,
            color = ColorTraceElement
        ),
        manganeseState = DashboardBarState(
            name = "Mangan",
            unit = "mg",
            actual = 1.5f,
            target = 2.0f,
            color = ColorTraceElement
        ),
        seleniumState = DashboardBarState(
            name = "Selen",
            unit = "µg",
            actual = 80f,
            target = 70f,
            color = ColorTraceElement
        ),
        iodineState = DashboardBarState(
            name = "Jod",
            unit = "µg",
            actual = 110f,
            target = 200f,
            color = ColorTraceElement
        )
    )

    FoodTrackerTheme {
        Dashboard(modifier = modifier, state = state)
    }
}