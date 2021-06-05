package pt.saphirex.sample.android.ui.user.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.saphirex.sample.android.databinding.FragmentUserHomeBinding

class UserHomeFragment : Fragment() {

    private lateinit var binding: FragmentUserHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = FragmentUserHomeBinding.inflate(inflater, container, false)
        return this.binding.root
    }

}
