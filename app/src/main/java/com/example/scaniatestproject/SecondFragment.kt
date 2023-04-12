package com.example.scaniatestproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.scaniatestproject.databinding.FragmentSecondBinding
import com.example.scaniatestproject.ui.DogDetailAdapter
import com.example.scaniatestproject.viewModel.DogViewModel

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val viewModel: DogViewModel = DogViewModel()
    private val binding get() = _binding!!
    private var dogImageUrl: String? = ""
    private var dogDetailsAdaptr: DogDetailAdapter = DogDetailAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bundle = this.arguments
        dogImageUrl = bundle?.getString("dogName")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        if (!binding.idPBLoading.isVisible) {
            binding.idPBLoading.visibility = View.VISIBLE
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getDogsImageist(dogImageUrl)
        viewModel.dogImageListLiveData.observe(viewLifecycleOwner, Observer {
            dogDetailsAdaptr.setImageList(it?.imageUrl)
            binding.recyclerviewSecond.adapter = dogDetailsAdaptr
            binding.idPBLoading.visibility = View.GONE
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}