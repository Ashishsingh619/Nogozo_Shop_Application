package com.anvesh.nogozoshopapplication.ui.contactus

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.anvesh.nogozoshopapplication.R
import com.anvesh.nogozoshopapplication.datamodels.FAQsModel
import com.anvesh.nogozoshopapplication.ui.BaseActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ContactUsFaqActivity : BaseActivity(), View.OnClickListener {

    private lateinit var recyclerFaqs: RecyclerView

    val faqList = ArrayList<FAQsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us_faq)

        recyclerFaqs = findViewById(R.id.recyclerFAQs)

        getFAQList()

    }

    private fun getFAQList() {
        val db = FirebaseDatabase.getInstance().getReference("faqs/vendor")

        db.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                //var i = 0
                snapshot.children.forEach {
                    val faq = it.getValue(FAQsModel::class.java)
                    faqList.add(faq!!)
                 //   i = 1
                }
                //if(i==1){
                    recyclerFaqs.adapter = FAQsRecyclerAdapter(this@ContactUsFaqActivity,faqList)
                //}
            }

            override fun onCancelled(error: DatabaseError) {
            }

        })
    }

    override fun onClick(v: View?) {
        when (v!!.id) {

        }
    }
}