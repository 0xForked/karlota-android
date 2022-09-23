package id.bakode.karlota.core.designsystem.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import id.bakode.karlota.core.designsystem.R

@Composable
fun KarlotaError() {
    Text(
        modifier = Modifier.fillMaxSize(),
        text = stringResource(id = R.string.message_error),
        color = MaterialTheme.colorScheme.tertiary,
        style = MaterialTheme.typography.bodyLarge
    )
}