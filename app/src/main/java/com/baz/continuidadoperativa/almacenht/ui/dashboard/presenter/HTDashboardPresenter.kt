package com.baz.continuidadoperativa.almacenht.ui.dashboard.presenter

import androidx.fragment.app.Fragment
import com.baz.continuidadoperativa.almacenht.R
import com.baz.continuidadoperativa.almacenht.ui.dashboard.view.IHTDashboardView
import com.baz.continuidadoperativa.almacenht.ui.dashboard.view.fragments.home.view.HTHomeFragment
import com.baz.continuidadoperativa.almacenht.ui.dashboard.view.fragments.navigation.view.HTNavigationFragment
import com.baz.continuidadoperativa.almacenht.ui.dashboard.view.fragments.notifications.view.NotificationFragment
import com.baz.continuidadoperativa.almacenht.ui.dashboard.view.fragments.schedule.view.HTScheduleFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HTDashboardPresenter(private val IHTDashboardView: IHTDashboardView): IHTDashboardPresenter.Presenter {
    override fun navListener(): BottomNavigationView.OnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
            menuItem ->

        val selectedFragment: Fragment
        when(menuItem.itemId){
            R.id.navigation_home -> {
                selectedFragment = HTHomeFragment()
                IHTDashboardView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_routes -> {
                selectedFragment = HTNavigationFragment()
                IHTDashboardView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_calendar -> {
                selectedFragment = HTScheduleFragment()
                IHTDashboardView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                selectedFragment = NotificationFragment()
                IHTDashboardView.goToFragment(selectedFragment)
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }

}