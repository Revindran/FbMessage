package com.raveendran.firebasechatapp.Fragments;

import com.raveendran.firebasechatapp.Notifications.MyResponse;
import com.raveendran.firebasechatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAu28fa6E:APA91bE761iw15IKKZ3wSLy4G6cwVoFXasm6808D_9K1HJr_4UmAenEamoVR_BF_YNVeAUt19X4wG7xMyHI0rRf_9G6aaK2uHMtWxkI1JeDdO-2-x59NCpR4KoQE5S_ENC3yJk-IKICW"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
