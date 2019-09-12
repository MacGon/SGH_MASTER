package com.baz.continuidadoperativa.almacenht.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity

abstract class HTBaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(setLayout())
        initView(savedInstanceState)
    }

    @LayoutRes
    abstract fun setLayout(): Int

    abstract fun initView(savedInstanceState: Bundle?)
}