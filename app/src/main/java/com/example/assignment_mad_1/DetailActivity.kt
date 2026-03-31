package com.example.assignment_mad_1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private lateinit var code: TextView
    private lateinit var name: TextView
    private lateinit var description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        code = findViewById(R.id.textViewCourseCode)
        name = findViewById(R.id.textViewCourseName)
        description = findViewById(R.id.textViewCourseDescription)

        code.text = intent.getStringExtra("course_code")
        name.text = intent.getStringExtra("course_name")
        description.text = intent.getStringExtra("course_description")
    }
}