package com.bce.codeek.adapter

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bce.codeek.R
import com.bce.codeek.model.Course
import java.util.ArrayList;

class CourseGVAdapter(context: Context, courseArrayList: ArrayList<Course?>,
                      private val listener: CourseItemClicked) :
    ArrayAdapter<Course?>(context, 0, courseArrayList), CourseItemClicked {

     override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var listItemView = convertView
        if (listItemView == null) {
            // Layout Inflater inflates each item to be displayed in GridView.
            listItemView = LayoutInflater.from(context).inflate(R.layout.course_template, parent, false)
        }
         val course: Course = getItem(position)!!
        val course_name = listItemView!!.findViewById<TextView>(R.id.course_name)
        val course_img = listItemView.findViewById<ImageView>(R.id.course_img)
        course_name.text = course.courseName
        course_img.setImageResource(course.imgId)

         listItemView.setOnClickListener {
             listener.courseClicked(course)
         }

        return listItemView
    }

    override fun courseClicked(position: Course) {}
}

interface CourseItemClicked {
    fun courseClicked(position: Course)
}
