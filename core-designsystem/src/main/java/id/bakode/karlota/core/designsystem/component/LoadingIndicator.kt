package id.bakode.karlota.core.designsystem.component

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import id.bakode.karlota.core.designsystem.theme.GREEN450

@Composable
fun KarlotaLoadingIndicator() {
    CircularProgressIndicator(color = GREEN450)
}