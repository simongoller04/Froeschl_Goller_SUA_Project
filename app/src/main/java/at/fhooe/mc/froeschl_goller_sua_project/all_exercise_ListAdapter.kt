package at.fhooe.mc.froeschl_goller_sua_project

import android.graphics.Color
import android.graphics.Color.GREEN
import android.graphics.Color.WHITE
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class all_exercise_ListAdapter (val mData: List<exerciseDataClass>): RecyclerView.Adapter<all_exercise_ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): all_exercise_ListViewHolder {
        LayoutInflater.from(parent.context).apply {
            val root = inflate(R.layout.exercise_list_item, null)
            return all_exercise_ListViewHolder(root)
        }
    }

    override fun onBindViewHolder(holder: all_exercise_ListViewHolder, position: Int) {
//        holder.mButton.background.setTint(Color.parseColor(mData[position].mColor))
//        holder.mRectangle.background.setTint(Color.parseColor(mData[position].mColor))

//        holder.mWorkoutName.text = mData[position].mName
//        holder.mWorkoutIcon.setImageResource(mData[position].mWorkoutsIcon)
    }

    override fun getItemCount(): Int {
        return mData.size
    }
}