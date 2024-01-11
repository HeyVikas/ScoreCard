package com.vikas.scorecard

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.vikas.scorecard.model.Team

class ScoreViewModel: ViewModel() {

    var teamA = mutableStateOf(Team())
    var teamB = mutableStateOf(Team())
    var flag =  mutableStateOf(false)
    var text =  mutableStateOf(" ")
}