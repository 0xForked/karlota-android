package id.bakode.karlota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import id.bakode.karlota.core.designsystem.component.KarlotaBackground
import id.bakode.karlota.core.designsystem.theme.KarlotaTheme
import id.bakode.karlota.ui.KarlotaMain

class LauncherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { KarlotaMain() }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KarlotaTheme {
        KarlotaBackground {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewDark() {
    KarlotaTheme(
        darkTheme =  true,
        dynamicColor = false
    ) {
        KarlotaBackground {
            Greeting("Android")
        }
    }
}