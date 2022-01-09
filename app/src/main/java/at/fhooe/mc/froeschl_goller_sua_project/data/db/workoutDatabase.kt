package at.fhooe.mc.froeschl_goller_sua_project.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import at.fhooe.mc.froeschl_goller_sua_project.Converters
import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass

@Database(
    entities = [workoutDataClass::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class workoutDatabase: RoomDatabase() {

    abstract fun getWorkoutDao(): workoutDao

    companion object {
        @Volatile
        private var instance: workoutDatabase? = null
        private val LOCK = Any()


        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also { instance = it }
        }


        private fun createDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
                workoutDatabase::class.java, "WorkoutDB.db").addTypeConverter(Converters()).build()

    }
}