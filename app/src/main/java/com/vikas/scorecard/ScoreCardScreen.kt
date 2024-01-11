package com.vikas.scorecard

import androidx.compose.foundation.background
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
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScoreCardScreen(scoreViewModel: ScoreViewModel) {
    Column (modifier = Modifier
        .background(Color.Gray)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally){
        TopAppBar(title = { Text(text = "Cricket") },
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

                Text(text = "${scoreViewModel.teamA.value.socre}")

                Spacer(modifier = Modifier.heightIn(15.dp))

                Text(text = "Score")

                Spacer(modifier = Modifier.heightIn(15.dp))

                Button(onClick = {scoreViewModel.teamA.value = scoreViewModel.teamA.value.copy(
                    socre = scoreViewModel.teamA.value.socre + 1
                )}) {
                    Text(text = " +1 ")
                }

                Spacer(modifier = Modifier.heightIn(10.dp))

                Button(onClick = {scoreViewModel.teamA.value = scoreViewModel.teamA.value.copy(
                    socre = scoreViewModel.teamA.value.socre +2
                )}) {
                    Text(text = " +2 ")
                }

                Spacer(modifier = Modifier.heightIn(10.dp))

                Button(onClick = {scoreViewModel.teamA.value = scoreViewModel.teamA.value.copy(
                    socre = scoreViewModel.teamA.value.socre +3
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

                Text(text = "${scoreViewModel.teamB.value.socre}")

                Spacer(modifier = Modifier.heightIn(15.dp))

                Text(text = "Score")

                Spacer(modifier = Modifier.heightIn(15.dp))

                Button(onClick = {scoreViewModel.teamB.value = scoreViewModel.teamB.value.copy(
                    socre = scoreViewModel.teamB.value.socre +1
                )}) {
                    Text(text = " +1 ")
                }

                Spacer(modifier = Modifier.heightIn(10.dp))

                Button(onClick = {
                    scoreViewModel.teamB.value = scoreViewModel.teamB.value.copy(
                        socre = scoreViewModel.teamB.value.socre + 2
                    )
                }) {
                    Text(text = " +2 ")
                }
                Spacer(modifier = Modifier.heightIn(10.dp))

                Button(onClick = {
                    scoreViewModel.teamB.value = scoreViewModel.teamB.value.copy(
                        socre = scoreViewModel.teamB.value.socre +3
                    )
                }) {
                    Text(text = " +3 ")

                }
            }
        }
        Spacer(modifier = Modifier.heightIn(30.dp))

        Button(onClick = {scoreViewModel.flag.value = true}) {
            Text(text = "Result")
        }
        Spacer(modifier = Modifier.heightIn(30.dp))

        if (scoreViewModel.flag.value == true){
            if ((scoreViewModel.teamA.value.socre) > (scoreViewModel.teamB.value.socre)){
                scoreViewModel.text.value = "Team A is Winner"
            }
            else if ((scoreViewModel.teamA.value.socre) == (scoreViewModel.teamB.value.socre)){
                scoreViewModel.text.value = "It's a draw"
            }
            else{
                scoreViewModel.text.value = "Team B is Winner"
            }
        }

        Text(text = "${scoreViewModel.text.value}")

        Spacer(modifier = Modifier.heightIn(30.dp))


        Button(onClick = {
            scoreViewModel.teamA.value.socre = 0
            scoreViewModel.teamB.value.socre = 0
            scoreViewModel.flag.value = false
            scoreViewModel.text.value = ""
        }) {
            Text(text = "Reset")
        }

    }
}