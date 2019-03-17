package com.android.joshuamarotta.metronote.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import com.android.joshuamarotta.metronote.R
import com.vansuita.materialabout.builder.AboutBuilder

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = AboutBuilder.with(this)
            .setPhoto(R.mipmap.profile_picture)
            .setCover(R.mipmap.profile_cover)
            .setName("Joshua Marotta")
            .setSubTitle("Mobile Developer")
            .setBrief("I'm warmed of mobile technologies. Ideas maker, curious and nature lover.")
            .setAppIcon(R.mipmap.ic_launcher)
            .setAppName(R.string.app_name)
            .addGooglePlayStoreLink("8002078663318221363")
            .addGitHubLink("J-Marotta")
            .addInstagramLink("marotta.jt")
            .addFacebookLink("user")
            .addFiveStarsAction()
            .setVersionNameAsAppSubTitle()
            .addShareAction(R.string.app_name)
            .setWrapScrollView(true)
            .setLinksAnimated(true)
            .setShowAsCard(true)
            .build()
        addContentView(view, ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT))
    }
}