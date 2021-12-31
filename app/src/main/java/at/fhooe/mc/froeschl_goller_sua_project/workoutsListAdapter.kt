package at.fhooe.mc.froeschl_goller_sua_project

import android.graphics.Color
import android.graphics.Color.GREEN
import android.graphics.Color.WHITE
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class workoutsListAdapter (val mData: List<workoutsList>): RecyclerView.Adapter<workoutsListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): workoutsListViewHolder {
        LayoutInflater.from(parent.context).apply {
            val root = inflate(R.layout.workouts_list_item, null)
            return workoutsListViewHolder(root)
        }
    }

    override fun onBindViewHolder(holder: workoutsListViewHolder, position: Int) {
        holder.mButton.background.setTint(Color.parseColor(mData[position].mColor))
        holder.mRectangle.background.setTint(Color.parseColor(mData[position].mColor))

        holder.mWorkoutName.text = mData[position].mWorkoutName
        holder.mWorkoutIcon.setImageResource(mData[position].mWorkoutsIcon)
    }

    override fun getItemCount(): Int {
        return mData.size
    }
}