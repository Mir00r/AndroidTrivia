package com.mir00r.androidtrivia

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.mir00r.androidtrivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentGameOverBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false
        )
        // Add OnClick Handler for Try Again button
        binding.tryAgainButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
        return binding.root
    }
}
