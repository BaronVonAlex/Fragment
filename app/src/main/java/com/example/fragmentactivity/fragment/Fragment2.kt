package com.example.fragmentactivity.fragment

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentactivity.R

class Fragment2 : Fragment(R.layout.fragment_2)
{
    lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.Fragment2Text1)
        textView.text = Fragment2Args.fromBundle(requireArguments()).text

        textView = view.findViewById(R.id.Fragment2Text2)
        textView.text = Fragment2Args.fromBundle(requireArguments()).text2

        textView = view.findViewById(R.id.Fragment2text3)
        textView.text = Fragment2Args.fromBundle(requireArguments()).text3

    }
}