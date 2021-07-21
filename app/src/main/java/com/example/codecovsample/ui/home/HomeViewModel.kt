package com.example.codecovsample.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    var a = 2

    fun get1(): Int {
        return 1
    }

    fun get2() : Int {
        return 2
    }

    fun get3() : Int {
        return 3
    }

    fun get4() : Int {
        return 4
    }

    fun get5(): Int {
        if (a == 2) {
            return 5
        } else {
            return 3
        }
    }
}