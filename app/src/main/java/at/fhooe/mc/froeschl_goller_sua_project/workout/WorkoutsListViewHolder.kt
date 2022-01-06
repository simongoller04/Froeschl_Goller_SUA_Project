package at.fhooe.mc.froeschl_goller_sua_project.workout

import android.content.Intent
import android.view.View
import android.widget.*
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.R
import at.fhooe.mc.froeschl_goller_sua_project.activity_main_navigation_workouts
import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass
import at.fhooe.mc.froeschl_goller_sua_project.ui.workoutViewModel
import at.fhooe.mc.froeschl_goller_sua_project.ui.workout_overview

class workoutsListViewHolder (root: View, private val viewModel: workoutViewModel): RecyclerView.ViewHolder(root) {

    val mWorkoutName: TextView = root.findViewById(R.id.workouts_list_item_text)
    val mWorkoutIcon: ImageView = root.findViewById(R.id.workouts_list_item_icon)
    val mButton: ImageButton = root.findViewById(R.id.workouts_list_item_button)
    val mRectangle: View = root.findViewById(R.id.workouts_list_item_rectangle)


    init {

        mRectangle.setOnClickListener {

            root.context.startActivity(Intent(root.context, workout_overview::class.java))
        }

        // OnClickListener for the Button on the right
        mButton.setOnClickListener {



            var dialog = workouts_add_new_popup(object : workoutDataListener {
                override fun onAddButtonClicker(item: workoutDataClass) {
                    viewModel.update(item)
                }
            })
            dialog.show(root.findFragment<activity_main_navigation_workouts>().parentFragmentManager, "Besser ises")

        }
    }
}