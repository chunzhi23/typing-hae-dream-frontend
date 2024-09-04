package com.phoniler.typinghaedream

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.phoniler.typinghaedream.theme.ThemeColors
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun App(themeColors: ThemeColors) {
    Box(
        modifier =
            Modifier
                .fillMaxSize()
                .background(themeColors.backgroundColor)
    ) {
        Text(
            text = "Hello, Multiplatform!",
            color = themeColors.textColor,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
