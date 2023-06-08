package com.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView : RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    lateinit var imageID : Array<Int>
    lateinit var headline : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageID = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f
        )
        headline = arrayOf(
            "News #1: Cryptocurrencies experience a major price downfall once again!",
            "News #2: Say goodbye to face masks! The Covid-19 pandemic is finally over.",
            "News #3: Buckle up, thriller lovers. The new Stephen King novel is on its way!",
            "News #4: After a decade, a sequel to a beloved computer game \"Dragon's Dogma 2\" is finally announced!",
            "News #5: The \"One Piece\" manga is about to take a month-long break due to the author's health condition.",
            "News #6: Keanu Reeves is being accused by multiple women of extremely appropriate behavior."
            )
        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()

    }

    private fun getUserdata() {
        for (i in imageID.indices){
            val news = News(imageID[i], headline[i])
            newArrayList.add(news)
        }
        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

}