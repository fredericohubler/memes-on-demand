package com.example.mastermemes

import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.RelativeLayout
import com.example.mastermemes.databinding.ActivityMainBinding
import org.koin.android.viewmodel.ext.android.getViewModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setLifecycleOwner(this)
        binding.viewModel = getViewModel()
        configureLayout()
        setupObservers()
    }

    private fun configureLayout() {
        binding.gridLayout.columnCount = 2
    }

    private fun bindIcons(icons: List<AudioIcon>): List<ImageView> {
        val images = mutableListOf<ImageView>()

        icons.map {
            val icon = it
            val imageView = ImageView(this)
            imageView.scaleType = ImageView.ScaleType.FIT_XY
            imageView.setImageResource(it.icon)
            imageView.setOnClickListener {
                val player = MediaPlayer.create(this, icon.audioReference)
                player.start()
            }
            images.add(imageView)
        }

        return images
    }

    private fun setupObservers() {
        binding.viewModel?.icons?.observe(this, Observer { list ->
            if (!list.isNullOrEmpty()) {
                bindIcons(list).map {
                    binding.gridLayout.addView(it)
                }
            }
        })
    }
}
