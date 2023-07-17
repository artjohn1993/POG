package com.generator.pogscroller.events

import com.generator.pogscroller.enum.TimerType

class TimerEvent {
    var timerType : TimerType
    constructor(timerType : TimerType) {
        this.timerType = timerType
    }
}