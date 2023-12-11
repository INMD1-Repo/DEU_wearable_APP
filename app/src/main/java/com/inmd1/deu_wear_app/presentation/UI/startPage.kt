/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */

package com.inmd1.deu_wear_app.presentation.UI


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.MaterialTheme
import com.inmd1.deu_wear_app.presentation.testdesing

@Composable
fun StartPage(navController: NavController) {
        Column(
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background),
            verticalArrangement = Arrangement.Center
        ){
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "동의대 워치", color = Color.White)
            Column(modifier = Modifier.padding(20.dp)) {
                Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "환영합니다! 동의대 워치는 워치는 사용중인 동의대 학생들의 편의를 돕고자 개발한 앱입니다.",fontSize = 10.sp, color = Color.White)
            }
            Spacer(modifier = Modifier.height(3.dp))
            Button(
                onClick = { navController.navigate("main_page") },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(80.dp)
                    .height(30.dp)
            ) {
                Text(text = "다음",fontSize = 10.sp)
            }
        }
}
@Composable
fun test() {
    Column(
        modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center
    ){
        Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "동의대 워치", color = Color.White )
        Column(modifier = Modifier.padding(20.dp)) {
            Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "환영합니다! 동의대 워치는 워치는 사용중인 동의대 학생들의 편의를 돕고자 개발한 앱입니다.",fontSize = 10.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(3.dp))
        Button(
            onClick = {  },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .width(80.dp)
                .height(30.dp)
        ) {
            Text(text = "다음",fontSize = 10.sp)
        }
    }
}
@Preview(device = Devices.WEAR_OS_SMALL_ROUND, showSystemUi = true)
@Composable
fun DefaultPreview() {
    test()
}