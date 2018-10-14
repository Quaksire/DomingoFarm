package com.quaksire.domingofarm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quaksire.domingofarm.presenter.SplashPresenter
import com.quaksire.domingofarm.presenter.SplashPresenterImpl

class SplashActivity : AppCompatActivity(), ISplashActivity {

    private val presenter: SplashPresenter = SplashPresenterImpl(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }

    override fun onResume() {
        super.onResume()
        presenter.doStart()
    }

    override fun navigateToEntryActivity() {
        val intent = Intent(this, EntryActivity::class.java)
        finish()
        startActivity(intent)
    }
}
