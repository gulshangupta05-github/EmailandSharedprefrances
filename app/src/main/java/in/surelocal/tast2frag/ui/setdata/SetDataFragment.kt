package `in`.surelocal.tast2frag.ui.setdata

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import `in`.surelocal.tast2frag.R
import kotlinx.android.synthetic.main.set_data_fragment.*

class SetDataFragment : Fragment() {

    companion object {
        fun newInstance() = SetDataFragment()
    }

    private lateinit var viewModel: SetDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.set_data_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SetDataViewModel::class.java)
        // TODO: Use the ViewModel

//            var strUser:String=intent.getStringExtra("username")
//            var strpassword :String= intent.getStringExtra("password")
//            message1.setText(strUser).toString()
//            message2.setText(strpassword).toString()
        }

    }


