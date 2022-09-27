package id.bakode.karlota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.bakode.karlota.core.designsystem.component.KarlotaBackground
import id.bakode.karlota.core.designsystem.theme.KarlotaTheme
import id.bakode.karlota.ui.KarlotaMain

class LauncherActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { KarlotaMain() }
    }

    override fun onStart() {
        super.onStart()
        // TODO:
        // DISPLAY SPLASH SCREE
        // VALIDATE JWT:
        //      IS_EXIST
        //      IS_EXPIRED
        // REDIRECT:
        // !EXIST || EXPIRED -> AUTH FEATURE
        // EXIST && EXPIRED -> AUTH FEATURE
        // EXIST && !EXPIRED -> CHAT FEATURE
        println("HELLO WORLD")
    }
}

@Composable
fun LauncherContent() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = (painterResource(id = R.mipmap.ic_launcher)),
            contentDescription = "BAKODE_LOGO",
            modifier = Modifier
                .requiredSize(125.dp)
                .padding(21.dp),
        )
        Text(
            text = "Karlota Messenger",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.
                    padding(8.dp)
        )
        Text(
            text = "by BAKODE.ID",
            fontWeight = FontWeight.Light,
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KarlotaTheme {
        KarlotaBackground {
            LauncherContent()
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
            LauncherContent()
        }
    }
}