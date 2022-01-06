package at.fhooe.mc.froeschl_goller_sua_project.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass

@Dao
interface workoutDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: workoutDataClass)

    @Update
    suspend fun update(item: workoutDataClass)

    @Delete
    suspend fun delete(item: workoutDataClass)

    @Query("SELECT * FROM workouts")
    fun getAllWorkouts(): LiveData<List<workoutDataClass>>
}