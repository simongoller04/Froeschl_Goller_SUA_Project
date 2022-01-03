package at.fhooe.mc.froeschl_goller_sua_project

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.databinding.ActivityMainBinding.inflate
import java.util.zip.Inflater

class workoutsListViewHolder (root: View): RecyclerView.ViewHolder(root) {

    val mWorkoutName: TextView = root.findViewById(R.id.workouts_list_item_text)
    val mWorkoutIcon: ImageView = root.findViewById(R.id.workouts_list_item_icon)
    val mButton: ImageButton = root.findViewById(R.id.workouts_list_item_button)
    val mRectangle: View = root.findViewById(R.id.workouts_list_item_rectangle)

    init {

        // OnClickListener for the whole list element
        root.setOnClickListener {
//            var dialog = add_workouts_overview()
//            dialog.view?.display

            //("open specific workout with different exercises")
        }

        mRectangle.setOnClickListener {

            root.context.startActivity(Intent(root.context, workout_overview::class.java))
        }
        // OnClickListener for the Button on the right
        mButton.setOnClickListener {

//            Toast.makeText(root.context,
//                "3 Dot Button pressed ${mFullName.text}",
//                Toast.LENGTH_SHORT).show()
        }
    }
}