package com.anvesh.nogozoshopapplication.datamodels

import com.google.firebase.database.IgnoreExtraProperties
import com.google.gson.annotations.SerializedName
import java.io.Serializable

//@IgnoreExtraProperties
data class Services(
    @SerializedName("serviceId")
    var serviceId: String? = "-1",
    @SerializedName("servicename")
    var servicename: String? = "",
    @SerializedName("priority")
    var priority: Int? = 100
): Serializable {

}