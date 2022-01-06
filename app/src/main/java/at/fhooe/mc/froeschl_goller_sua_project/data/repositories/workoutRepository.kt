package at.fhooe.mc.froeschl_goller_sua_project.data.repositories

import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass
import at.fhooe.mc.froeschl_goller_sua_project.data.db.workoutDatabase

class workoutRepository(
    private val db: workoutDatabase
) {
    suspend fun upsert(item: workoutDataClass) = db.getWorkoutDao().upsert(item)

    suspend fun update(item: workoutDataClass) = db.getWorkoutDao().update(item)

    suspend fun delete(item: workoutDataClass) = db.getWorkoutDao().delete(item)

    fun getAllWorkouts() = db.getWorkoutDao().getAllWorkouts()
}