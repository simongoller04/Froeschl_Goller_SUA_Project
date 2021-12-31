package at.fhooe.mc.froeschl_goller_sua_project

/**
 * Exercise Object stores the needed data for a single exercise
 */
object exerciseObject {
    private var mName: String = ""
    private var mReps: Int = 0
    private var mSets: Int = 0
    private var mWeight: Int = 0

    // stores the provided data
    fun init(name: String, reps: Int, sets: Int, weight: Int) {
        mName = name
        mReps = reps
        mSets = sets
        mWeight = weight
    }

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
}