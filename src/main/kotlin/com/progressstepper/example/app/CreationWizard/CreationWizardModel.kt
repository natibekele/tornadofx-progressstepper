package com.progressstepper.example.app.CreationWizard


import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.Node
import javafx.scene.layout.HBox
import tornadofx.*

class CreationWizardModel {
    var activeId: Int by property(0)
    var actveIdProperty = getProperty(CreationWizardModel::activeId)

    var activeView: Node by property(HBox())
    var activeViewProperty = getProperty(CreationWizardModel::activeView)

    var sourceLanguage: String by property("")
    var sourceLanguageProperty = getProperty(CreationWizardModel:: sourceLanguage)

    var targetLanguage: String by property("")
    var targetLanguageProperty = getProperty(CreationWizardModel:: targetLanguage)

//    private var project: ObservableList<Project> by property(
//            FXCollections.observableList(ProjectList().projectList
//            )
//
//    )

//    var projectProperty = getProperty(CreationWizardModel::project)

}