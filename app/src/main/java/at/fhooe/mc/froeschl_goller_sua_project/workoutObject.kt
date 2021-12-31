package at.fhooe.mc.froeschl_goller_sua_project

import android.graphics.Color
import android.graphics.Color.rgb
import android.graphics.drawable.Drawable

/**
 * This object stores the name, the color and the exercises of a workout
 */
object workoutObject {
    private var mName: String = ""
    private var mIcon: Int = 0
    private var mColor: String = ""
    private var mExercisesList: ArrayList<exerciseObject> = ArrayList<exerciseObject>()

    fun init(name: String, color: String) {
        mName = name
        mColor = color
        mIcon = R.drawable.navigation_workouts_icon
    }

    fun getName(): String {
        return mName
    }

    fun getIcon(): Int {
        return mIcon
    }
    fun getColor(): String {
        return mColor
    }

    // add a new exercise to the exercises list
    fun addExercise(exercise: exerciseObject) {
        mExercisesList.add(exercise)
    }
}