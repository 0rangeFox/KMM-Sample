package pt.saphirex.sample.android.ui.user.address

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pt.saphirex.sample.android.databinding.FragmentAddressManagerBinding

class AddressManagerFragment : Fragment() {

    private lateinit var binding: FragmentAddressManagerBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        this.binding = FragmentAddressManagerBinding.inflate(inflater, container, false)
        return this.binding.root
    }

}
