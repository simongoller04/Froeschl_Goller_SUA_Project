package at.fhooe.mc.froeschl_goller_sua_project

/**
 * Contains all the variables and methods to
 * create and work with a workout object
 */
data class workoutDataClass( val mName: String,
                             var mColor: String,
                             var mExerciseList: ArrayList<exerciseDataClass>) {

    fun getName(): String {
        return mName
    }

    fun getColor(): String {
        return mColor
    }

    // add a new exercise to the exercises list
    fun addExercise(exercise: exerciseDataClass) {
        mExerciseList.add(exercise)
    }

}
