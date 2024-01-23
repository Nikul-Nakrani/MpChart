package com.example.mpchart.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mpchart.R

class MainActivity : AppCompatActivity() {
    lateinit var btnBarChart: Button
    lateinit var btnPieChart: Button
    lateinit var btnLineChart: Button
    lateinit var btnRadarChart: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        clickListener()
    }

    private fun initView() {
        btnBarChart = findViewById(R.id.btn_bar)
        btnPieChart = findViewById(R.id.btn_pie)
        btnLineChart = findViewById(R.id.btn_line)
        btnRadarChart = findViewById(R.id.btn_radar)
    }

    private fun clickListener() {
        btnBarChart.setOnClickListener {
            val intent = Intent(this, BarChartActivity::class.java)
            startActivity(intent)
        }

        btnPieChart.setOnClickListener {
            val intent = Intent(this, PieChartActivity::class.java)
            startActivity(intent)
        }

        btnLineChart.setOnClickListener {
            val intent = Intent(this, LineChartActivity::class.java)
            startActivity(intent)
        }

        btnRadarChart.setOnClickListener {
            val intent = Intent(this, RadarActivity::class.java)
            startActivity(intent)
        }
    }
}