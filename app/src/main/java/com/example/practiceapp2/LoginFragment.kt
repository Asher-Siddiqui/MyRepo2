package com.example.practiceapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.practiceapp2.databinding.FragmentLoginBinding
import com.google.firebase.firestore.auth.User


// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class LoginFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {

            val action = LoginFragmentDirections.actionLoginFragmentToForgotFragment4(binding.editText.text.toString())
            findNavController().navigate(action)
    }
       }
}


       // binding.button1.setOnClickListener{
            //NavHostFragment.findNavController(this).navigate(R.id.action_loginFragment_to_forgotFragment4)

            //fun onClick(v: View) {
           // val myTv: editText = requireView().findViewById(R.id.editText)
          //  val email= binding.editText.text.toString()
         //   val action = LoginFragmentDirections.actionLoginFragmentToForgotFragment4(email)
          //  findNavController().navigate(action)





    //    fun onClick(v: View) {
    //    val amountTv: EditText = requireView().findViewById(R.id.editTextAmount)
    //    val amount = amountTv.text.toString().toString()
    //    val action = SpecifyAmountFragmentDirections.confirmationAction(amount)
    //   v.findNavController().navigate(action)
    // }





