package at.fhooe.mc.froeschl_goller_sua_project.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import at.fhooe.mc.froeschl_goller_sua_project.R
import at.fhooe.mc.froeschl_goller_sua_project.exercise.exerciseDataClass
import java.util.*

/**
 * Contains all the variables and methods to
 * create and work with a workout object
 */
@Entity(tableName = "workouts")
data class workoutDataClass(
    @PrimaryKey(autoGenerate = false)
    var mId: Int? = null,
    @ColumnInfo(name = "workout_name")
    var mName: String,
    @ColumnInfo(name = "workout_color")
    var mColor: String,
//    @ColumnInfo(name = "workout_exercises")
//    var mExerciseList: IntArray,
    @ColumnInfo(name = "workout_icon")
    var mIcon: Int = R.drawable.navigation_workouts_icon



    ) {



//    fun getName(): String {
//        return mName
//    }
//
//    fun getColor(): String {
//        return mColor
//    }
//
//    // add a new exercise to the exercises list
//    fun addExercise(exercise: exerciseDataClass) {
//        mExerciseList.add(exercise)
//    }

}
