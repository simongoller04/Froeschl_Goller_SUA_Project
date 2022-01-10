package at.fhooe.mc.froeschl_goller_sua_project.exercise

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.R

class all_exercise_ListViewHolder (root: View): RecyclerView.ViewHolder(root) {

    val mExerciseName: TextView = root.findViewById(R.id.exercise_list_item_text_small)
    val mRectangle: View = root.findViewById(R.id.exercise_list_item_rectangle_small)

    init {
        root.setOnClickListener{


        }
    }
}