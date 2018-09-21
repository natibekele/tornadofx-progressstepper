package com.progressstepper.example

import com.progressstepper.example.app.CreationWizard.CreationWizard
import tornadofx.*

class Demo: App(Workspace::class) {
    init {
        workspace.header.removeFromParent()
    }

    override fun onBeforeShow(viewUIComponent: UIComponent) {
        workspace.dock<CreationWizard>()
    }
}

fun main(args: Array<String>) {
    launch<Demo>(args)
}