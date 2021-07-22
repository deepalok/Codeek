package com.bce.codeek.activity

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import com.bce.codeek.R
import com.bce.codeek.adapter.CourseGVAdapter
import com.bce.codeek.adapter.CourseItemClicked
import com.bce.codeek.model.Course
import java.util.*


class MainActivity : AppCompatActivity(), CourseItemClicked {

    lateinit var gridView: GridView

    companion object {
        const val Course_Name = "com.bce.codeek.adapter.course_name"
        const val Course_Id = "com.bce.codeek.adapter.course_id"
    }

    private val courseArrayList = ArrayList<Course?>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_view)

        // For Fullscreen ...
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        gridView = findViewById(R.id.gridView)

        courseArrayList.add(Course(1, "C", R.drawable.c))
        courseArrayList.add(Course(2, "C++", R.drawable.cplus))
        courseArrayList.add(Course(3, "Java", R.drawable.java))
        courseArrayList.add(Course(4, "Python", R.drawable.python))
        courseArrayList.add(Course(7, "DSA", R.drawable.dsa))
        courseArrayList.add(Course(5, "Javascript", R.drawable.javascript))
        courseArrayList.add(Course(6, "C Sharp", R.drawable.csharp))
        courseArrayList.add(Course(17, "Kotlin", R.drawable.kotlin))
        courseArrayList.add(Course(8, "Android Development", R.drawable.android))
        courseArrayList.add(Course(9, "Web\nDevelopment", R.drawable.web))
        courseArrayList.add(Course(16, "Machine Learning", R.drawable.machine))
        courseArrayList.add(Course(18, "Data Science", R.drawable.data_science))
        courseArrayList.add(Course(10, "Ethical Hacking", R.drawable.hack))
        courseArrayList.add(Course(11, "Git/Github", R.drawable.github))
        courseArrayList.add(Course(13, "Coding Platforms", R.drawable.platforms))
        courseArrayList.add(Course(15, "List of Some Top Companies", R.drawable.companies))
        courseArrayList.add(Course(12, "Placement Series", R.drawable.placement))
        courseArrayList.add(Course(14, "Interview Puzzles", R.drawable.puzzel))
        //courseArrayList.add(new Course(19,"???", R.drawable.coming_soon));

        val ad = CourseGVAdapter(this, courseArrayList, this)
        gridView.setAdapter(ad)
    }

    override fun courseClicked(course: Course) {

        val id = course.id
        val name = course.courseName

        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra(Course_Name, name)
        intent.putExtra(Course_Id, id)
        startActivity(intent)

/*        // C
        if (id == 1) {
            val intent = Intent(this, C::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // C++
        else if (id == 2) {
            val intent = Intent(this, C_Plus::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Java
        else if (id == 3) {
            val intent = Intent(this, Java::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Python
        else if (id == 4) {
            val intent = Intent(this, Python::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // JavaScript
        else if (id == 5) {
            val intent = Intent(this, Javascript::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // C#
        else if (id == 6) {
            val intent = Intent(this, Csharp::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // DSA
        else if (id == 7) {
            val intent = Intent(this, DSA::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Android
        else if (id == 8) {
            val intent = Intent(this, Android::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Web
        else if (id == 9) {
            val intent = Intent(this, Web::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Ethical Hacking
        else if (id == 10) {
            val intent = Intent(this, Hacking::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Git/Github
        else if (id == 11) {
            val intent = Intent(this, Github::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Placement Series
        else if (id == 12) {
            val intent = Intent(this, PlacementSeries::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Coding Platforms
        else if (id == 13) {
            val intent = Intent(this, CodingPlatforms::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Puzzles
        else if (id == 14) {
            val intent = Intent(this, Puzzles::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Companies
        else if (id == 15) {
            val intent = Intent(this, Companies::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Machine Learning
        else if (id == 16) {
            val intent = Intent(this, MachineLearning::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Kotlin
        else if (id == 17) {
            val intent = Intent(this, Kotlin::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }
        // Data Science
        else if (id == 18) {
            val intent = Intent(this, DataScience::class.java)
            intent.putExtra(Course_Name, name)
            startActivity(intent)
        }*/

    }
}

