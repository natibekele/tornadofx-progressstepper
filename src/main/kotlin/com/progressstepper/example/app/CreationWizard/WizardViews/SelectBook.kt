package com.progressstepper.example.app.CreationWizard.WizardViews

import com.progressstepper.example.app.CreationWizard.CreationWizardModel
import com.progressstepper.example.app.CreationWizard.CreationWizardViewModel
import javafx.geometry.Pos
import javafx.scene.layout.HBox
import tornadofx.*
import tornadofx.Stylesheet.Companion.root

class SelectBook(viewModel: CreationWizardViewModel) : HBox() {



    //val root = DataGrid<Project>()
//
    init {
        with(root) {
            label("this is a new view after user completes action on first view")
            //add(root)
//            datagrid(viewModel.projectsProperty.value) {
//                cellCache {
//                    vbox(10) {
//                        alignment = Pos.CENTER
//                        label(it.book.title)
//                        button()
//                    }
//                }
//            }
    }
}
}