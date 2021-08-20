package com.example.login

class RegistrationRequest (
    var name:String,
    var password: String,
    @SerializedName("phone_number") var phoneNumber:String,
    var email:String, var nationality: String,
    @SerializedName("date_of_number") var DOB: String,
    @SerializedName("student_id") var studentId:String)

    )