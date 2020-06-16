package `in`.surelocal.tast2frag

import `in`.surelocal.tast2frag.ui.setdata.SetDataFragment
import `in`.surelocal.tast2frag.ui.splash.SplashFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.navigation.NavigationView

class SetDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_data)
        supportFragmentManager.beginTransaction().replace(
            R.id.container, SetDataFragment.newInstance()
        ).commit()


    }
}
