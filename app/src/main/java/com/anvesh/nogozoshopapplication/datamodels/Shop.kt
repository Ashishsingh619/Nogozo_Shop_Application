package com.anvesh.nogozoshopapplication.datamodels

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName

//@IgnoreExtraProperties
class Shop {
    @SerializedName("shopName")
    lateinit var shopName: String
    @SerializedName("shopId")
    lateinit var shopId: String
    @SerializedName("imageUrl")
    var imageUrl: String? = null
    @SerializedName("shopAddress")
    var shopAddress: String? = null
    @SerializedName("shopCurrentStatus")
    var shopCurrentStatus: String? = null
    @SerializedName("shopAreaId")
    var shopAreaId: String? = "-1"

    constructor(shopName: String, shopId: String, imageUrl: String?,shopAddress: String?, shopCurrentStatus: String?, shopAreaId: String?){
        this.shopId = shopId
        this.shopName = shopName
        this.imageUrl = imageUrl
        this.shopAddress = shopAddress
        this.shopCurrentStatus = shopCurrentStatus
        this.shopAreaId = shopAreaId
    }

    constructor()
}