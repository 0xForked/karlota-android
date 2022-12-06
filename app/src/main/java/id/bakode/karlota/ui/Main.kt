package id.bakode.karlota.ui

import androidx.compose.runtime.Composable
import id.bakode.karlota.LauncherContent
import id.bakode.karlota.core.designsystem.component.KarlotaBackground
import id.bakode.karlota.core.designsystem.theme.KarlotaTheme

@Composable
fun KarlotaMain() {
    KarlotaTheme {
        KarlotaBackground {
            LauncherContent()
        }
    }
}