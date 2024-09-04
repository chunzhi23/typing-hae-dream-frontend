package com.phoniler.typinghaedream

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import com.phoniler.typinghaedream.theme.getThemeColors

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ThemedApp()
        }
    }
}

@Composable
fun ThemedApp() {
    // Observe the current configuration
    val configuration = LocalConfiguration.current

    // Determine if the system is in dark mode
    val isDarkTheme =
        when (configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK) {
            Configuration.UI_MODE_NIGHT_YES -> true
            Configuration.UI_MODE_NIGHT_NO -> false
            else -> false
        }

    // Get the theme colors based on the current theme
    val themeColors = getThemeColors(isDarkTheme)

    // Use the theme colors
    App(themeColors = themeColors)
}
