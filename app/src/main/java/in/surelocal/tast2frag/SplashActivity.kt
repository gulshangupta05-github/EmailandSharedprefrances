package `in`.surelocal.tast2frag

import `in`.surelocal.tast2frag.ui.login.LoginFragment.Companion.newInstance
import `in`.surelocal.tast2frag.ui.splash.SplashFragment
import `in`.surelocal.tast2frag.ui.splash.SplashFragment.Companion.newInstance
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(
                R.id.container,SplashFragment.newInstance()
        ).commit()
    }
}
