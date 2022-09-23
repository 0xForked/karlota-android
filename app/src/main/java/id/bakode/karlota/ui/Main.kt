package id.bakode.karlota.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import id.bakode.karlota.core.designsystem.component.KarlotaBackground
import id.bakode.karlota.core.designsystem.theme.KarlotaTheme

@Composable
fun KarlotaMain() {
    KarlotaTheme {
        // val navHostController = rememberNavController()

        LaunchedEffect(Unit) {
            // composeNavigator.handleNavigationCommands(navHostController)
        }

        KarlotaBackground {
            // WhatsAppNavHost(
            //    navHostController = navHostController,
            //    composeNavigator = composeNavigator
            // )
        }
    }
}