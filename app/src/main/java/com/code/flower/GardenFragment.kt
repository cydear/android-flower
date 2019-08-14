package com.code.flower

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-07-30 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
class GardenFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_garden, container,false)
        return view
    }
}