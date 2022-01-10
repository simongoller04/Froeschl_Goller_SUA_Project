package at.fhooe.mc.froeschl_goller_sua_project.exercise

/**
 * Contains all the variables and methods to
 * create and work with an exercise object
 */
data class exerciseDataClass(val mName: String,
                             val mReps: Int,
                             val mSets: Int,
                             val mWeight: Int,
                             val mMuscleGroup: String) {

    // returns the name of the exercise
    fun getName(): String {
        return mName
    }

    fun getReps(): Int {
        return mReps
    }

    fun getSets(): Int {
        return mSets
    }

    fun getWeight(): Int {
        return mWeight
    }

    fun getMuscleGroup(): String {
        return mMuscleGroup
    }
}



