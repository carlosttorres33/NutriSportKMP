package org.carlosttorres.nutrisport

import androidx.compose.ui.window.ComposeUIViewController
import com.nutrisport.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initializeKoin()
    }
) { App() }