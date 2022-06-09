package com.example.listacarros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listacarros.databinding.ActivityMainBinding
import com.example.listacarros.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        setupSplash()
    }

    private fun setupSplash() = with(binding) {
        ivOdometro.alpha = 0f
        ivOdometro.animate().setDuration(1500).alpha(1f)

        tvGaragem.alpha = 0f
        tvGaragem.animate().setDuration(1600).alpha(1f)

        tvAutor.alpha = 0f
        tvAutor.animate().setDuration(1700).alpha(1f)

        ivLogo.alpha = 0f
        ivLogo.animate().setDuration(1700).alpha(1f).withEndAction{
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}