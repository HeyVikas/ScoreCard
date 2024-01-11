package com.vikas.scorecard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import com.vikas.scorecard.ui.theme.ScoreCardTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScoreCardTheme {
                val scoreViewModel: ScoreViewModel by viewModels()

                // A surface container using the 'background' color from the theme
                Surface {

                    ScoreCardScreen(
                        scoreViewModel
                    )

                }
            }
        }
    }
}
    
    
    
