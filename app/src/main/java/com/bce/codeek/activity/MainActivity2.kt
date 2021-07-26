package com.bce.codeek.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bce.codeek.R
import com.bce.codeek.adapter.DetailsRVAdapter
import com.bce.codeek.adapter.DetailsRVItemClicked
import com.bce.codeek.model.Details


class MainActivity2 : AppCompatActivity(), DetailsRVItemClicked {

    private lateinit var recyclerView: RecyclerView
    lateinit var heading: TextView
    private var courseId: Int = 0
    private val details = ArrayList<Details>()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_view)

        recyclerView = findViewById(R.id.recyclerView)
        heading = findViewById(R.id.heading)

        val intent = intent
        val courseName = intent.getStringExtra(MainActivity.Course_Name)
        courseId = intent.getIntExtra(MainActivity.Course_Id,0)

        heading.text = courseName
        showDetails()

        recyclerView.layoutManager = LinearLayoutManager(this)
        val ad = DetailsRVAdapter(details, this)
        recyclerView.adapter = ad
    }

    // Function to assign the values to ArrayList<Details>
    @SuppressLint("SetTextI18n")
    private fun showDetails() {
    // 1. C ...
        if(courseId==1) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"C in one Video"))
            details.add(Details(5,"C free course (Coursera)"))
            details.add(Details(6,"C paid course (Udemy)"))
            details.add(Details(7,"Project Ideas"))
            details.add(Details(8,"C Book PDF"))
            details.add(Details(9,"Interview Questions"))
        }
    // 2. C++
        if(courseId==2) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"C++ in one Video"))
            details.add(Details(5,"C++ free course (Udemy)"))
            details.add(Details(6,"C++ paid course (Udemy)"))
            details.add(Details(7,"Object Oriented Data Structure in C++"))
            details.add(Details(8,"Building Simple Pong Game using C++"))
            details.add(Details(9,"Project Ideas"))
            details.add(Details(10,"Interview Questions"))
            details.add(Details(11,"A Complete to Programming in C++ (Book)"))
        }
    // 3. Java
        if(courseId==3) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"Java in one Video"))
            details.add(Details(5,"Java free course (Udemy)"))
            details.add(Details(6,"Java paid course (Udemy)"))
            details.add(Details(7,"Teach Yourself Java in 21 days (book)"))
            details.add(Details(8,"Introduction to programming using java (book)"))
            details.add(Details(9,"Project Ideas"))
            details.add(Details(10,"Interview Questions"))
            details.add(Details(11,"A Complete to Programming in C++ (Book)"))
        }
    // 4. Python
        if(courseId==4) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"Python in one Video"))
            details.add(Details(5,"Python free course (Coursera)"))
            details.add(Details(6,"Python paid course (Udemy)"))
            details.add(Details(7,"Python for everybody (book)"))
            details.add(Details(8,"Python 3 for Absolute Beginners (book)"))
            details.add(Details(9,"Project Ideas"))
            details.add(Details(10,"Interview Questions"))
            details.add(Details(11,"A Complete to Programming in C++ (Book)"))
        }
    // 5. JavaScript
        if(courseId==5) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"YouTube Recommended Course 3"))
            details.add(Details(5,"JavaScript in one Video"))
            details.add(Details(6,"JavaScript free course (Udemy)"))
            details.add(Details(7,"JavaScript paid course (Udemy)"))
            details.add(Details(8,"Project Ideas"))
            details.add(Details(9,"Interview Questions"))
            details.add(Details(10,"McGraw Hill - JavaScript a Beginners Guide (book 1)"))
            details.add(Details(11, "JavaScript for impatient programmers (book 2)"))
        }
    // 6. C#
        if(courseId==6) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Channel"))
            details.add(Details(3,"YouTube Recommended Course 1"))
            details.add(Details(4,"YouTube Recommended Course 2"))
            details.add(Details(5, "C# in one Video"))
            details.add(Details(6, "C# free course (Udemy)"))
            details.add(Details(7, "C# paid course (Udemy)"))
            details.add(Details(8, "Project Ideas"))
            details.add(Details(9, "Interview Questions"))
            details.add(Details(10, "Fundamentals of Computer Programming with C# (Book)"))
        }
    // 7. DSA
        if(courseId==7) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"YouTube Recommended Course 3"))
            details.add(Details(5, "Complete DS and Algo 450 Questions"))
            details.add(Details(6, "DSA in C++ free course (Udemy)"))
            details.add(Details(7, "DSA in java paid Course (Udemy)"))
            details.add(Details(8, "DSA in Python paid course (Udemy)"))
            details.add(Details(9, "DSA short notes PDF"))
            details.add(Details(10, "DSA in Java book PDF"))
        }
    //8. Android Development
        if(courseId==8) {
            details.add(Details(1, "Road Map 1"))
            details.add(Details(2, "Road Map 2"))
            details.add(Details(3,"YouTube Recommended Course 1"))
            details.add(Details(4,"YouTube Recommended Course 2"))
            details.add(Details(5, "Android in one Video"))
            details.add(Details(6, "Android free course 1 (Udacity)"))
            details.add(Details(7, "Android free course 2 (Coding Ninjas)"))
            details.add(Details(8, "Project Ideas"))
            details.add(Details(9, "Interview Questions"))
            details.add(Details(10, "Professional Android 4 Application Development (book)"))
        }
    // 9. Web Development
        if(courseId==9) {
            heading.text = "Web Development"
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4, "React Tutorial"))
            details.add(Details(5, "Node.js Tutorial"))
            details.add(Details(6, "Django Tutorial"))
            details.add(Details(7, "MongoDB Tutorial"))
            details.add(Details(8, "Web Development free course (Coursera)"))
            details.add(Details(9, "Web Development paid course (Udemy)"))
            details.add(Details(10, "30 days 30 submits"))
            details.add(Details(11, "Vanilla Javascript Projects"))
            details.add(Details(12, "Interview Questions"))
        }
    // 10. Ethical Hacking
        if(courseId==10) {
            details.add(Details(1, "Road Map 1"))
            details.add(Details(2, "Road Map 2"))
            details.add(Details(3,"YouTube Recommended Course 1"))
            details.add(Details(4,"YouTube Recommended Course 2"))
            details.add(Details(5, "Ethical Hacking one video"))
            details.add(Details(6, "Ethical Hacking using Python"))
            details.add(Details(7, "Fundamentls of computer hacking Free course (Udemy)"))
            details.add(Details(8, "Ethical Haccking Paid Course (Udemy)"))
            details.add(Details(9, "5 cyber security projects"))
        }
    // 11. Git/Github
        if(courseId==11) {
            details.add(Details(1, "Basic Git Commands"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4, "Git/Github in one Video"))
            details.add(Details(5, "Git/Github course free course (Coursera)"))
            details.add(Details(6, "Git/Github course free course (Udacity)"))
            details.add(Details(7, "Interview Questions"))
        }
    // 12. Placement Series
        if(courseId==12) {
            details.add(Details(1, "Road Map"))
            details.add(Details(2, "Off-Campus Road Map"))
            details.add(Details(3, "Final Year Placement Road Map"))
            details.add(Details(4, "Youtube recommended playlist 1"))
            details.add(Details(5, "Youtube recommended playlist 2"))
        }
    // 13. Coding Platforms
        if(courseId==13) {
            details.add(Details(1, "Geeks for Geeks"))
            details.add(Details(2, "Hacker Rank"))
            details.add(Details(3, "Hacker Earth"))
            details.add(Details(4, "Code Chef"))
            details.add(Details(5, "Code Forces"))
            details.add(Details(6, "Leet Code"))
            details.add(Details(7, "Sphere Online Judge (SPOJ)"))
        }
    // 14. Interview Puzzles
        if(courseId==14) {
            details.add(Details(1, "YouTube Recommended Channel"))
            details.add(Details(2, "40 puzzels most frequently asked in HR round"))
            details.add(Details(3, "YouTube Recommended Course"))
            details.add(Details(4, "Technical Interview Puzzel\\n(Google | Adobe | Microsoft)"))
            details.add(Details(5, "City of Truth and City of Lies\\n(Amazon | Microsoft)"))
        }
    // 15. List of some Top Companies
        if(courseId==15) {
            details.add(Details(1, "De Shaw"))
            details.add(Details(2, "Goldman Sachs"))
            details.add(Details(3, "Adobe"))
            details.add(Details(4, "Apple"))
            details.add(Details(5, "Google"))
            details.add(Details(6, "Microsoft"))
            details.add(Details(7, "Amazon"))
            details.add(Details(8, "Flipkart"))
            details.add(Details(9, "Uber"))
            details.add(Details(10, "Myntra"))
            details.add(Details(11, "Atlassian"))
            details.add(Details(12, "Tower Research"))
            details.add(Details(13, "Code Nation"))
            details.add(Details(14, "Alphonso"))
            details.add(Details(15, "Urban Company"))
            details.add(Details(16, "Zomato"))
            details.add(Details(17, "Qualcomn"))
            details.add(Details(18, "Samsung"))
            details.add(Details(19, "Make My Trip"))
            details.add(Details(21, "Tata Consultancy Service (TCS)"))
            details.add(Details(22, "PayTm"))
            details.add(Details(23, "Intuit"))
            details.add(Details(24, "Oyo"))
            details.add(Details(25, "Wipro"))
            details.add(Details(26, "Cognizant"))
            details.add(Details(27, "Infosys"))
            details.add(Details(28, "Facebook"))
            details.add(Details(20, "Accenture"))
        }
    // 16. Machine Learning
        if(courseId==16) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4,"YouTube Recommended Course 3"))
            details.add(Details(5, "Machine Learning in one Video"))
            details.add(Details(6, "Machine Learning free Course (Coursera)"))
            details.add(Details(7, "Machine Learning paid course (udemy)"))
            details.add(Details(8, "Project Ideas"))
            details.add(Details(9, "Interview Questions"))
        }
    // 17. Kotlin
        if(courseId==17) {
            details.add(Details(1, "Kotlin vs Java"))
            details.add(Details(2, "Kotlin vs Flutter"))
            details.add(Details(3,"YouTube Recommended Course 1"))
            details.add(Details(4,"YouTube Recommended Course 2"))
            details.add(Details(5, "Kotlin in one Video"))
            details.add(Details(6, "Kotlin free course (Udacity)"))
            details.add(Details(7, "The Complete Android Kotlin Developer paid Course (Udemy)"))
            details.add(Details(8, "Interview Questions"))
            details.add(Details(9, "Programming Kotlin (Book)"))
        }
    // 18. Data Science
        if(courseId==18) {
            details.add(Details(1,"Road Map"))
            details.add(Details(2,"YouTube Recommended Course 1"))
            details.add(Details(3,"YouTube Recommended Course 2"))
            details.add(Details(4, "Data Science in one Video"))
            details.add(Details(5, "Data Science free course 1 (Coursera)"))
            details.add(Details(6, "Data Science free course 2 (Coursera)"))
            details.add(Details(7, "Project Ideas"))
            details.add(Details(8, "Interview Questions"))
        }

    }

    // Function to open the desired link ...
    fun openLink(string: String?) {
        val appPage = Uri.parse(string)
        val intent = Intent(Intent.ACTION_VIEW, appPage)
        startActivity(intent)
    }

    // Function to open the desired link through Custom Tabs ...
    fun customTabs(link : String) {
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent = builder.build()
        customTabsIntent.launchUrl(this, Uri.parse(link))
    }

    // Instance of interface for RecyclerView item click listener
    override fun onItemClicked(item: Details) {
        val id = item.id
        var link = ""

    // 1. C
        if(courseId==1){
            // Road Map ...
            // Ashok Talk ...
            if(id==1) link = "vnd.youtube:" + "/watch?v=PrQuYjTfqhQ"

            // Youtube Recommended Course 1 ...
            // Code with Harry ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9aiXlHcLx-mDH1Qul38wD3aR"

            // Youtube Recommended Course 2 ...
            // Neso Academy ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLBlnK6fEyqRggZZgYpPMUxdY1CYkZtARR"

            // C in one video ...
            // Code with Harry ...
            if(id==4) link = "https://www.youtube.com/watch?v=YXcgD8hRHYY"

            // C free course ...Coursera
            if(id==5) link = "https://www.coursera.org/specializations/c-programming"

            // C paid course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/c-programming-for-beginners-/"

            // C Project Ideas ...
            // Bhavesh Verma ...
            if(id==7) link = "https://www.youtube.com/playlist?list=PLAdlOlcKNiQva1CC7mCBPltiLJZ5gqr2y"

            // Let Us C book PDF ...
            if(id==8) link = "https://www.drive.google.com/file/d/1gcSXXB8B0ign7qSPaIPuNunERNdYZ9S7/view?usp=sharing"

            // C Interview Questions ...
            // edureka! ...
            if(id==9) link = "https://www.youtube.com/watch?v=MJ2N2CjHb4U&t=2s"

        }

    // 2. C++
        if(courseId==2){
            // Road Map ...
            // Luv ...
            if(id==1) link = "https://www.youtube.com/watch?v=RquBcwvgMbM"

            // Youtube recommended course 1 ...
            // Apna College -> Aman Dhatterwal ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ"

            // Youtube recommended course 2 ...
            // Code with Harry ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL"

            // C++ in one video ...
            // Code with Harry ...
            if(id==4) link = "https://www.youtube.com/watch?v=yGB9jhsEsr8"

            // C++ Free Course ...Udemy
            if(id==5) link = "https://www.udemy.com/course/free-learn-c-tutorial-beginners/"

            // C++ Paid Course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/beginning-c-plus-plus-programming/"

            // Object Oriented Data Structure in C++ ...Coursera free
            if(id==7) link = "https://www.coursera.org/learn/cs-fundamentals-1"

            // Building Simple Pong Game using C++ ... coursera free
            if(id==8) link = "https://www.coursera.org/projects/implement-pong-game"

            // Project Ideas ...
            // Abubker AI-ATTAS ...
            if(id==9) link = "https://www.youtube.com/playlist?list=PLsPse_rAwAIpjis9XwQXs-uz7gwfu-pcd"


            // Interview Questions ...
            // CppNuts ...
            if(id==10) link = "https://www.youtube.com/watch?v=bFtkHJy9kIU&list=PLk6CEY9XxSIDVpUt0yxC0b3IqDk63U7Bg"

            // C++ Book PDF ...
            // A Complete to Programming in C++ ...
            if(id==11) link = "http://www.lmpt.univ-tours.fr/~volkov/C++.pdf"

        }

    // 3. Java
        if(courseId==3){
            // Road Map ...
            // edureka! ...
            if(id==1) link = "https://www.youtube.com/watch?v=c4z-LkNea1k"

            // YouTube recommended video 1 ...
            // Apni Kaksha -> Anuj Bhaiya ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLKKfKV1b9e8ps6dD3QA5KFfHdiWj9cB1s"

            // YouTube recommended video 2 ...
            // Code with Harry ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q"

            // Java in one video ...
            // Anuj Bhaiya ...
            if(id==4) link = "https://www.youtube.com/watch?v=aQatrXw0njs&list=PLUcsbZa0qzu1nk21ebpFS_q7iMkJ3VOzz&index=1"

            // Java free course ...Udemy
            if(id==5) link = "https://www.udemy.com/course/java-programming-basics/"

            // Java paid course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/java-the-complete-java-developer-course/?utm_source=adwords&utm_medium=udemyads&utm_campaign=Java_v.PROF_la.EN_cc.INDIA_ti.6336&utm_content=deal4584&utm_term=_._ag_120598242946_._ad_515258165196_._kw_java+training+online+free_._de_c_._dm__._pl__._ti_kwd-317964873746_._li_1007749_._pd__._&matchtype=e&gclid=CjwKCAjwtdeFBhBAEiwAKOIy562DHM90X4wt8VbHKy7kz_Ep7zJm5D_VDx9xq30vhOpLKKcvcrwuFRoCMX4QAvD_BwE"

            // Java Book PDF ...
            // Teach Yourself JAva in 21 days ...
            if(id==7) link = "https://www.cs.cmu.edu/afs/cs.cmu.edu/user/gchen/www/download/java/LearnJava.pdf"

            // Java Book PDF ...
            // Introduction to programming using java ...
            if(id==8) link = "http://www.iitk.ac.in/esc101/share/downloads/javanotes5.pdf"

            // Project Ideas ...
            // Begin Coding fast ...
            if(id==9) link = "https://www.youtube.com/playlist?list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa"

            // Interview Questions ...
            // Durga Sir ...
            if(id==10) link = "https://www.youtube.com/playlist?list=PLYPjPMiw3_YsVockWfuuhoP86YPDUXp4f"

        }

    // 4. Python
        if(courseId==4){
            // Road Map ...
            // Krish Naik ...
            if(id==1) link = "https://www.youtube.com/watch?v=bPrmA1SEN2k"

            // YouTube recommended video 1 ...
            // Code with Harry ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9agICnT8t4iYVSZ3eykIAOME"

            // YouTube recommended video 2 ...
            // Telusko ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3"

            // Python in one video ...
            // Code with Harry ...
            if(id==4) link = "https://www.youtube.com/watch?v=ihk_Xglr164"

            // Python free course ...Coursera
            if(id==5) link = "https://www.coursera.org/specializations/python-3-programming"

            // Python paid course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/python-core-and-advanced/?utm_source=adwords&utm_medium=udemyads&utm_campaign=WebDevelopment_v.PROF_la.EN_cc.INDIA_ti.8322&utm_content=deal4584&utm_term=_._ag_82381207818_._ad_437511380776_._kw__._de_c_._dm__._pl__._ti_dsa-774930032609_._li_1007749_._pd__._&matchtype=b&gclid=CjwKCAjwtdeFBhBAEiwAKOIy5yv5rfBb15lXjX38MOXWRvZn2Pf6JXynGKIBncYj-_IrUK1OKaemgxoCM6gQAvD_BwE"

            // Python Book PDF ...
            // Python for everybody ...
            if(id==7) link = "http://do1.dr-chuck.com/pythonlearn/EN_us/pythonlearn.pdf"

            // Python Book PDF ...
            // Python 3 for Absolute Beginners ...
            if(id==8) link = "http://index-of.es/Python/Python%203%20for%20Absolute%20Beginners.pdf"

            // Project Ideas ...
            // I know python ...
            if(id==9) link = "https://www.youtube.com/playlist?list=PL288dDBJtFXCApnk8UTDHPTQnhDW-3CX2"

            // Interview Questions ...
            // Intellipaat ...
            if(id==10) link = "https://www.youtube.com/watch?v=XwcJ9_hijdk"

        }

    // 5. JavaScript
        if(courseId==5){
            // Road Map ...
            // edureka! ...
            if(id==1) link = "https://www.youtube.com/watch?v=ag0-D-srh9E"

            // Youtube recommended course 1 ...
            // Code with Harry ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9ajyk081To1Cbt2eI5913SsL"

            // Youtube recommended course 2 ...
            // Hitesh Choudhary ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLRAV69dS1uWSxUIk5o3vQY2-_VKsOpXLD"

            // Youtube recommended course 3 ...
            // Yahoo Baba ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PL0b6OzIxLPbx-BZTaWu_AF7hsKo_Fvsnf"

            // Javascript in one video ...
            // edureka! ...
            if(id==5) link = "https://www.youtube.com/watch?v=o1IaduQICO0"

            // Javascript free course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/javascript-essentials/"

            // // Javascript paid course ...Udemy ...
            if(id==7) link = "https://www.udemy.com/course/javascript-training/?utm_source=adwords&utm_medium=udemyads&utm_campaign=WebDevelopment_v.PROF_la.EN_cc.INDIA_ti.8322&utm_content=deal4584&utm_term=_._ag_82381207578_._ad_437511380638_._kw__._de_c_._dm__._pl__._ti_dsa-774930035449_._li_1007749_._pd__._&matchtype=b&gclid=Cj0KCQjw2NyFBhDoARIsAMtHtZ6VzDapE-6e-cZBddmTukcW0Y0odROdz9Yod_drUNK-WBSu4CecqsMaAs90EALw_wcB"

            // Project Ideas ...
            // Paras Mahto ...
            if(id==8) link = "https://www.youtube.com/playlist?list=PLYf7q79MjSxSccjUjKWICwRpUSZnFpkCR"

            // Interview Questions ...
            // edurela! ...
            if(id==9) link = "https://www.youtube.com/watch?v=kl2bM9e-jJc"

            // McGraw Hill - JavaScript a Beginners Guide book PDF ...
            if(id==10) link = "http://www.mysearch.org.uk/website2/pdf/36.1.pdf"

            // JavaScript for impatient programmers book PDF ...
            if(id==11) link = "https://exploringjs.com/impatient-js/downloads/impatient-js-preview-book.pdf"

        }

    // 6. C#
        if(courseId==6){
            // Road Map ...
            // IAmTimCorey ...
            if(id==1) link = "https://www.youtube.com/watch?v=LUv20QxXjfw"

            // YouTube Recommended Channel ...
            // IAmTimCorey ...
            if(id==2) link = "https://www.youtube.com/user/IAmTimCorey/"

            // Youtube Recommended course 1 ...
            // Learning Never Ends ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLX07l0qxoHFLZftsVKyj3k9kfMca2uaPR"

            // Youtube Recommended course 2 ...
            // thenewboston ...
            if(id==4) link = "https://www.youtube.com/watch?v=SuLiu5AK9Ps"

            // C# in one video ...
            // Code with Harry ...
            if(id==5) link = "https://www.youtube.com/watch?v=SuLiu5AK9Ps"

            // C# free course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/understandingc/"

            // C# paid course ...
            if(id==7) link = "https://www.udemy.com/course/csharp-tutorial-for-beginners/?LSNPUBID=vedj0cWlu2Y&ranEAID=vedj0cWlu2Y&ranMID=39197&ranSiteID=vedj0cWlu2Y-6KqXo7Mf45lCnsA_iETKjQ&utm_medium=udemyads&utm_source=aff-campaign"

            // Project Ideas ...
            // Balady Morad ...
            if(id==8) link = "https://www.youtube.com/playlist?list=PLU66ua8Ko2gaTjD02J8mW-St4WIFfMfxj"

            // Interview Questions ...
            // edureka! ...
            if(id==9) link = "https://www.youtube.com/watch?v=ipYKV3U8SyM"

            // Fundamentals of Computer Programming with C# (Book) ...
            if(id==10) link = "https://www.youtube.com/watch?v=ipYKV3U8SyM"

        }

    // 7. DSA
        if(courseId==7){
            // Road Map ...
            // Code for Cause ...
            if(id==1) link = "https://www.youtube.com/watch?v=IGMWKkcFJv8"

            // YouTube recommended video 1 ...
            // Anuj Bhaiya ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p"

            // YouTube recommended video 2 ...
            // Jenny's lectures CS/IT/ NET&JRF ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLdo5W4Nhv31bbKJzrsKfMpo_grxuLl8LU"

            // YouTube recommended video 3 ...
            // Code with Harry ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9ahIappRPN0MCAgtOu3lQjQi"

            // Complete DS and Algo 450 Questions ...
            // Love Babbar ...
            if(id==5) link = "https://www.youtube.com/watch?v=4iFALQ1ACdA"

            // DSA in C++ free course ...Udemy
            if(id==6) link = "https://www.udemy.com/course/data-structures-for-beginners-c-plusplus/"

            // DSA in Java paid course 1 ...Udemy
            if(id==7) link = "https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/"

            // DSA in Python paid course 2 ...Udemy
            if(id==8) link = "https://www.udemy.com/course/learning-data-structures-algorithms-in-python-from-scratch/"

            // DSA short notes PDF ...
            if(id==9) link = "https://www.cs.bham.ac.uk/~jxb/DSA/dsa.pdf"

            // DSA in java book PDF ...
            if(id==10) link = "https://enos.itcollege.ee/~jpoial/algorithms/GT/Data%20Structures%20and%20Algorithms%20in%20Java%20Fourth%20Edition.pdf"

        }

    // 8. Android Development
        if(courseId==8){
            // Road Map 1 ...
            // Love Babbar ...
            if(id==1) link = "https://www.youtube.com/watch?v=VaMWsm6CFss&list=PL4PCksYQGLJMtEI_0y0FWf3dz1DzB_2KU&index=4&t=235s"

            // Road Map 2 ...
            // Aman Dhatterwal ...
            if(id==2) link = "https://www.youtube.com/watch?v=TnTn6e4Pfn8"

            // YouTube recommended video 1 ...
            // Code with Harry ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9aiL0kysYlfSOUgY5rNlOhUd"

            // YouTube recommended video 2 ...
            // Android Developer ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PLknSwrodgQ72X4sKpzf5vT8kY80HKcUSe"

            // Android in one video ...
            // Code with Harry ...
            if(id==5) link = "https://www.youtube.com/watch?v=qK0QNA0sMGc"

            // Android free course 1 ...Udacity
            if(id==6) link = "https://www.udacity.com/course/new-android-fundamentals--ud851"

            // Android free course 2 ...CodingNinjas
            if(id==7) link = "https://www.codingninjas.com/free-trial-courses/digital/online-android-Development-kotlin?utm_source=google&utm_medium=%5Bsearch%5D&utm_campaign=13231765834_117862777890_p_android%20course__523514091534_c&gclid=CjwKCAjwtdeFBhBAEiwAKOIy56SBewVk0XSTW7Sy24jWw6KnhKrFFZqDvLZpA4KMAaJquO50yqKydRoCApoQAvD_BwE"

            // Project Ideas ...
            // Anuj Bhaiya ...
            if(id==8) link = "https://www.youtube.com/playlist?list=PLUcsbZa0qzu3Mri2tL1FzZy-5SX75UJfb"

            // Interview Questions ...
            // The Job Byte ...
            if(id==9) link = "https://www.youtube.com/watch?v=2kGBFhgUBdo"

            // Android Book PDF ...
            // Professional Android 4 Application Development ...
            if(id==10) link = "http://yuliana.lecturer.pens.ac.id/Android/Buku/professional_android_4_application_development.pdf"
        }

    // 9. Web Development
        if(courseId==9){
            // Road Map ...
            // Love Babbar ...
            if(id==1) link = "https://www.youtube.com/watch?v=GLk7-imcjiI&list=PL4PCksYQGLJMtEI_0y0FWf3dz1DzB_2KU&index=3"

            // YouTube recommended video 1 ...
            // Apna College -> Aman Dhatterwal ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n"

            // YouTube recommended video 2 ...
            // Code with Harry ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9agiCUZYRsvtGTXdxkzPyItg"

            // React Tutorial ...
            // The Net Ninja ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PL4cUxeGkcC9gZD-Tvwfod2gaISzfRiP9d"

            // Node.js Tutorial ...
            // The New Boston ...
            if(id==5) link = "https://www.youtube.com/playlist?list=PL6gx4Cwl9DGBMdkKFn3HasZnnAqVjzHn_"

            // Django Tutorial ...
            // The New Boston ...
            if(id==6) link = "https://www.youtube.com/playlist?list=PL6gx4Cwl9DGBlmzzFcLgDhKTTfNLfX1IK"

            // MongoDB Tutorial ...
            // The New Boston ...
            if(id==7) link = "https://www.youtube.com/playlist?list=PL6gx4Cwl9DGDQ5DrbIl20Zu9hx1IjeVhO"

            // Web Development free Course ...Coursera
            if(id==8) link = "https://www.coursera.org/learn/html-css-javascript-for-web-developers"

            // Web Development paid Course ...Udemy
            if(id==9) link = "https://www.udemy.com/course/design-and-develop-a-killer-website-with-html5-and-css3/"

            // 30 days 30 submits ...
            // WEB CIFAR ...
            if(id==10) link = "https://www.youtube.com/playlist?list=PLRv_Gd5w9e7m7wokXmB9fGtGYw100UKc0"

            // Vanilla Javascript Projects ...
            if(id==11) link = "https://www.youtube.com/playlist?list=PLRv_Gd5w9e7mmALZQWt_DJErngAFLp-aV"

            // Interview Questions ...
            if(id==12) link = "https://www.youtube.com/watch?v=P2-CwEljcMo"

        }

    // 10. Ethical Hacking
        if(courseId==10){
            // Road Map 1 ...
            // edureka! ...
            if(id==1) link = "https://www.youtube.com/watch?v=MUmjN-Fh8tY"

            // Road Map 2 ...
            // Love Babbar ...
            if(id==2) link = "https://www.youtube.com/watch?v=lTHnKCm58xQ"

            // YouTube recommended course 1 ...
            // HackerSploit ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLBf0hzazHTGOEuhPQSnq-Ej8jRyXxfYvl"

            // YouTube recommended course 2 ...
            // Masters in I.T ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PLa2xctTiNSCibSUhgYI2RT_loUJP9rDN6"

            // Ethical Hacking in one video ...
            // edureka! ...
            if(id==5) link = "https://www.youtube.com/watch?v=dz7Ntp7KQGA"

            // Ethical Hacking using Python ...
            // edureka! ...
            if(id==6) link = "https://www.youtube.com/watch?v=CV_mMAYzTxw"

            // Fundamentls of computer hacking (Free Course) ...Udemy
            if(id==7) link = "https://www.udemy.com/course/computer-hacking-fundamentals/"

            // Learn Ethical Hacking from Scratch (Paid Course) ...Udemy
            if(id==8) link = "https://www.udemy.com/course/learn-ethical-hacking-from-scratch/"

            // 5 cyber security projects ...
            // Kaushal Bhavsar ...
            if(id==9) link = "https://www.youtube.com/watch?v=H66dJ7hrGAQ"

        }

    // 11. Git/Github
        if(courseId==11){
            // Basic Git Commands...
            if(id==1) link = "https://dzone.com/articles/top-20-git-commands-with-examples"

            // YouTube recommended video 1 ...
            // The Net Ninja ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PL4cUxeGkcC9goXbgTDQ0n_4TBzOO0ocPR"

            // YouTube recommended video 2 ...
            // Code with Harry ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9agwhy658ZPA0MTStKUJTWPi"

            // Github in one video ...
            // Love Babbar ...
            if(id==4) link = "https://www.youtube.com/watch?v=uj4fy4kpaOA"

            // Github free course 1 ...Coursera
            if(id==5) link = "https://www.coursera.org/learn/introduction-git-github"

            // Github free course 2 ...Udacity
            if(id==6) link = "https://www.udacity.com/course/version-control-with-git--ud123"

            // Interview Questions ...
            if(id==7) link = "https://www.youtube.com/watch?v=8Xo3l1zv41I"

        }

    // 12. Placement Series
        if(courseId==12){
            // Road Map ...
            // Aman Dhatterwal ...
            if(id==1) link = "https://www.youtube.com/watch?v=-IBMgFbhbZU"

            // Off-Campus Road Map ...
            // Anuj Bhaiya ...
            if(id==2) link = "https://www.youtube.com/watch?v=kzIa-4xl7yU"

            // Final Year Placement Road Map ...
            // Love Babbar ...
            if(id==3) link = "https://www.youtube.com/watch?v=VY6003vijLw"

            // Youtube recommended playlist 1 ...
            // Love Babbar ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PL4PCksYQGLJM2mKe1n8LnFgcm3FRLhxZ9"

            // Youtube recommended playlist 1 ...
            // Jenny's lectures CS/IT NET&JRF ...
            if(id==5) link = "https://www.youtube.com/playlist?list=PLdo5W4Nhv31YvlDpJhvOYbM9Ap8UypgEy"

        }

    // 13. Coding Platforms
        if(courseId==13){
            // Geeks for Geeks ...
            if(id==1) link = "https://www.geeksforgeeks.org/"

            // Hacker Rank ...
            if(id==2) link = "https://www.hackerrank.com/"

            // Hacker Earth ...
            if(id==3) link = "https://www.hackerearth.com/"

            // Code Chef ...
            if(id==4) link = "https://www.codechef.com/"

            // Code Forces ...
            if(id==5) link = "https://codeforces.com/"

            // Leet Code ...
            if(id==6) link = "https://leetcode.com/"

            // Sphere Online Judge (SPOJ) ...
            if(id==7) link = "https://www.spoj.com/"

        }

    // 14. Interview Puzzles
        if(courseId==14){
            // Youtube recommended channel ...
            // LOGICALLY YOURS ...
            if(id==1) link = "https://www.youtube.com/c/LOGICALLYYOURS"

            // 40 puzzels most frequently asked in HR round ...
            // Sadhana Tutorials ...
            if(id==2) link = "https://www.youtube.com/watch?v=d6Ed1-TGER8"

            // Youtube recommended course ...
            // phantommann ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLLUqKY4VQM7ft3y1oFdlfc44Ob7Uqk5K0"

            // Technical Interview Puzzel ...Google|Adobe|Microsoft
            // Happy Faces ...
            if(id==4) link = "https://www.youtube.com/watch?v=Ce6iy8r2Q8k"

            // City of Truth and City of Lies ...Amazon
            if(id==5) link = "https://www.youtube.com/watch?v=8_RFvmok980"

        }

    // 15. List of some Top Companies
        if(courseId==15){
            // DE Shaw ...
            if(id==1) link = "https://www.deshawindia.com/"

            // Goldman Sachs ...
            if(id==2) link = "https://www.goldmansachs.com/"

            // Adobe ...
            if(id==3) link = "https://www.adobe.com/"

            // Apple ...
            if(id==4) link = "https://www.apple.com/"

            // Google ...
            if(id==5) link = "https://careers.google.com/"

            // Microsoft ...
            if(id==6) link = "https://www.microsoft.com/en-in/"

            // Amazon ...
            if(id==7) link = "https://www.amazon.jobs/en"

            // Flipkart ...
            if(id==8) link = "https://www.flipkartcareers.com/#!/joblist"

            // Uber ...
            if(id==9) link = "https://www.uber.com/us/en/careers/"

            // Myntra ...
            if(id==10) link = "https://careers.myntra.com/jobs"

            // Atlassian ...
            if(id==11) link = "https://www.atlassian.com/company/careers/all-jobs"

            // Tower Research ...
            if(id==12) link = "https://www.tower-research.com/open-positions"

            // Code Nation ...
            if(id==13) link = "http://codenation.co.in/hiringprocess.html"

            // Alphonso ...
            if(id==14) link = "https://alphonso.tv/careers/"

            // Urban Company ...
            if(id==15) link = "https://careers.urbancompany.com/"

            // Zomato ...
            if(id==16) link = "https://www.zomato.com/careers"

            // Qualcomm ...
            if(id==17) link = "https://www.qualcomm.com/company/careers"

            // Samsung ...
            if(id==18) link = "https://www.samsung.com/in/aboutsamsung/careers/"

            // Make my Trip ...
            if(id==19) link = "https://careers.makemytrip.com/jobs"

            // Accenture ...
            if(id==20) link = "https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjAkJ7rzfnwAhVMaioKHcZwCYwYABAAGgJ0bQ&ae=2&ohost=www.google.com&cid=CAESQeD2_B1H-K53BPY58AeQ0fi51LUFajls9SBGgwGLl2cK3fBY56kzMzHP26hyCHXGN0q-UcKyQYwToXBFUzwJvnny&sig=AOD64_3S9Q4BOX1K7t_yoLVI2RQS4wZM4w&q&adurl&ved=2ahUKEwi42ZDrzfnwAhWaXSsKHVQaB68Q0Qx6BAgCEAE"

            // Tata Consultancy Service (TCS) ...
            if(id==21) link = "https://www.tcs.com/careers"

            // PayTM ...
            if(id==22) link = "https://paytm.com/careers/"

            // Intuit ...
            if(id==23) link = "https://www.intuit.com/careers/"

            // Oyo ...
            if(id==24) link = "https://www.oyorooms.com/careers/"

            // Wipro ...
            if(id==25) link = "https://careers.wipro.com/"

            // Cognizant ...
            if(id==26) link = "https://careers.cognizant.com/in/en"

            // Infosys ...
            if(id==27) link = "https://www.infosys.com/careers/apply.html"

            // Facebook ...
            if(id==28) link = "https://www.facebook.com/jobs/"

        }

    // 16. Machine Learning
        if(courseId==16){
            // Road Map ...
            // Love Babbar ...
            if(id==1) link = "https://www.youtube.com/watch?v=mlxoB3wI9eY"

            // Youtube recommended course 1 ...
            // Simplilearn ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PLEiEAq2VkUULYYgj13YHUWmRePqiu8Ddy"

            // Youtube recommended course 2 ...
            //Krish Naik ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLZoTAELRMXVPBTrWtJkn3wWQxZkmTXGwe"

            // Youtube recommended course 3 ...
            // Code with Harry ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG"

            // Machine Learning in one video ...
            // edureka! ...
            if(id==5) link = "https://www.youtube.com/watch?v=b2q5OFtxm6A"

            // Machine Learning free course ...Coursera
            if(id==6) link = "https://www.coursera.org/learn/machine-learning"

            // Machine Learning paid course ...Udemy
            if(id==7) link = "https://www.udemy.com/course/machinelearning/"

            // Project Ideas ...
            // Krish Naik ...
            if(id==8) link = "https://www.youtube.com/watch?v=K22hmfeUx2w"

            // Interview Questions ...
            // edureka! ...
            if(id==9) link = "https://www.youtube.com/watch?v=t6gOpFLt-Ks"

        }

    // 17. Kotlin
        if(courseId==17){
            // Kotlin vs Java ...
            // edureka! ...
            if(id==1) link = "https://www.youtube.com/watch?v=eVLPnewCMRI"

            // Kotlin vs Flutter ...
            if(id==2) link = "https://www.youtube.com/watch?v=RvE_3u60lGI"

            // YouTube recommended course 1 ...
            // Telusko ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLsyeobzWxl7rooJFZhc3qPLwVROovGCfh"

            // YouTube recommended course 2 ...
            // Smartherd ...
            if(id==4) link = "https://www.youtube.com/playlist?list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR"

            // Kotlin in one video ...
            // Anuj Bhaiya ...
            if(id==5) link = "https://www.youtube.com/watch?v=mnkzx3TwbV8"

            // Kotlin free course ...Udacity
            if(id==6) link = "https://www.udacity.com/course/kotlin-for-android-developers--ud888"

            // The Complete Android Kotlin Developer Course paid ...Udemy
            if(id==7) link = "https://www.udemy.com/course/the-complete-kotlin-developer-course/?LSNPUBID=jU79Zysihs4&ranEAID=jU79Zysihs4&ranMID=39197&ranSiteID=jU79Zysihs4-YkgVzNyEVPhDT8fxRGMD1w&utm_medium=udemyads&utm_source=aff-campaign"

            // Interview Questions ...
            // Coding Blocks ...
            if(id==8) link = "https://www.youtube.com/watch?v=uXYqLh7nikw"

            // Programming Kotlin (Book) ...
            if(id==9) link = "https://www.programmer-books.com/wp-content/uploads/2018/07/Programming-Kotlin.pdf"

        }

    // 18. Data Science
        if(courseId==18){
            // Road Map ...
            // Code with Harry ...
            if(id==1) link = "https://www.youtube.com/watch?v=XnNzck5-HdQ"

            // YouTube recommended course 1 ...
            // edureka! ...
            if(id==2) link = "https://www.youtube.com/playlist?list=PL9ooVrP1hQOGR57Y4g1LFhn1JXVgn1lkX"

            // YouTube recommended course 2 ...
            // Simplilearn ...
            if(id==3) link = "https://www.youtube.com/playlist?list=PLEiEAq2VkUUIEQ7ENKU5Gv0HpRDtOphC6"

            // Data Science in one video ...
            // edureka! ...
            if(id==4) link = "https://www.youtube.com/watch?v=aGu0fbkHhek"

            // free course 1 ...Coursera
            if(id==5) link = "https://www.coursera.org/professional-certificates/ibm-data-science?utm_source=gg&utm_medium=sem&campaignid=8985360908&utm_campaign=10-IBM-Data-Science-IN&&utm_content=10-IBM-Data-Science-IN&adgroupid=86017337010&device=c&keyword=data%20science%20mooc&matchtype=b&network=g&devicemodel=&adpostion=&creativeid=489196859736&hide_mobile_promo&gclid=Cj0KCQjw--GFBhDeARIsACH_kdZFEwPj0ECMK8sOPWU8UoPGf6327NhS1-CVvFX4XuWjog59XWPpoKUaAipBEALw_wcB"

            // free course 2 ...Coursera
            if(id==6) link = "https://www.coursera.org/specializations/jhu-data-science"

            // Project Ideas ...
            // Krish Naik ...
            if(id==7) link = "https://www.youtube.com/playlist?list=PLZoTAELRMXVNUcr7osiU7CCm8hcaqSzGw"

            // Interview Questions ...
            // edureka! ...
            if(id==8) link = "https://www.youtube.com/watch?v=tTAieUcNHdY"

        }

        //openLink(link)
        customTabs(link)
    }
}