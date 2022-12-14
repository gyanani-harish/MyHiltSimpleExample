package gyanani.harish.hiltsmallnsimpleexample.ui.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import gyanani.harish.hiltsmallnsimpleexample.R

@AndroidEntryPoint
class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment(),"MAIN_FRAGMENT")
            .commitNow()
    }
}
