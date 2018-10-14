package com.quaksire.domingofarm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.quaksire.domingofarm.util.bind

class EntryActivity : AppCompatActivity(), IEntryActivity {

    private val button: Button by bind(R.id.start_button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)

        button.setOnClickListener{ navigateToGame() }
    }

    override fun navigateToGame() {
        val intent = Intent(this, GameActivity::class.java)
        finish()
        startActivity(intent)
    }
}
