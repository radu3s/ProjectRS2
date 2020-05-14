package com.example.projectrs2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projectrs2.models.ListaDulce
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var DulceaAdapter: DulceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycleView()
        addDataSet()
    }

     private fun addDataSet() {
        val data: ArrayList<ListaDulce> = Source.createDataSet ()
        DulceaAdapter.submitList(data)
    }
    private fun initRecycleView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val SpacingDecoration = SpacinfDecoration( 30)
            addItemDecoration(SpacingDecoration)
            DulceaAdapter = DulceAdapter()
            adapter = DulceaAdapter

        }

        }

}

