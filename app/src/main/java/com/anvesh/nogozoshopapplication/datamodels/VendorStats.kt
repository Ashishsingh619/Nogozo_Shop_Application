package com.anvesh.nogozoshopapplication.datamodels

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

//@IgnoreExtraProperties
data class VendorStats(
    @SerializedName("id")
    var id: String = "-1",
    @SerializedName("total_amount")
    var total_amount: String = "0",
    @SerializedName("total_orders")
    var total_orders: String = "0",
    @SerializedName("month")
    var month: String = "") {
}