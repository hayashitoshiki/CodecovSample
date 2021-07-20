package com.example.codecovsample.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    fun getStringTest(): String {
        return "Test"
    }

    fun getStringNon() : String {
        return "Non"
    }
    fun testBranch1() {

    }

    fun testBranch2() {

    }
}