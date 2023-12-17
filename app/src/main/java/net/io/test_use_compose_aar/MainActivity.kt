package net.io.test_use_compose_aar

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import net.io.compose_test.AbdoActivity
import net.io.test_use_compose_aar.ui.theme.Test_use_compose_aarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test_use_compose_aarTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current as MainActivity
   Button(onClick = {
       context.startActivity(Intent(context, AbdoActivity::class.java))

   }) {
       Text(
           text = "Hello $name!",
           modifier = modifier
       )
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Test_use_compose_aarTheme {
        Greeting("Android")
    }
}