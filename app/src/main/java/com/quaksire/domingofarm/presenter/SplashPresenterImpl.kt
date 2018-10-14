package com.quaksire.domingofarm.presenter

import com.quaksire.domingofarm.ISplashActivity
import java.util.*
import kotlin.concurrent.schedule

/**
 * Created by Julio.
 */
class SplashPresenterImpl(activity: ISplashActivity): SplashPresenter {

    private val splashActivity = activity

    override fun doStart() {
        Timer("SettingUp", false).schedule(2000) {
            splashActivity.navigateToEntryActivity()
        }
    }
}