package com.example.mytasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mytasks.databinding.ListTodoItemsLayoutBinding
import com.example.mytasks.databinding.TodoItemLayoutBinding
import com.example.mytasks.domain.TodoItem
import com.example.mytasks.presentation.TasksAdapter

class ListTasksFragment: Fragment() {

    private lateinit var binding: ListTodoItemsLayoutBinding

    private lateinit var adapter: TasksAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ListTodoItemsLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        adapter = TasksAdapter()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.rvListTasks.adapter = adapter
        createTmpTasks()
    }

    private fun createTmpTasks() {
        val listTasksTmp = mutableListOf<TodoItem>()
        repeat(5) {
            listTasksTmp.add(TodoItem(it, "Купить что-то", false, "Date"))
        }
        adapter.setTasks(listTasksTmp)
    }
}