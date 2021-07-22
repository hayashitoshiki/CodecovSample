package com.example.codecovsample.ui.dashboard

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class DashboardViewModelTest {

    private lateinit var viewModel: DashboardViewModel


    @Before
    fun setUp() {
        viewModel = DashboardViewModel()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun getStringTest() {
        val result = viewModel.getStringTest()
        assertEquals("Test", result)
    }

    @Test
    fun getStringNon() {
        val result = viewModel.getStringNon()
        assertEquals("Non", result)
    }
}