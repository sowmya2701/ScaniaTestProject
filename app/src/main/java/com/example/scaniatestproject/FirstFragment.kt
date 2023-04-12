package com.example.scaniatestproject

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.example.scaniatestproject.databinding.FragmentFirstBinding
import com.example.scaniatestproject.ui.DogAdapter
import com.example.scaniatestproject.viewModel.DogViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() , DogAdapter.ItemClickListener{

    private var _binding: FragmentFirstBinding? = null
    private val viewModel: DogViewModel = DogViewModel()
    val adapter = DogAdapter(this)
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getListView()
        viewModel.observableEvents.observe(viewLifecycleOwner, Observer {
            it?.message?.let { it1 -> adapter.setMovieList(it1.hound) }
            binding.recyclerview.adapter = adapter
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemClick(position: Int, v: View) {
        Log.d("Sowmya", "pos: " +adapter.getMoviesList().get(position))
        val bundle = Bundle()
        bundle.putString("dogName", adapter.getMoviesList().get(position))
        //Navigating to dog image details in the second fragment
        Navigation.findNavController(v).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
    }

    override fun onLongClick(position: Int) {
       //
    }
}