package com.baz.continuidadoperativa.almacenht.ui.dashboard.presenter

import com.google.android.material.bottomnavigation.BottomNavigationView

interface IHTDashboardPresenter {

    interface Presenter{
        fun navListener() : BottomNavigationView.OnNavigationItemSelectedListener
    }
}