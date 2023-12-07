/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.inmd1.deu_wear_app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import com.inmd1.deu_wear_app.R
import com.inmd1.deu_wear_app.presentation.theme.Deu_wear_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WearApp("Android")
        }
    }
}

@Composable
//여기에 수정하면 될듯
fun WearApp(greetingName: String) {
    Deu_wear_appTheme {
        /* If you have enough items in your list, use [ScalingLazyColumn] which is an optimized
         * version of LazyColumn for wear devices with some added features. For more information,
         * see d.android.com/wear/compose.
         */
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Center
        ) {
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "동의대 2.0")
            Spacer(modifier = Modifier.height(10.dp))
            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Button(onClick = { /*TODO*/ }) {

                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { /*TODO*/ }) {

                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Button(onClick = { /*TODO*/ }) {

                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { /*TODO*/ }) {

                }
            }
        }
    }
}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    WearApp("Preview Android")
}