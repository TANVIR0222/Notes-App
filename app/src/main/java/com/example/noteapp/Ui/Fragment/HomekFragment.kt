package com.example.noteapp.Ui.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.noteapp.R
import com.example.noteapp.databinding.FragmentHomekBinding


class HomekFragment : Fragment() {
    
    lateinit var binding: FragmentHomekBinding
    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentHomekBinding.inflate(layoutInflater,container,false)
        
        binding.addNotes.setOnClickListener {
           Navigation.findNavController(it).navigate(R.id.action_homekFragment_to_createNotesFragment)
           
        }
        
        return binding.root
    }

}