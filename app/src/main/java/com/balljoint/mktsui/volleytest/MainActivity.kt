package com.balljoint.mktsui.VolleyTest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.toolbox.ImageLoader
import com.android.volley.toolbox.NetworkImageView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        VolleyService.initialize(this)
        VolleyService.requestQueue.start()

        // ABCNews image
        val imgURL = "http://www.abc.net.au/news/image/4444678-4x3-140x105.jpg"

        // Image on Google site
        val imgURL2 = "https://sites.google.com/a/pressatgoogle.com/mooningoogleearth/_/rsrc/1247886477794/home/google-space-products/Google%20Sky%20for%20site.jpg?height=242&width=420"

        // Use VolleyService to load images
        val mNetImg1 = findViewById(R.id.networkImageView1) as NetworkImageView
        val mNetImg2 = findViewById(R.id.networkImageView2) as NetworkImageView

        mNetImg1.setImageUrl(imgURL, VolleyService.imageLoader)
        mNetImg2.setImageUrl(imgURL2, VolleyService.imageLoader)


        // Use LoadImage Singleton to load images
//        val mNetImg3 = findViewById(R.id.networkImageView3) as NetworkImageView
//        val mNetImg4 = findViewById(R.id.networkImageView4) as NetworkImageView


        // Unfortunately using imageLoader will have error
//        mNetImg3.setImageUrl(imgURL, LoadImage.getInstance(this).imageLoader)
//        mNetImg4.setImageUrl(imgURL2, LoadImage.getInstance(this).imageLoader)

    }
}
