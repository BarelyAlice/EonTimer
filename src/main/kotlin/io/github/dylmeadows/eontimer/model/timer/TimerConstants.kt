package io.github.dylmeadows.eontimer.model.timer

@JvmField
val GEN3_DEFAULT_MODE = Gen3TimerMode.STANDARD
const val GEN3_DEFAULT_CALIBRATION = 0
const val GEN3_DEFAULT_PRE_TIMER = 5000
const val GEN3_DEFAULT_TARGET_FRAME = 1000

@JvmField
val GEN4_DEFAULT_MODE = Gen4TimerMode.STANDARD
const val GEN4_DEFAULT_CALIBRATED_DELAY = 500
const val GEN4_DEFAULT_CALIBRATED_SECOND = 14
const val GEN4_DEFAULT_TARGET_DELAY = 600
const val GEN4_DEFAULT_TARGET_SECOND = 50

@JvmField
val GEN5_DEFAULT_MODE = Gen5TimerMode.STANDARD
const val GEN5_DEFAULT_CALIBRATION = -95
const val GEN5_DEFAULT_TARGET_DELAY = 1200
const val GEN5_DEFAULT_TARGET_SECOND = 50
const val GEN5_DEFAULT_ENTRALINK_CALIBRATION = 256
const val GEN5_DEFAULT_FRAME_CALIBRATION = 0
const val GEN5_DEFAULT_TARGET_ADVANCES = 100
const val GEN5_ENTRALINK_FRAME_RATE = 0.837148929

@JvmField
val DEFAULT_TIMER_TYPE = TimerType.GEN5
const val UPDATE_FACTOR = 1.0
const val CLOSE_UPDATE_FACTOR = 0.75
const val CLOSE_THRESHOLD = 167
const val NULL_TIME_SPAN = -999L
const val NULL_TIME_SPAN_TEXT = "0:00"
const val INFINITE_TIME_SPAN = -99L
const val INFINITE_TIME_SPAN_TEXT = "?:??"
