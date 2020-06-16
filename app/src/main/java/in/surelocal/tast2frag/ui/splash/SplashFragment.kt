package `in`.surelocal.tast2frag.ui.splash

import `in`.surelocal.tast2frag.Login
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import `in`.surelocal.tast2frag.R
import `in`.surelocal.tast2frag.ui.login.LoginFragment
import android.content.Intent
import android.os.Handler

class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)
        // TODO: Use the ViewModel
        Handler().postDelayed( {
            val intent = Intent(requireContext(),Login ::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            activity?.finish()


        }, 3000)

}
}
