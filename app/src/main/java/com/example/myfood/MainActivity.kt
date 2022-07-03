package com.example.myfood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myfood.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupViews()
    }

    private fun setupViews(){
        val tabLayout = binding.addtab
        var viewPager = binding.addViewpager
        var adapter = TabViewPageAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){ tab, position->
            tab.text = getString(adapter.tabs[position])
        }.attach()
    }
}

class TabViewPageAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {

    var tabs = arrayOf(R.string.restaurants,
        R.string.marketplaces,
        R.string.drinks,
        R.string.farmacia,
        R.string.pets
    )

    var fragment =  arrayOf(MarketplaceFragment(),
        MarketplaceFragment(),
        MarketplaceFragment(),
        MarketplaceFragment(),
        MarketplaceFragment()
    )

    override fun getItemCount() = fragment.size

    override fun createFragment(position: Int): Fragment {
        return  fragment[position]
    }

}

class MarketplaceFragment : Fragment() {}