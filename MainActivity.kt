package com.example.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.text.style.TextAlign
import com.example.myapplication.ui.theme.MyApplicationTheme
class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
 super.onCreate(savedInstanceState)
 setContent {
 MyApplicationTheme {
// A surface container using the 'background' color from the theme
 Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background)
{
 Quadrants()
 }
 }
 }
 }
}
val color1 = Color(0xFFEADDFF)
val color2 = Color(0xFFD0BCFF)
val color3 = Color(0xFFB69DF8)
val color4 = Color(0xFFF6EDFF)
@Composable
fun Quadrant(head: String, body: String, modifier: Modifier = Modifier) {
 Column(
 modifier = modifier.padding(16.dp),
 verticalArrangement = Arrangement.Center,
 horizontalAlignment = Alignment.CenterHorizontally,
 ) {
 Text(
 text = head,
 fontWeight = FontWeight.Bold,
 modifier = Modifier.padding(bottom = 16.dp),
 )
 Text(
 text = body,
 textAlign = TextAlign.Justify
 )
 }
} @Composable
fun Quadrants() {
 Column(
 modifier = Modifier.fillMaxSize()
 ) {
 Row(
 Modifier.weight(1F)
 ) {
 Quadrant(
 head = stringResource(id = R.string.text_app),
 body = stringResource(id = R.string.display_app),
 modifier = Modifier
 .fillMaxHeight()
 .weight(1f)
 .background(color1)
 )
 Quadrant(
 head = stringResource(id = R.string.image_title),
 body = stringResource(id = R.string.image_content),
 modifier = Modifier
 .fillMaxHeight()
 .weight(1f)
 .background(color2)
 )
 }
 Row(
 Modifier.weight(1F)
 ) {
 Quadrant(
 head = stringResource(id = R.string.row_app),
 body = stringResource(id = R.string.row_content),
 modifier = Modifier
 .fillMaxHeight()
 .weight(1f)
 .background(color3)
 )
 Quadrant(
 head = stringResource(id = R.string.column_title),
 body = stringResource(id = R.string.column_content),
 modifier = Modifier
 .fillMaxHeight()
 .weight(1f)
 .background(color4)
 )
 }
 }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
 MyApplicationTheme {
 Quadrants()
 }
}
