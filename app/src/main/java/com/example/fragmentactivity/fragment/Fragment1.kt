package com.example.fragmentactivity.fragment

import androidx.fragment.app.Fragment
import com.example.fragmentactivity.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation


class Fragment1 : Fragment(R.layout.fragment_1)
{
    lateinit var foodType: EditText
    lateinit var topping: EditText
    lateinit var juice: EditText
    lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        foodType = view.findViewById(R.id.FoodType)
        topping = view.findViewById(R.id.Topping)
        juice = view.findViewById(R.id.Juice)
        button = view.findViewById(R.id.enterButton)

        val navController = Navigation.findNavController(view)

        button.setOnClickListener {

            val text = foodType.text.toString()
            val text2 = topping.text.toString()
            val text3 = juice.text.toString()

            val action = Fragment1Directions.actionFragment1ToFragment2(text, text2, text3)
            navController.navigate(action)
        }

    }
}