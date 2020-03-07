package com.example.uitestingimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById(R.id.MainActivityImageView)


        loadImageWithPicasso()







    }

    private fun loadImageWithPicasso() {
        val picasso = Picasso.get()
        picasso.isLoggingEnabled = true

        picasso.load(R.drawable.clouds)
            .into(imageView)

    }
}
