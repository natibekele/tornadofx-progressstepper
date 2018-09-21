package com.progressstepper.example.app.CreationWizard

import tornadofx.*

class CreationWizardViewModel : ViewModel() {

    val model = CreationWizardModel()

    val activeIdProperty = bind { model.actveIdProperty }
    val activeViewProperty = bind { model.activeViewProperty }
    val sourceLanguageProperty = bind{model.sourceLanguageProperty}
    val targetLanguageProperty = bind{model.targetLanguageProperty}


    fun setActiveId(newIndex : Int) {
        model.activeId = newIndex
    }
}