package com.dxfmarket.app
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(Modifier.fillMaxSize().padding(16.dp)) {
                    Text("DXF Market", style = MaterialTheme.typography.headlineLarge)
                    Text("Project: dxf-directline - READY!")
                    Text("Admin: wawirehamisi40@gmail.com")
                    Text("M-Pesa: https://us-central1-dxf-directline.cloudfunctions.net/stkPush")
                }
            }
        }
    }
}
