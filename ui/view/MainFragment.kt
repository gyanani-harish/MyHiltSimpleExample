package gyanani.harish.hiltsmallnsimpleexample.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import gyanani.harish.hiltsmallnsimpleexample.R
import gyanani.harish.hiltsmallnsimpleexample.ui.viewmodel.MainViewModel

class MainFragment: Fragment() {
    private val viewModel: MainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.users.observe(viewLifecycleOwner) { listData ->
            view.findViewById<TextView>(R.id.title).text = listData?.get(0)?.toString() ?: ""
        }
    }

}
