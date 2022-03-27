package com.irfan.chapterthreeclallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FourFragment : Fragment() {
    private lateinit var navigateBackToThirdFragment: Button
    private lateinit var email: EditText
    private lateinit var umur: EditText
    private lateinit var alamat: EditText
    val args: FourFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val navigateBackToThirdFragment = view.findViewById<Button>(R.id.navigate_back_to_third_fragment_button)
        navigateBackToThirdFragment.setOnClickListener {
            val emailEditText = view.findViewById<EditText>(R.id.email)
            val umurEditText = view.findViewById<EditText>(R.id.umur)
            val alamatEditText = view.findViewById<EditText>(R.id.alamat)
            val person = Parcelable(
                args.parcelable.nama, emailEditText.text.toString(), umurEditText.text.toString(), alamatEditText.text.toString()
            )
            val action = FourFragmentDirections.actionFourFragmentPop(person)
            findNavController().navigate(action)
        }

    }

}
