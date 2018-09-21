package com.progressstepper.example.app.CreationWizard

import com.progressstepper.example.app.ProgressStepper.progressstepper
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import tornadofx.*

class CreationWizard: View() {
    val nodeList = listOf(MaterialIconView(MaterialIcon.MIC_NONE),
            MaterialIconView(MaterialIcon.COLLECTIONS_BOOKMARK),
            MaterialIconView(MaterialIcon.BOOK))
    override val root = borderpane {

        top = progressstepper(nodeList) {

        }
    }
}