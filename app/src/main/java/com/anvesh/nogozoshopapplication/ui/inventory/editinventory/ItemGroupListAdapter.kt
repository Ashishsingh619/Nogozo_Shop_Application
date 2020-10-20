package com.anvesh.nogozoshopapplication.ui.inventory.editinventory

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Filter
import android.widget.TextView
import com.anvesh.nogozoshopapplication.R
import com.anvesh.nogozoshopapplication.datamodels.ItemGroup
import com.anvesh.nogozoshopapplication.ui.userdetails.AreaListAdapter
import java.util.*
import kotlin.collections.ArrayList

class ItemGroupListAdapter: BaseAdapter() {
    private var OriginalList: List<ItemGroup> = ArrayList()
    private var filteredList: List<ItemGroup> = ArrayList()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val v: View
        var holder = AreaListAdapter.ViewHolder()

        return if(convertView == null){
            v = LayoutInflater.from(parent!!.context).inflate(R.layout.list_item_city, parent, false)
            holder.name = v.findViewById(R.id.list_item_city_view)
            v.tag = holder
            holder.name.text = filteredList[position].groupName
            v
        }else{
            holder = convertView.tag as AreaListAdapter.ViewHolder
            holder.name.text = filteredList[position].groupName
            if(position==filteredList.size-1) {
                holder.name.setBackgroundColor(Color.parseColor("#3367A6"))
                holder.name.setTextColor(Color.WHITE)
            }
            convertView
        }
    }

    override fun getItem(position: Int): ItemGroup {
        return filteredList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return filteredList.size
    }

    fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults? {
                val oReturn = FilterResults()
                val results: ArrayList<ItemGroup> = ArrayList()
                if (constraint != null) {
                    if (OriginalList.isNotEmpty()) {
                        for (g in OriginalList) {
                            if (g.groupId.toLowerCase(Locale.ROOT).contains(constraint.toString()))
                                results.add(g)
                        }
                    }
                    if(results.isEmpty()){
                        results.add(ItemGroup("-1", "No Item Group with that Name"))
                    }
                    oReturn.values = results
                }
                return oReturn
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults){
                filteredList = results.values as ArrayList<ItemGroup>
                notifyDataSetChanged()
            }
        }
    }

    fun setOriginalList(data: List<ItemGroup>){
        this.OriginalList = data
        this.filteredList = data
        notifyDataSetChanged()
    }

    class ViewHolder{
        lateinit var name: TextView
    }
}