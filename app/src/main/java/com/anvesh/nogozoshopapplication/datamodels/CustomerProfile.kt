package com.anvesh.nogozoshopapplication.datamodels

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

//@IgnoreExtraProperties
data class CustomerProfile(
    @SerializedName("name")
    var name: String? = "",
    @SerializedName("email")
    var email: String? = "",
    @SerializedName("phone")
    var phone: String? = "",
    @SerializedName("profilelevel")
    var profilelevel: String? = "",
    @SerializedName("shopname")
    var shopname: String? = "",
    @SerializedName("cityname")
    var cityname: String? = "",
    @SerializedName("cityid")
    var cityid: String? = "",
    @SerializedName("pincode")
    var pincode: String? = "",
    @SerializedName("areaname")
    var areaname: String? = "",
    @SerializedName("areaid")
    var areaid: String? = "",
    @SerializedName("address")
    var address: String? = ""){

    constructor(email: String, profilelevel: String) : this() {
        this.email = email
        this.profilelevel = profilelevel
    }

    fun equalsTo(other: Any?): Boolean{
        if(other == null)
            return false
        if(other is CustomerProfile){
            if(this.name == other.name
                && this.phone == other.phone
                && this.cityname == other.cityname
                && this.cityid == other.cityid
                && this.shopname == other.shopname
                && this.pincode == other.pincode
                && this.areaname == other.areaname
                && this.areaid == other.areaid
                && this.address == other.address){
                return true
            }
        }
        return false
    }
}