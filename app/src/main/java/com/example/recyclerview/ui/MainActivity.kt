package com.example.recyclerview.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.adapter.RecyclerAdapter

class MainActivity : AppCompatActivity() {
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recycler_view: RecyclerView
        recycler_view = findViewById(R.id.rec)
        layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        adapter = RecyclerAdapter()
        recycler_view.adapter = adapter

    }
}
