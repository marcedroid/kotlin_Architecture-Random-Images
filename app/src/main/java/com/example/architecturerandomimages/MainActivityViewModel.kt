package com.example.architecturerandomimages

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    private var urlImage:String? = null

    fun callUrlImage():String?{
        if(urlImage.equals(null)){
            urlImage = randomNumbersUrl()
        }
        return urlImage
    }

    private fun randomNumbersUrl():String{
        return "https://picsum.photos/${3.rangeTo(5).random()}00/${3.rangeTo(5).random()}00"
    }

}