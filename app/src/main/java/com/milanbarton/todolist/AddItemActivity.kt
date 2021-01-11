package com.milanbarton.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView

class AddItemActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var checkBoxUrgent: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        editTextName = findViewById(R.id.item_name_edit_text)
        checkBoxUrgent = findViewById(R.id.is_urgent_checkbox)
    }

    public fun saveItemAction(view: View) {

    }

    public fun cancelAction(view: View) {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}