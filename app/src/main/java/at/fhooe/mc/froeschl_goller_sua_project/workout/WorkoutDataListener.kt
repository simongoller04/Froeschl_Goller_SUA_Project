package at.fhooe.mc.froeschl_goller_sua_project.workout

import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass

interface workoutDataListener {
    fun onAddButtonClicker(item: workoutDataClass)
}