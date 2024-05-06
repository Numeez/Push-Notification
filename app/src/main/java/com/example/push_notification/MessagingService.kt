package com.example.push_notification

import android.annotation.SuppressLint
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

@SuppressLint("MissingFirebaseInstanceTokenRefresh")
class MessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.d("From Messaging Service",token)
        super.onNewToken(token)
    }

}