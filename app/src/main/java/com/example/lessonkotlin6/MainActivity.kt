package com.example.lessonkotlin6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lessonkotlin6.adapter.LessonAdapter
import com.example.lessonkotlin6.model.LessonChar

class MainActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView? = null
    private var gridLayoutManager:GridLayoutManager? = null
    private var arrayList:ArrayList<LessonChar>? = null
    private var lessonAdapter:LessonAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.my_recycler_view)
        gridLayoutManager = GridLayoutManager(applicationContext,2,LinearLayoutManager.VERTICAL,false)
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        arrayList = ArrayList()
        arrayList = setDataInList()
        lessonAdapter = LessonAdapter(applicationContext,arrayList!!)
        recyclerView?.adapter = lessonAdapter
    }
    private fun setDataInList():ArrayList<LessonChar>{
        var items:ArrayList<LessonChar> = ArrayList()

        items.add(LessonChar(R.drawable.bio,"Biology"))
        items.add(LessonChar(R.drawable.eng,"English"))
        items.add(LessonChar(R.drawable.gej,"Geography"))
        items.add(LessonChar(R.drawable.histo,"History"))
        items.add(LessonChar(R.drawable.math,"Math"))
        items.add(LessonChar(R.drawable.phis,"Physic"))


        return items
    }
}