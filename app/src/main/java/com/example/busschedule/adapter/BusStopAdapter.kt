package com.example.busschedule.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.busschedule.R
import com.example.busschedule.database.schedule.Schedule

class BusStopAdapter(private val busSchedules: List<Schedule>) :
    RecyclerView.Adapter<BusStopAdapter.BusStopViewHolder>() {

    class BusStopViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val stopNameTextView: TextView = view.findViewById(R.id.stop_name_text_view)
        val arrivalTimeTextView: TextView = view.findViewById(R.id.arrival_time_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BusStopViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.bus_stop_item, parent, false)

        return BusStopViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: BusStopViewHolder, position: Int) {
        val busSchedule = busSchedules[position]

        holder.stopNameTextView.text = busSchedule.stopName
        holder.arrivalTimeTextView.text = busSchedule.arrivalTime.toString()
    }

    override fun getItemCount() = busSchedules.size
}