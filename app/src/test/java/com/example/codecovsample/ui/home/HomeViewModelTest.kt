package com.example.codecovsample.ui.home

import junit.framework.TestCase

class HomeViewModelTest : TestCase() {

    private lateinit var viewModel: HomeViewModel
    public override fun setUp() {
        super.setUp()
        viewModel = HomeViewModel()
    }

    public override fun tearDown() {}

    fun testGet1() {
        val result = viewModel.get1()
        assertEquals(1, result)
    }

    fun testGet2() {
        val result = viewModel.get2()
        assertEquals(2, result)
    }

    fun testGet3() {
        val result = viewModel.get3()
        assertEquals(3, result)
    }

    fun testGet5Ptn1() {
        val result = viewModel.get5()
        assertEquals(5, result)
    }
}