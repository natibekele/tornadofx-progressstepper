package com.progressstepper.example.app.ProgressStepper

import javafx.scene.Node
import tornadofx.*


class ProgressStepperViewModel: ViewModel() {

    var activeIndex : Int by property(0)
    var activeIndexProperty = getProperty(ProgressStepperViewModel::activeIndex)

    var progressValue : Double by property (0.0)
    var progressValueProperty = getProperty(ProgressStepperViewModel:: progressValue)

    var views: List<Node> by property()
    var viewProperty = getProperty(ProgressStepperViewModel:: views)

    fun setProgress(value: Double) {
        progressValue = value
    }
}