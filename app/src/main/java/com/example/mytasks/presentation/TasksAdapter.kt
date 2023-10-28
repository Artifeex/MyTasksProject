package com.example.mytasks.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytasks.databinding.TodoItemLayoutBinding
import com.example.mytasks.domain.TodoItem

class TasksAdapter: RecyclerView.Adapter<TaskViewHolder>()  {

    private var listTasks: List<TodoItem> = mutableListOf()

    var onItemTouchListener: ((TodoItem) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(TodoItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        )
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.binding.cbTaskIsDone.text = listTasks[position].text
    }

    override fun getItemCount(): Int {
        return listTasks.size
    }

    fun setTasks(items: List<TodoItem>) {
        listTasks = items
        notifyDataSetChanged()
    }
}