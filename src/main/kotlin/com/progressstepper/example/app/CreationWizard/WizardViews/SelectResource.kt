package com.progressstepper.example.app.CreationWizard.WizardViews

import com.progressstepper.example.app.CreationWizard.CreationWizardViewModel
import javafx.scene.layout.HBox
import tornadofx.*

import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import javafx.geometry.Orientation
import javafx.geometry.Pos
import javafx.scene.control.ContentDisplay
import javafx.scene.paint.Color
import tornadofx.*
import tornadofx.Stylesheet.Companion.root
import java.io.File

class SelectResource(viewModel: CreationWizardViewModel): HBox() {
    init {
        with(Stylesheet.root) {
            hbox(40) {
                button{
                    contentDisplay = javafx.scene.control.ContentDisplay.TOP
                    graphic = MaterialIconView(MaterialIcon.COLLECTIONS_BOOKMARK)
                    style {
                        prefHeight = 364.0.px
                        prefWidth  = 364.0.px
                        backgroundColor += Color.TEAL
                    }

                    action {
                        viewModel.setActiveId(viewModel.activeIdProperty.value +1 )
                    }
                    text = "Bible"
                }

                button{
                    contentDisplay = javafx.scene.control.ContentDisplay.TOP
                    graphic = MaterialIconView(MaterialIcon.COLLECTIONS_BOOKMARK)
                    style {
                        prefHeight = 364.0.px
                        prefWidth  = 364.0.px
                        backgroundColor += Color.TEAL
                    }
                    text = "Open Bible Stories"
                }

                button {
                    contentDisplay = javafx.scene.control.ContentDisplay.TOP
                    graphic = MaterialIconView(MaterialIcon.COLLECTIONS_BOOKMARK)
                    style {
                        prefHeight = 364.0.px
                        prefWidth  = 364.0.px
                        backgroundColor += Color.TEAL
                    }
                    text = "Other"
                }
            }
        }
    }

}