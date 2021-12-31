package at.fhooe.mc.froeschl_goller_sua_project

import android.view.View
import android.widget.*
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView

class workoutsListViewHolder (root: View): RecyclerView.ViewHolder(root) {

    val mWorkoutName: TextView = root.findViewById(R.id.workouts_list_item_text)
    val mWorkoutIcon: ImageView = root.findViewById(R.id.workouts_list_item_icon)
    val mButton: ImageButton = root.findViewById(R.id.workouts_list_item_button)
    val mRectangle: View = root.findViewById(R.id.workouts_list_item_rectangle)

    init {

        // OnClickListener for the whole list element
        root.setOnClickListener {
            var dialog = add_workouts_overview()
            dialog.view?.display

            //("open specific workout with different exercises")
        }

        // OnClickListener for the Button on the right
        mButton.setOnClickListener {

//            Toast.makeText(root.context,
//                "3 Dot Button pressed ${mFullName.text}",
//                Toast.LENGTH_SHORT).show()
        }
    }
}