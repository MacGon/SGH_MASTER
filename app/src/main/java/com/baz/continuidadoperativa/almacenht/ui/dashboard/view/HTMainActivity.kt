package com.baz.continuidadoperativa.almacenht.ui.dashboard.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.baz.continuidadoperativa.almacenht.R
import com.baz.continuidadoperativa.almacenht.base.HTBaseActivity
import com.baz.continuidadoperativa.almacenht.ui.dashboard.presenter.IHTDashboardPresenter
import com.baz.continuidadoperativa.almacenht.ui.dashboard.presenter.HTDashboardPresenter
import com.baz.continuidadoperativa.almacenht.ui.dashboard.view.fragments.home.view.HTHomeFragment
import com.baz.continuidadoperativa.almacenht.common.hideBottomBar
import kotlinx.android.synthetic.main.activity_main.*


class HTMainActivity : HTBaseActivity(), IHTDashboardView {
    private val manager:FragmentManager = supportFragmentManager
    private var iHTPresenter: IHTDashboardPresenter.Presenter? = null

    override fun initView(savedInstanceState: Bundle?) {
        iHTPresenter = HTDashboardPresenter(this)
        nav_view.setOnNavigationItemSelectedListener(iHTPresenter!!.navListener())

        if (savedInstanceState == null){
            manager.beginTransaction().replace(frameContainer.id, HTHomeFragment.newInstance()).commit()
        }
    }

    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    override fun onResume() {
        super.onResume()
        hideBottomBar(window)
    }

    override fun goToFragment(fragment: Fragment) {
        val transaction: FragmentTransaction = manager.beginTransaction()
        transaction.replace(frameContainer.id, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun onBackPressed() {
        super.finish()
    }


}
