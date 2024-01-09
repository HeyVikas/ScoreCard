    package com.vikas.scorecard
    
    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.background
    import androidx.compose.foundation.border
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.IntrinsicSize
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxHeight
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.heightIn
    import androidx.compose.foundation.layout.width
    import androidx.compose.foundation.verticalScroll
    import androidx.compose.material3.Button
    import androidx.compose.material3.Divider
    import androidx.compose.material3.ExperimentalMaterial3Api
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.Surface
    import androidx.compose.material3.Text
    import androidx.compose.material3.TopAppBar
    import androidx.compose.material3.TopAppBarDefaults
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.layout.AlignmentLine
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.vikas.scorecard.model.Team
    import com.vikas.scorecard.ui.theme.ScoreCardTheme
    
    class MainActivity : ComponentActivity() {
        @OptIn(ExperimentalMaterial3Api::class)
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                ScoreCardTheme {
                    var teamA = remember { mutableStateOf(Team()) }
                    var teamB = remember { mutableStateOf(Team()) }
                    var flag = remember { mutableStateOf(false) }
                    var text = remember { mutableStateOf(" ") }
    
                    // A surface container using the 'background' color from the theme
                    Surface() {
                        Column (modifier = Modifier
                            .background(Color.)
                            .fillMaxSize(),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.CenterHorizontally){
                            TopAppBar(title = {Text(text = "Cricket")},
                                colors = TopAppBarDefaults.smallTopAppBarColors(
                                    containerColor = Color.Cyan
                                ))
                            Spacer(modifier = Modifier.height(20.dp))
    
                            Row(
                                modifier = Modifier
                                    .background(Color.Gray)
                                    .fillMaxWidth()
                                    .height(IntrinsicSize.Min),
                                //verticalAlignment = Alignment.Top,
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Column(verticalArrangement = Arrangement.SpaceEvenly,
    
                                )
                                {
                                    Text(text = "Team A",
                                        fontSize = 25.sp)
    
                                    Spacer(modifier = Modifier.heightIn(25.dp))
    
                                    Text(text = "${teamA.value.socre}")
    
                                    Spacer(modifier = Modifier.heightIn(15.dp))
    
                                    Text(text = "Score")
    
                                    Spacer(modifier = Modifier.heightIn(15.dp))
    
                                    Button(onClick = {teamA.value = teamA.value.copy(
                                        socre = teamA.value.socre +1
                                    )}) {
                                        Text(text = " +1 ")
                                    }
    
                                    Spacer(modifier = Modifier.heightIn(10.dp))
    
                                    Button(onClick = {teamA.value = teamA.value.copy(
                                        socre = teamA.value.socre +2
                                    )}) {
                                        Text(text = " +2 ")
                                    }
    
                                    Spacer(modifier = Modifier.heightIn(10.dp))
    
                                    Button(onClick = {teamA.value = teamA.value.copy(
                                        socre = teamA.value.socre +3
                                    )}) {
                                        Text(text = " +3 ")
                                    }
                                }
    
                                Divider(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .width(3.dp)
                                        .background(Color.Red)
                                )
    
                                Column {
                                    Text(text = "Team B",
                                        fontSize = 25.sp)
    
                                    Spacer(modifier = Modifier.heightIn(25.dp))
    
                                    Text(text = "${teamB.value.socre}")
    
                                    Spacer(modifier = Modifier.heightIn(15.dp))
    
                                    Text(text = "Score")
    
                                    Spacer(modifier = Modifier.heightIn(15.dp))
    
                                    Button(onClick = {teamB.value = teamB.value.copy(
                                        socre = teamB.value.socre +1
                                    )}) {
                                        Text(text = " +1 ")
                                    }
    
                                    Spacer(modifier = Modifier.heightIn(10.dp))
    
                                    Button(onClick = {
                                        teamB.value = teamB.value.copy(
                                            socre = teamB.value.socre + 2
                                        )
                                    }) {
                                        Text(text = " +2 ")
                                    }
                                    Spacer(modifier = Modifier.heightIn(10.dp))
    
                                    Button(onClick = {
                                        teamB.value = teamB.value.copy(
                                            socre = teamB.value.socre +3
                                        )
                                    }) {
                                        Text(text = " +3 ")
    
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.heightIn(30.dp))
    
                            Button(onClick = {flag.value = true}) {
                                Text(text = "Result")
                            }
                            Spacer(modifier = Modifier.heightIn(30.dp))
    
                            if (flag.value == true){
                                if ((teamA.value.socre) > (teamB.value.socre)){
                                    text.value = "Team A is Winner"
                                }
                                else if ((teamA.value.socre) == (teamB.value.socre)){
                                    text.value = "It's a draw"
                                }
                                else{
                                    text.value = "Team B is Winner"
                                }
                            }
    
                            Text(text = "${text.value}")
    
                            Spacer(modifier = Modifier.heightIn(30.dp))
    
    
                            Button(onClick = {
                                teamA.value.socre = 0
                                teamB.value.socre = 0
                                flag.value = false
                                text.value = ""
                            }) {
                                Text(text = "Reset")
                            }
    
                        }
    
                        }
                    }
                    }
                }
        //
        //
        //
            }
    
    
    
