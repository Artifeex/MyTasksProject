package com.example.mytasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import com.example.mytasks.databinding.ActivityMainBinding
import com.example.mytasks.presentation.TasksAdapter

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction().add(R.id.fc_list_tasks, ListTasksFragment()).commit()
    }
}