package at.fhooe.mc.froeschl_goller_sua_project.workout

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.findFragment
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.R
import at.fhooe.mc.froeschl_goller_sua_project.activity_main_navigation_workouts
import at.fhooe.mc.froeschl_goller_sua_project.data.db.entities.workoutDataClass
import at.fhooe.mc.froeschl_goller_sua_project.ui.workoutViewModel


class workoutsListAdapter(
    var items: List<workoutDataClass>,
    private val viewModel: workoutViewModel
    ): RecyclerView.Adapter<workoutsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): workoutsListViewHolder {
        LayoutInflater.from(parent.context).apply {
            val root = inflate(R.layout.workouts_list_item, null)
            return workoutsListViewHolder(root, viewModel)
        }
    }

    override fun onBindViewHolder(holder: workoutsListViewHolder, position: Int) {
        holder.mButton.background.setTint(Color.parseColor(items[position].mColor))
        holder.mRectangle.background.setTint(Color.parseColor(items[position].mColor))
        holder.mWorkoutName.text = items[position].mName
        holder.mWorkoutIcon.setImageResource(items[position].mIcon)

        holder.mRectangle.setOnClickListener {
            items[position].mExerciseList
        }



        holder.mButton.setOnClickListener {
            viewModel.delete(items[position])
        }




    }

    override fun getItemCount(): Int {
        return items.size
    }

}


//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): workoutsListViewHolder {
//        LayoutInflater.from(parent.context).apply {
//            val root = inflate(R.layout.workouts_list_item, null)
//            return workoutsListViewHolder(root)
//        }
//    }
//
//    override fun onBindViewHolder(holder: workoutsListViewHolder, position: Int) {
//        holder.mButton.background.setTint(Color.parseColor(mData[position].mColor))
//        holder.mRectangle.background.setTint(Color.parseColor(mData[position].mColor))
//
//        holder.mWorkoutName.text = mData[position].mWorkoutName
//        holder.mWorkoutIcon.setImageResource(mData[position].mWorkoutsIcon)
//    }
//
//    override fun getItemCount(): Int {
//        return mData.size
//    }
