package com.example.assignment_mad_1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var courseAdapter: CourseAdapter
    private lateinit var courseList: List<Course>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewCourses)

        courseList = listOf(
            Course("MAD101", "Java Programming", "Introduction to Java programming concepts."),
            Course("MAD102", "Web Development", "Learn HTML, CSS, and JavaScript."),
            Course("MAD201", "Database Systems", "Understand SQL and database design."),
            Course("MAD202", "Mobile App Development", "Develop Android apps using Kotlin."),
            Course("MAD301", "Software Engineering", "Study software development lifecycle."),
            Course("MAD302", "Android Development", "Learn RecyclerView and activities.")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)

        courseAdapter = CourseAdapter(courseList) { selectedCourse ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("course_code", selectedCourse.code)
            intent.putExtra("course_name", selectedCourse.name)
            intent.putExtra("course_description", selectedCourse.description)
            startActivity(intent)
        }

        recyclerView.adapter = courseAdapter
    }
}