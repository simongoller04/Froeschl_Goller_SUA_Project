package at.fhooe.mc.froeschl_goller_sua_project.exercise

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import at.fhooe.mc.froeschl_goller_sua_project.R

class all_exercise_ListAdapter (val mData: List<exerciseDataClass>): RecyclerView.Adapter<all_exercise_ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): all_exercise_ListViewHolder {
        LayoutInflater.from(parent.context).apply {
            val root = inflate(R.layout.exercise_list_item_small, null)
            return all_exercise_ListViewHolder(root)
        }
    }

    override fun onBindViewHolder(holder: all_exercise_ListViewHolder, position: Int) {

        holder.mRectangle.background.setTint(Color.parseColor("#CFCFCF"))
        holder.mExerciseName.text = mData[position].mName


    }

    override fun getItemCount(): Int {
        return mData.size
    }
}