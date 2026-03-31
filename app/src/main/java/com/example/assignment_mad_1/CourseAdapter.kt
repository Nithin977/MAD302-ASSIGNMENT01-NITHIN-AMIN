/**
 * Course Code: MAD302
 * Student Name: Nithin Amin
 * Student ID: A00194332
 * Date of Submission: March 30, 2026
 * Description: Adapter for RecyclerView to display courses and handle clicks.
 */
package com.example.assignment_mad_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(
    private val courseList: List<Course>,
    private val onClick: (Course) -> Unit
) : RecyclerView.Adapter<CourseAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val code: TextView = itemView.findViewById(R.id.textViewCode)
        val name: TextView = itemView.findViewById(R.id.textViewName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val course = courseList[position]

        holder.code.text = course.code
        holder.name.text = course.name

        holder.itemView.setOnClickListener {
            onClick(course)
        }
    }

    override fun getItemCount(): Int = courseList.size
}