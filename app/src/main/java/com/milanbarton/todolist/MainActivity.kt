package com.milanbarton.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var todoItemRecyclerView: RecyclerView
    private lateinit var recycleAdapter: TodoItemsAdapter
    private lateinit var recyclerLayoutManager: RecyclerView.LayoutManager

    var todoItemsList = ArrayList<TodoItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        todoItemsList.add(TodoItem("Buy groceries"))
        todoItemsList.add(TodoItem("Do laundry", true))
        todoItemsList.add(TodoItem("Play guitar", false))


        todoItemRecyclerView = findViewById(R.id.todo_item_recycler_view)

        recyclerLayoutManager = LinearLayoutManager(this)
        recycleAdapter = TodoItemsAdapter(todoItemsList, this)

        todoItemRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = recyclerLayoutManager
            adapter = recycleAdapter
        }
    }

    public fun navToAddItemAction(view: View) {
        val intent: Intent = Intent(this, AddItemActivity::class.java)
        startActivity(intent)
    }
}