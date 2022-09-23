package id.bakode.karlota.core.designsystem.icon

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.ui.graphics.vector.ImageVector

object KarlotaIcons {
    val ArrowBack = Icons.Rounded.ArrowBack
    val Search = Icons.Default.Search
    var MoreVert = Icons.Default.MoreVert
    var Call = Icons.Filled.Call
}

sealed class Icon {
    data class ImageVectorIcon(val imageVector: ImageVector) : Icon()
    data class DrawableResourceIcon(@DrawableRes val id: Int) : Icon()
}