package `in`.surelocal.tast2frag

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import `in`.surelocal.tast2frag.ui.login.LoginFragment
import android.view.View

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment.newInstance())
                .commitNow()
        }
    }

    fun login(view: View) {}
}
