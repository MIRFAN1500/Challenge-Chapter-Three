package com.irfan.chapterthreeclallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameEditText = view.findViewById<EditText>(R.id.name_edit_text)
        val navigateToScreen3 = view.findViewById<Button>(R.id.navigate_to_screen3_button)

        navigateToScreen3.setOnClickListener {

            val parcelable = Parcelable(nameEditText.text.toString().trim())
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(parcelable)
            findNavController().navigate(action)
        }
    }
}