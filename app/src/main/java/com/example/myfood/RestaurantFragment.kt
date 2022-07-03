package com.example.myfood

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myfood.databinding.FragmentRestaurantBinding

class RestaurantFragment : Fragment(R.layout.fragment_restaurant) {

    private var binding: FragmentRestaurantBinding? = null
    private var filter = arrayOf(
        FilterItem("Ordenar"),
        FilterItem("Para retirar")

    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentRestaurantBinding.bind(view)

        binding?.let {
            filter.forEach {

            }
        }
    }
}