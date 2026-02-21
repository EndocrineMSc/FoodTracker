package com.example.foodtracker.ui.theme

import androidx.compose.ui.graphics.Color

private object Palette {
    // Oranges (Brand)
    val Orange50 = Color(0xFFFDF6EF)
    val Orange100 = Color(0xFFFBEAD9)
    val Orange200 = Color(0xFFF6D1B2)
    val Orange300 = Color(0xFFF0B281)
    val Orange400 = Color(0xFFEA894D)
    val Orange500 = Color(0xFFE56E31)
    val Orange600 = Color(0xFFD65120)
    val Orange700 = Color(0xFFB13E1D)
    val Orange800 = Color(0xFF8E321E)
    val Orange900 = Color(0xFF722C1C)
    val Orange950 = Color(0xFF3E130C)

    // Teals (Fat - Complementary)
    val Teal50 = Color(0xFFF0FDFA)
    val Teal100 = Color(0xFFCCFBF1)
    val Teal500 = Color(0xFF14B8A6)
    val Teal600 = Color(0xFF0D9488)

    // Ambers (Carbs - Analogous)
    val Amber50 = Color(0xFFFFFBEB)
    val Amber500 = Color(0xFFF59E0B)
    val Amber600 = Color(0xFFD97706)

    // Roses (Protein - Warm Strength)
    val Rose50 = Color(0xFFFFF1F2)
    val Rose500 = Color(0xFFF43F5E)
    val Rose600 = Color(0xFFE11D48)

    // Emeralds (Fiber - Success/Natural)
    val Emerald50 = Color(0xFFECFDF5)
    val Emerald500 = Color(0xFF10B981)
    val Emerald600 = Color(0xFF059669)

    // Blues (Info)
    val Blue500 = Color(0xFF3B82F6)
    val Blue600 = Color(0xFF2563EB)

    // NEW: Violets (Fiber - Distinct from Teal/Green)
    val Violet50 = Color(0xFFF5F3FF)
    val Violet100 = Color(0xFFEDE9FE)
    val Violet500 = Color(0xFF8B5CF6)
    val Violet600 = Color(0xFF7C3AED)

    // Grays (Neutrals)
    val Gray50 = Color(0xFFF9FAFB)
    val Gray100 = Color(0xFFF3F4F6)
    val Gray200 = Color(0xFFE5E7EB)
    val Gray700 = Color(0xFF374151)
    val Gray900 = Color(0xFF111827)
}

// Semantic Colors for Status and Information
val InfoBlue = Palette.Blue500
val SuccessGreen = Palette.Emerald500
val WarningOrange = Palette.Orange400
val ErrorRed = Palette.Rose600

// Accent Colors for Nutritional Data (Tailwind-Mapped)
val ColorCalories = Palette.Orange600
val ColorFat = Palette.Teal500
val ColorCarbs = Palette.Amber500
val ColorProtein = Palette.Rose500
val ColorFiber = Palette.Violet500

// Neutral Colors for Text and Backgrounds
val PrimaryText = Palette.Gray900
val SecondaryText = Palette.Gray200
val LightBackground = Palette.Gray200
val OffwhiteBackground = Palette.Gray50

// Material Colors
val Primary = Palette.Orange600
val Secondary = Palette.Teal600
val OnPrimary = Color.White
val PrimaryContainer = Palette.Orange100
val OnPrimaryContainer = Palette.Orange900
val Surface = Palette.Orange50