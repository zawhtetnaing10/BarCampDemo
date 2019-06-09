package com.zawhtetnaing.shared.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.bindImageWithUrl(imageUrl : String){
    Glide.with(this)
        .load(imageUrl)
        .into(this)
}