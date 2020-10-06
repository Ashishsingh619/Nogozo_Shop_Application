package com.anvesh.nogozoshopapplication.datamodels

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

//@IgnoreExtraProperties
data class Order(
    @SerializedName("orderkey")
    var orderkey:String = "",
    @SerializedName("orderId")
    var orderId: String = "",
    @SerializedName("items")
    var items: HashMap<String, Any> = HashMap(),
    @SerializedName("date")
    var date: String = "-1",
    @SerializedName("time")
    var time: String = "-1",
    @SerializedName("datetime")
    var datetime: String = "-1",
    @SerializedName("status")
    var status: String = "-1",
    @SerializedName("price")
    var price: String = "0",
    @SerializedName("itemprice")
    var itemprice: String = "",
    @SerializedName("shopid")
    var shopid: String = "-1",
    @SerializedName("shopname")
    var shopname: String = "",
    @SerializedName("shopinstruction")
    var shopinstruction: String = "",
    @SerializedName("delivery")
    var delivery: String = "No",
    @SerializedName("deliverycharges")
    var deliverycharges: String = "0",
    @SerializedName("customername")
    var customername: String = "-1",
    @SerializedName("customeraddress")
    var customeraddress: String = "-1",
    @SerializedName("customerphone")
    var customerphone: String = "-1"
){
    //constructor() : this() {}
}