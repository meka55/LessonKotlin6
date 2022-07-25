package com.example.lessonkotlin6.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lessonkotlin6.R
import com.example.lessonkotlin6.model.LessonChar

class LessonAdapter(var context: Context, var arrayList: ArrayList<LessonChar>):
    RecyclerView.Adapter<LessonAdapter.ItemHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder{

        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_lesson,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var lessonChar:LessonChar = arrayList.get(position)

        holder.icons.setImageResource(lessonChar.iconsChar!!)
        holder.lessons.text = lessonChar.lessonChar

        holder.lessons.setOnClickListener{
            Toast.makeText(context,lessonChar.lessonChar, Toast.LENGTH_LONG).show()
        }

    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var icons = itemView.findViewById<ImageView>(R.id.icons_image)
        var lessons = itemView.findViewById<TextView>(R.id.lessonTv)
    }
}