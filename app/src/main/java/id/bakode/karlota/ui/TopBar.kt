package id.bakode.karlota.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.bakode.karlota.R
import id.bakode.karlota.core.designsystem.icon.KarlotaIcons
import id.bakode.karlota.core.designsystem.theme.KarlotaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KarlotaTopBar() {
    SmallTopAppBar(
        modifier = Modifier.fillMaxWidth(),
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                color = MaterialTheme.colorScheme.tertiary,
                style = MaterialTheme.typography.titleLarge
            )
        },
        actions = {
            Icon(
                modifier = Modifier.size(26.dp),
                imageVector = KarlotaIcons.Search,
                tint = MaterialTheme.colorScheme.tertiary,
                contentDescription = null
            )

            Spacer(modifier = Modifier.size(16.dp))

            Icon(
                modifier = Modifier.size(26.dp),
                imageVector = KarlotaIcons.MoreVert,
                tint = MaterialTheme.colorScheme.tertiary,
                contentDescription = null
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
}

@Preview
@Composable
private fun KarlotaTopBarPreview() {
    KarlotaTheme {
        KarlotaTopBar()
    }
}

@Preview
@Composable
private fun KarlotaTopBarDarkPreview() {
    KarlotaTheme(darkTheme = true) {
        KarlotaTopBar()
    }
}