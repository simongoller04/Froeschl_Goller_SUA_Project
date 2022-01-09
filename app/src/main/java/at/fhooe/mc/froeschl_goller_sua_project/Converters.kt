package at.fhooe.mc.froeschl_goller_sua_project

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import at.fhooe.mc.froeschl_goller_sua_project.exercise.exerciseDataClass
import com.google.gson.Gson

@ProvidedTypeConverter
class Converters {
    @TypeConverter
    fun listToJson(value: List<exerciseDataClass>?) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<exerciseDataClass>::class.java).toList()
}