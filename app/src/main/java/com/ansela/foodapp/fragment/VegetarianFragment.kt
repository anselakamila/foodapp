package com.ansela.foodapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.ansela.foodapp.adapter.RecipesAdapter
import com.ansela.foodapp.databinding.FragmentVegetarianBinding
import com.ansela.foodapp.model.DataRecipes
import com.ansela.foodapp.model.Recipes


class VegetarianFragment : Fragment() {
    private  lateinit var  vegetarianBinding: FragmentVegetarianBinding
    private var list : ArrayList<Recipes> = arrayListOf()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       vegetarianBinding = FragmentVegetarianBinding.inflate(inflater,container,false)
        return vegetarianBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(DataRecipes.dataVegetarian)
        vegetarianBinding.rvVegetarian.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context,2)
            val recipesAdapter = RecipesAdapter(list)
            adapter = recipesAdapter
        }
    }


}