package com.milanbarton.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class AddItemActivity : AppCompatActivity() {

    private lateinit var itemNameEditText: EditText
    private lateinit var isUrgencyCheckBox: CheckBox
    private lateinit var titleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_item)

        itemNameEditText = findViewById(R.id.item_name_edit_text)
        isUrgencyCheckBox = findViewById(R.id.is_urgent_checkbox)
        titleTextView = findViewById(R.id.add_item_title_text_view)

        val itemName = intent.getStringExtra("ITEM_NAME")
        val itemUrgency = intent.getBooleanExtra("ITEM_URGENCY", false)

        if (itemName != null) {
            itemNameEditText.setText(itemName)
            titleTextView.setText(R.string.edit_item_message)
        }
        if (itemUrgency == true)
        {
            isUrgencyCheckBox.isChecked = true
        }
    }

    public fun saveItemAction(view: View) {

    }

    public fun cancelAction(view: View) {
        val intent: Intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}