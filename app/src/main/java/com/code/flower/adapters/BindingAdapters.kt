package com.code.flower.adapters

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * [类功能说明]
 *
 * @author lary.huang
 * @version v 1.4.8 2019-08-27 XLXZ Exp $
 * @email huangyang@xianglin.cn
 */
@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}