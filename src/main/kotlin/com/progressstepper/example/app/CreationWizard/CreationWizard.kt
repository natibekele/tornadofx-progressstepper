package com.progressstepper.example.app.CreationWizard

import com.progressstepper.example.app.CreationWizard.WizardViews.SelectBook
import com.progressstepper.example.app.CreationWizard.WizardViews.SelectResource
import com.progressstepper.example.app.ProgressStepper.progressstepper
import de.jensd.fx.glyphs.materialicons.MaterialIcon
import de.jensd.fx.glyphs.materialicons.MaterialIconView
import javafx.event.ActionEvent
import javafx.geometry.Pos
import tornadofx.*

class CreationWizard: View() {
    val viewModel: CreationWizardViewModel by inject()
            val nodeList = listOf(MaterialIconView(MaterialIcon.RECORD_VOICE_OVER),
    MaterialIconView(MaterialIcon.COLLECTIONS_BOOKMARK),
    MaterialIconView(MaterialIcon.BOOK))
    val viewsList = listOf(SelectResource(viewModel), SelectBook(viewModel), SelectResource(viewModel))




    override val root = borderpane {

        style {
            alignment = Pos.CENTER
        }
        setPrefSize(1200.0, 800.0)
        top = progressstepper(nodeList) {

            alignment = Pos.CENTER
            addEventHandler(ActionEvent.ACTION) {
                viewModel.setActiveId(this.activeIndexProperty.value)
            }
            viewModel.activeIdProperty?.onChange {
                if(it != stepperViewModel.activeIndex && it!= null) {
                    nextView(it)
                }
            }
        }

        center = hbox{
            alignment = Pos.CENTER
            add(viewsList[0])
        }

        viewModel.activeIdProperty?.onChange {
            if(it != null) {
                center = hbox {
                    alignment = Pos.CENTER
                    add(viewsList[it])
                }
            }
        }
    }

}