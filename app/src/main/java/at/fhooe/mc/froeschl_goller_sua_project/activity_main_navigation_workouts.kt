package at.fhooe.mc.froeschl_goller_sua_project

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [activity_main_navigation_workouts.newInstance] factory method to
 * create an instance of this fragment.
 */
class activity_main_navigation_workouts : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(
            R.layout.fragment_activity_main_navigation_workouts,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val context = context as MainActivity

        val addNewWorkoutButton = context.findViewById(R.id.workout_exercise_overview_addnew_button) as Button

        // open popup screen to add new workout
        addNewWorkoutButton.setOnClickListener {
            var dialog = workouts_add_new_popup()
            dialog.show(parentFragmentManager, "Add New Workout")
        }

        // val data = get the list from gson

        val data = mutableListOf(
            workoutsList("Chest Day", R.drawable.navigation_workouts_icon, "#FFA800"),
            workoutsList("Leg Day", R.drawable.navigation_workouts_icon, "#A781C5"),
            )

        val recyclerView = context.findViewById(R.id.workout_exercise_overview_list_view) as RecyclerView
        recyclerView.adapter = workoutsListAdapter(data)
        recyclerView.layoutManager = LinearLayoutManager(context)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment activity_main_navigation_workouts.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            activity_main_navigation_workouts().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
//    private fun getUsers(): workoutObject {
//        val preferences = PreferenceManager.getDefaultSharedPreferences(context)
//        val jsonString = preferences.getString("users", null)
//
//        return if (jsonString != null)
//            workoutObject = Gson.fromJson(jsonString, object : TypeToken<workoutObject>(){}.type)
//            //fromJson(jsonString, object : TypeToken<workoutObject>(){}.type)
//        else
//            return workoutObject
//    }
}