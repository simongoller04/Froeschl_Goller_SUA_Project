package at.fhooe.mc.froeschl_goller_sua_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class workout_overview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_overview)

        val mAddExerciseButton: Button = findViewById(R.id.workout_exercise_overview_addnew_button)

        // add new Exercise Button pressed
        mAddExerciseButton.setOnClickListener {
            Intent(this, all_exercise_overview::class.java).also {
                startActivity(it);
            }
        }
    }
}