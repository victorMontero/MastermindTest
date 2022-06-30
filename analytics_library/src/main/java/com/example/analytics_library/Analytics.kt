package com.example.analytics_library

import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class Analytics {

    val firebaseAnalytics = Firebase.analytics

    fun trackEvent() {
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN) {
            param(FirebaseAnalytics.Param.ITEM_ID, 10)
            param(FirebaseAnalytics.Param.ITEM_NAME, "camisa")
            param(FirebaseAnalytics.Param.CONTENT_TYPE, "image")
        }
    }
}