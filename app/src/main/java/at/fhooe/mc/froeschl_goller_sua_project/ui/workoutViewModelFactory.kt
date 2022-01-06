package at.fhooe.mc.froeschl_goller_sua_project.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import at.fhooe.mc.froeschl_goller_sua_project.data.repositories.workoutRepository

@Suppress("UNCHECKED_CAST")
class workoutViewModelFactory(
    private val repository: workoutRepository
): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return workoutViewModel(repository) as T
    }
}