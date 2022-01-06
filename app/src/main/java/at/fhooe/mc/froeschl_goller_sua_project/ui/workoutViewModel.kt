package at.fhooe.mc.froeschl_goller_sua_project.ui

import androidx.lifecycle.ViewModel
import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass
import at.fhooe.mc.froeschl_goller_sua_project.data.repositories.workoutRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class workoutViewModel(
    private val repository: workoutRepository
): ViewModel() {

    fun upsert(item: workoutDataClass) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun update(item: workoutDataClass) = CoroutineScope(Dispatchers.Main).launch {
        repository.update(item)
    }

    fun delete(item: workoutDataClass) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllWorkouts() = repository.getAllWorkouts()
}