package com.b12game.floatingactionbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var  addAlarmFab: FloatingActionButton
    lateinit var addPerson: FloatingActionButton
    lateinit var addFab: ExtendedFloatingActionButton
    var isAllFabVisible: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        addFab = findViewById(R.id.add_fab)
        addAlarmFab = findViewById(R.id.add_alarm_fab)
        addPerson = findViewById(R.id.add_person_fab)

        addFab.shrink()
        addFab.setOnClickListener{
            isAllFabVisible = if(!isAllFabVisible){
                addAlarmFab.show()
                addPerson.show()
                addFab.extend()
                true
            }else{
                addAlarmFab.hide()
                addPerson.hide()
//                addFab.shrink()
                false
            }
        }
    }
}