package com.example.foodtracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.foodtracker.R

// 1. Define the Family using the files you added to res/font
val OutfitFontFamily = FontFamily(
    Font(R.font.outfit_regular, FontWeight.Normal),
    Font(R.font.outfit_medium, FontWeight.Medium),
    Font(R.font.outfit_semibold, FontWeight.SemiBold),
    Font(R.font.outfit_bold, FontWeight.Bold)
)

// 2. Set up the Material 3 Typography Scale
val Typography = Typography(

    // For large displays like the main calorie number (e.g., "1,450")
    headlineLarge = TextStyle(
        fontFamily = OutfitFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = (-0.5).sp, // Tightened for a premium look
        color = PrimaryText
    ),

    // For Nutrient Names (e.g., "Protein", "Vitamin C")
    titleMedium = TextStyle(
        fontFamily = OutfitFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),

    // For category headers (e.g., "VITAMINE")
    labelMedium = TextStyle(
        fontFamily = OutfitFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp, // Spread out for that "Header" feel
        color = PrimaryText.copy(alpha = 0.6f)
    ),

    // General body text for values (e.g., "85g / 120g")
    bodyLarge = TextStyle(
        fontFamily = OutfitFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        color = PrimaryText
    ),

    // Smaller secondary text
    bodySmall = TextStyle(
        fontFamily = OutfitFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        color = PrimaryText.copy(alpha = 0.7f)
    )
)