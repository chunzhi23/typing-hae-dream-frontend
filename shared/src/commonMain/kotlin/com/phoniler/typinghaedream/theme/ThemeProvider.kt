package com.phoniler.typinghaedream.theme

import androidx.compose.ui.graphics.Color

fun getThemeColors(isDarkTheme: Boolean): ThemeColors {
    val blackColor = Color(0xFF000000)
    val whiteColor = Color(0xFFFFFFFF)
    val regionEditorColor = Color(0xFF000000)
    val selectedColor = Color(0xFF94A8D0)
    val dangerColor = Color(0xFFDC143C)
    val approvedColor = Color(0xFF039487)

    return if (isDarkTheme) {
        ThemeColors(
            primaryColor = Color(0xFF6200EE),
            onPrimaryColor = Color(0xFFFFFFFF),
            secondaryColor = Color(0xFF98A0CA),
            onSecondaryColor = Color(0xFF000000),
            primaryTextColor = Color(0xFF6672B0),
            backgroundColor = Color(0xFF232323),
            textColor = Color(0xFFFFFFFF),
            descColor = Color(0xFF9D9D9D),
            strokeColor = Color(0xFFBBBBBB),
            dividerColor = Color(0xFF5C5C5C),
            regionColor = Color(0xFF2E2E2E),
            blackColor = blackColor,
            whiteColor = whiteColor,
            regionEditorColor = regionEditorColor,
            selectedColor = selectedColor,
            dangerColor = dangerColor,
            approvedColor = approvedColor
        )
    } else {
        ThemeColors(
            primaryColor = Color(0xFFBB86FC),
            onPrimaryColor = Color(0xFFFFFFFF),
            secondaryColor = Color(0xFFDEE2F2),
            onSecondaryColor = Color(0xFF000000),
            primaryTextColor = Color(0xFF4C5897),
            backgroundColor = Color(0xFFFFFFFF),
            textColor = Color(0xFF000000),
            descColor = Color(0xFF909090),
            strokeColor = Color(0xFF555555),
            dividerColor = Color(0xFF9D9D9D),
            regionColor = Color(0xFFF0F0F0),
            blackColor = blackColor,
            whiteColor = whiteColor,
            regionEditorColor = regionEditorColor,
            selectedColor = selectedColor,
            dangerColor = dangerColor,
            approvedColor = approvedColor
        )
    }
}
