package net.io.xml_test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import net.io.compose_test.AbdoActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn).apply {
            setOnClickListener {
                startActivity(Intent(this@MainActivity, AbdoActivity::class.java))
            }
        }
    }
}