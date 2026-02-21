package com.example.foodtracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodtracker.R

val GaeguFontFamily = FontFamily(
    Font(R.font.gaegu_light, FontWeight.Normal),
    Font(R.font.gaegu_regular, FontWeight.SemiBold),
    Font(R.font.gaegu_bold, FontWeight.Bold),
)

// 2. Set up the Material 3 Typography Scale
val Typography = Typography(
    // Used for the big "Remaining Calories" number
    displayLarge = TextStyle(
        fontFamily = GaeguFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        lineHeight = 56.sp,
        letterSpacing = (-1).sp,
        color = OnPrimary
    ),

    // Used for screen headers like "Today's Summary"
    headlineLarge = TextStyle(
        fontFamily = GaeguFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 50.sp,
        lineHeight = 40.sp,
        letterSpacing = (-0.5).sp,
        color = OnPrimary
    ),

    // Used for card titles (e.g., "Lunch", "Protein")
    titleMedium = TextStyle(
        fontFamily = GaeguFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 24.sp,
        color = OnPrimary
    ),

    // Used for nutrient labels and small CAPS buttons
    labelMedium = TextStyle(
        fontFamily = GaeguFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 16.sp,
        letterSpacing = (-2).sp,
        color = OnPrimary
    ),

    // Default text for list items or descriptions
    bodyLarge = TextStyle(
        fontFamily = GaeguFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = OnPrimary
    ),

    // Secondary information (e.g., "1,800 kcal goal")
    bodySmall = TextStyle(
        fontFamily = GaeguFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 18.sp,
        color = SecondaryText
    )
)