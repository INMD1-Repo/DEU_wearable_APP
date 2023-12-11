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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.inmd1.deu_wear_app.presentation.UI.StartPage
import com.inmd1.deu_wear_app.presentation.theme.Deu_wear_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Deu_wear_appTheme() {
                var navController = rememberSwipeDismissableNavController()
                SwipeDismissableNavHost(navController = navController, startDestination = "main_page"){
                    composable("main_page"){
                        WearApp(navController = navController )
                    }

                    composable("start_page"){
                        StartPage(navController = navController)
                    }
                }
            }
        }
    }
}

@Composable
//여기에 수정하면 될듯
fun WearApp(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.padding(25.dp)) {
            Text(text = "여기는 메인 페이지입니다.")
        }
        Button(onClick = { navController.navigate("start_page") }, modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .height(50.dp)) {
            Text(text = "여기로 얌마 화감")
        }
    }

}
@Composable
fun testdesing() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center
    ) {
        Column(modifier = Modifier.padding(25.dp)) {
            Text(text = "여기는 메인 페이지입니다.")
        }
        Button(onClick = { /*TODO*/ },  modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .height(40.dp)) {
            Text(text = "얏바래")
        }
    }

}

@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    testdesing()
}