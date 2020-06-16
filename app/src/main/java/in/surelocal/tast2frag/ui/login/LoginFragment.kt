package `in`.surelocal.tast2frag.ui.login

import `in`.surelocal.tast2frag.NiagationDrawer
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import `in`.surelocal.tast2frag.R
import `in`.surelocal.tast2frag.SetDataActivity
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.util.Patterns
import android.widget.Toast
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
        login.setOnClickListener() {


        val email = et_username.text.toString()
        val password = et_password.text.toString()
        if (email.isEmpty()) {
            et_username.error = "Empty"
            et_username.requestFocus()
        } else if (password.isEmpty()) {
            et_password.error = "Empty"
            et_password.requestFocus()
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            et_username.error = "Invalid Email"
            et_username.requestFocus()
        } else {
            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(requireContext(), NiagationDrawer::class.java)
            intent.putExtra("username", email)
            intent.putExtra("password", password)
            startActivity(intent)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
            activity?.finish()



            Toast.makeText(context, "Data SAve", Toast.LENGTH_SHORT).show()
            val  user=et_username.text.toString().trim()
            val  password=et_username.text.toString().trim()
            val sp=requireContext().getSharedPreferences("DataInfo",Context.MODE_PRIVATE)
            val editor=sp.edit()
            editor.putString("email",user)
            editor.putString("password",password)
            editor.apply()


        }


        }


    }


    }


