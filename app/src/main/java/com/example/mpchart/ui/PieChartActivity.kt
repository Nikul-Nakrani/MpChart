package com.example.mpchart.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mpchart.R
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate


class PieChartActivity : AppCompatActivity() {
    private lateinit var pieChart: PieChart
    private var information = ArrayList<PieEntry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        pieChart = findViewById(R.id.pie_chart)

        //store info in Arraylist
        information.add(PieEntry(14f, "Quarter 1"))
        information.add(PieEntry(14f, "Quarter 2"))
        information.add(PieEntry(38f, "Quarter 3"))
        information.add(PieEntry(34f, "Quarter 4"))

        //value pass in pieDataSet
        var pieDataSet = PieDataSet(information, "Pie Chart Report")
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS, 230)
        pieDataSet.valueTextSize = 20f

        //pieDataSet pass in PieData
        val pieData = PieData(pieDataSet)

        //set Data in Pie Chart
        pieChart.data = pieData
        pieChart.description.text = "Pie Report Demo"
        pieChart.centerText = "Quarterly Revenue"
        pieChart.setCenterTextSize(20f)

        pieChart.animate()
    }
}