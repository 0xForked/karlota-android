package id.bakode.karlota.core.designsystem.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = DARK_GREEN200,
    primaryContainer = DARK_GREEN300,
    secondary = GREEN500,
    background = DARK_GREEN300,
    tertiary = WHITE200,
    onTertiary = GRAY200
)

private val LightColorScheme = lightColorScheme(
    primary = GREEN500,
    primaryContainer = GREEN700,
    secondary = GREEN300,
    background = WHITE200,
    tertiary = WHITE200,
    onTertiary = GRAY200
)

private val LightBackgroundTheme = BackgroundTheme(color = Color.White)

private val DarkBackgroundTheme = BackgroundTheme(color = DARK_GREEN300)

@Composable
fun KarlotaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    // val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val backgroundTheme = if (darkTheme) DarkBackgroundTheme else LightBackgroundTheme

    CompositionLocalProvider(
        LocalBackgroundTheme provides backgroundTheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}