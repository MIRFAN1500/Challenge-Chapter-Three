package com.irfan.chapterthreeclallenge

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ThirdFragment : Fragment() {

    val args: ThirdFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    @SuppressLint("StringFormatMatches")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nama = view.findViewById<TextView>(R.id.nama_text_view)
        val email = view.findViewById<TextView>(R.id.email_text_view)
        val umur = view.findViewById<TextView>(R.id.umur_text_view)
        val alamat = view.findViewById<TextView>(R.id.alamat_text_view)

        val name = args.parcelable.nama
        nama.text = name
        args.parcelable.umur?.let {
            val age = args.parcelable.umur
            Log.d("ThirdFragment", args.parcelable.toString())
            email.text = args.parcelable.email
            umur.text = getString(R.string.umur_string, age?.toInt(), if (age!!.toInt() %2==0) "Genap" else "Ganjil")
            alamat.text = args.parcelable.alamat
        }

        val navigateToScreen3Button = view.findViewById<Button>(R.id.navigate_to_fourth_fragment_button)
        navigateToScreen3Button.setOnClickListener {
            val parcelable = Parcelable(name)
            val action = ThirdFragmentDirections.actionThirdFragmentToFourFragment(parcelable)
            findNavController().navigate(action)
        }


    }
}