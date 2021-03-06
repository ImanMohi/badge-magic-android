package org.fossasia.badgemagic.ui.base

import androidx.fragment.app.Fragment
import org.fossasia.badgemagic.data.DataToSend

open class BaseFragment : Fragment(), BaseFragmentInterface {
    override fun initializePreview() {
    }

    override fun getSendData(): DataToSend {
        return DataToSend(listOf())
    }
}

interface BaseFragmentInterface {
    fun getSendData(): DataToSend
    fun initializePreview()
}
