package at.fhooe.mc.froeschl_goller_sua_project.exercise

import android.content.Context
import android.os.Bundle
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.MainActivity
import at.fhooe.mc.froeschl_goller_sua_project.R

class all_exercise_overview: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_exercise_overview)

        // buttons
        val mSearchBar: EditText = findViewById(R.id.all_exercise_overview_search)
        mSearchBar.setOnClickListener {

        }

        val recyclerView = findViewById(R.id.all_exercise_overview_recycler_view) as RecyclerView

        val data: List<exerciseDataClass>  = listOf(
            exerciseDataClass("Benchpress", 0, 0,0, "Chest"),
            exerciseDataClass("Overheadpress", 0, 0,0, "Shoulder"),
            exerciseDataClass("Squats", 0, 0,0, "Legs"),
            exerciseDataClass("Curls", 0, 0,0, "Arms")
        )


        val adapter = all_exercise_ListAdapter(data)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}