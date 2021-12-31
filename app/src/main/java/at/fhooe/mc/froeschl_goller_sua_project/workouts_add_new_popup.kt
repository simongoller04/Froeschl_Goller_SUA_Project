package at.fhooe.mc.froeschl_goller_sua_project

import android.content.Context
import android.os.Bundle
import android.preference.PreferenceManager
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.DialogFragment
import com.google.gson.Gson
import org.w3c.dom.Text
import java.util.prefs.Preferences

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private val preference_file_key = ""

/**
 * A simple [Fragment] subclass.
 * Use the [workouts_add_new_popup.newInstance] factory method to
 * create an instance of this fragment.
 */
class workouts_add_new_popup : DialogFragment() {
//    // TODO: Rename and change types of parameters
//    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        var rootView: View = inflater.inflate(R.layout.fragment_workouts_add_new_popup, container, false)

        // stores the color of the workout
        // the standard color is grey (#C4C4C4)
        var mHexCode: String = "#C4C4C4"

        val greenButton = rootView.findViewById(R.id.popup_workout_color_green) as Button
        greenButton.setOnClickListener {
            mHexCode = "#27A451"
        }

        val yellowButton = rootView.findViewById(R.id.popup_workout_color_yellow) as Button
        yellowButton.setOnClickListener {
            mHexCode = "#FFA800"
        }

        val purpleButton = rootView.findViewById(R.id.popup_workout_color_purple) as Button
        purpleButton.setOnClickListener {
            mHexCode = "#A781C5"
        }

        val redButton = rootView.findViewById(R.id.popup_workout_color_red) as Button
        redButton.setOnClickListener {
            mHexCode = "#EA0000"
        }

        val brownButton = rootView.findViewById(R.id.popup_workout_color_brown) as Button
        brownButton.setOnClickListener {
            mHexCode = "#BF9A6F"
        }

        val greyButton = rootView.findViewById(R.id.popup_workout_color_grey) as Button
        greyButton.setOnClickListener {
            mHexCode = "#C4C4C4"
        }

        // insert the name and the color of the workout in a list
        // return to the the other screen
        val addButton = rootView.findViewById(R.id.popup_workout_add_button) as Button
        addButton.setOnClickListener {
            val inputText = rootView.findViewById(R.id.popup_workout_name) as EditText
            val mName = inputText.text.toString().trim()

            // no name was entered
            if (mName.isNullOrEmpty()) {
                Toast.makeText(rootView.context,
                    "Please enter a name!",
                    Toast.LENGTH_SHORT).show()
            }

            // store the data
            else {
                val mWorkout = workoutObject
                mWorkout.init(mName, mHexCode)

                //saveToPreferences(mWorkout)
            }
        }

        // close the popup window
        val cancelButton = rootView.findViewById(R.id.popup_workout_cancel_button) as Button
        cancelButton.setOnClickListener {
            dismiss()
        }

        return rootView
    }

//    companion object {
//        /**
//         * Use this factory method to create a new instance of
//         * this fragment using the provided parameters.
//         *
//         * @param param1 Parameter 1.
//         * @param param2 Parameter 2.
//         * @return A new instance of fragment workouts_add_new_popup.
//         */
//        // TODO: Rename and change types and number of parameters
//        @JvmStatic
//        fun newInstance(param1: String, param2: String) =
//            workouts_add_new_popup().apply {
//                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
//                }
//            }
//    }

//    private fun saveToPreferences(workout: workoutObject) {
//        val sharedPref = activity?.getPreferences(Context.MODE_PRIVATE)
//        val prefEditor = PreferenceManager.getDefaultSharedPreferences(context).edit()
//        val jsonString = Gson().toJson(workout)
//        sharedPref.putString("workout: " + workout.getName(), jsonString).apply()
//    }
}