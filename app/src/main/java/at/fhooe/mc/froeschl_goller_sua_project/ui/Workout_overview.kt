package at.fhooe.mc.froeschl_goller_sua_project.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.R
import at.fhooe.mc.froeschl_goller_sua_project.exercise.all_exercise_ListAdapter
import at.fhooe.mc.froeschl_goller_sua_project.exercise.all_exercise_overview
import at.fhooe.mc.froeschl_goller_sua_project.exercise.exerciseDataClass

class workout_overview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_overview)

        val mAddExerciseButton: Button = findViewById(R.id.workout_exercise_overview_addnew_button)


        val recyclerView: RecyclerView = findViewById(R.id.workout_exercise_overview_list_view)

        val data: List<exerciseDataClass>  = listOf(
            exerciseDataClass("Benchpress", 6, 3,100, "Chest"),
            exerciseDataClass("Overheadpress", 6, 4,28, "Shoulder"),
        )


        val adapter = all_exercise_ListAdapter(data)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


        // add new Exercise Button pressed
        mAddExerciseButton.setOnClickListener {
            Intent(this, all_exercise_overview::class.java).also {
                startActivity(it);
            }
        }
    }
}