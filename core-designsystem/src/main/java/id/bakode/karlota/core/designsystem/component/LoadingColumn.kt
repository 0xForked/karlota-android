package id.bakode.karlota.core.designsystem.component

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.skydoves.landscapist.Shimmer
import id.bakode.karlota.core.designsystem.theme.shimmerHighLight

@Composable
fun KarlotaLoadingColumn(
    itemSize: Int = 10
) {
    LazyColumn {
        items(itemSize) {
            WhatsAppShimmer()
        }
    }
}

@Composable
private fun WhatsAppShimmer() {
    Shimmer(
        modifier = Modifier
            .fillMaxSize()
            .height(75.dp)
            .padding(vertical = 6.dp, horizontal = 12.dp)
            .clip(RoundedCornerShape(8.dp)),
        baseColor = MaterialTheme.colorScheme.background,
        highlightColor = shimmerHighLight,
        durationMillis = 350,
        dropOff = 0.65f,
        tilt = 20f
    )
}