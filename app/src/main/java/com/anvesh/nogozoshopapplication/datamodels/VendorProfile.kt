package com.anvesh.nogozoshopapplication.datamodels

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

//@IgnoreExtraProperties
data class VendorProfile(
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("email")
    var email: String? = "",
    @SerializedName("phone")
    var phone: String? = "",
    @SerializedName("profilelevel")
    var profilelevel: String? = "",
    @SerializedName("cityname")
    var cityname: String? = "",
    @SerializedName("cityid")
    var cityid: String? = "",
    @SerializedName("areaname")
    var areaname: String? = "",
    @SerializedName("areaid")
    var areaid: String? = "",
    @SerializedName("address")
    var address: String? = "",
    @SerializedName("homebuisness")
    var homebusiness: String? = "",
    @SerializedName("deliverystatus")
    var deliverystatus: String? = "Not delivering",
    @SerializedName("shopname")
    var shopname: String? = "",
    @SerializedName("deliverycharges")
    var deliverycharges: String? = "",
    @SerializedName("deliveryminorder")
    var deliveryminorder: String? = ""
){

    constructor(email: String, profilelevel: String) : this() {
        this.email = email
        this.profilelevel = profilelevel
    }
}