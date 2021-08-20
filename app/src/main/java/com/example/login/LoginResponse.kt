package com.example.login

class LoginResponse {
    package com.example.project2.models

    import android.provider.ContactsContract
    import com.google.gson.annotations.SerializedName

    data class LoginResponse (
        var password: String,
        var email:String
    )
    data class LoginResponse(
        var message: String,
        @SerializedName("access_token")var accessToken: String,
        @SerializedName("student_id")var studentId: String

}