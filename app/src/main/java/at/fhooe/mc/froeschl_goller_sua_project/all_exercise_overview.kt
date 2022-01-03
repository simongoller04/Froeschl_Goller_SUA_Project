package at.fhooe.mc.froeschl_goller_sua_project

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class all_exercise_overview: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.all_exercise_overview)

        // buttons
        val mSearchBar: EditText = findViewById(R.id.all_exercise_overview_search)
        mSearchBar.setOnClickListener {

        }
    }
}