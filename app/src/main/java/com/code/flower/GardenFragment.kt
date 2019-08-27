package com.code.flower

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.code.flower.databinding.FragmentGardenBinding

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-07-30 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
class GardenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentGardenBinding.inflate(inflater, container, false)

        return binding.root
    }
}