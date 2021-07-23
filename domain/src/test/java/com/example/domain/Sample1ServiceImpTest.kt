package com.example.domain

import junit.framework.TestCase

class Sample1ServiceImpTest()  : TestCase() {

    private lateinit var useCase: Sample1ServiceImp
    public override fun setUp() {
        super.setUp()
        useCase = Sample1ServiceImp()
    }

    public override fun tearDown() {}

    fun testGet1() {
        val result = useCase.sample1()
        assertEquals("sample1 usecase", result)
    }
}