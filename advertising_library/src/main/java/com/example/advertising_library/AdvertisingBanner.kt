package com.example.advertising_library

import android.content.Context
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class AdvertisingBanner {
    private lateinit var mAdView: AdView


     fun initializeBannerAd(context: Context) {

        MobileAds.initialize(context)

    }

     fun loadBannerAd() {

        val adRequest = AdRequest.Builder()
            .build()
        mAdView.loadAd(adRequest)
    }


}