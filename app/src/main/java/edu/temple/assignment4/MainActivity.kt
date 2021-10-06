package edu.temple.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Starting>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>
    lateinit var label : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.peachCatBox,
            R.drawable.PeachCatChew,
            R.drawable.PeachCatHug,
            R.drawable.peachcatnom,
            R.drawable.PeachCatPeek,
            R.drawable.PeachCatPinch,
            R.drawable.PeachCatSip,
            R.drawable.PeachCatSwing,
            R.drawable.PeachCatTop,
            R.drawable.PeachCatWarm
        )

        heading = arrayOf(

        )
    }
}