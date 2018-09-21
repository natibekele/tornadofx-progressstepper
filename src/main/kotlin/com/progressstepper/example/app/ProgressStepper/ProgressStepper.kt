package com.progressstepper.example.app.ProgressStepper

import javafx.geometry.Pos
import javafx.scene.Node
import javafx.scene.layout.*
import tornadofx.*
import tornadofx.Stylesheet.Companion.root


class ProgressStepper(steps: List<Node>) : HBox() {
    val stepperViewModel = ProgressStepperViewModel()
    var steps: List<Node> = steps
    var space: Double = 0.0
    var activeIndexProperty = stepperViewModel.activeIndexProperty


    init {
        spaceNodes()
        with(root) {
            vgrow = Priority.ALWAYS
            hgrow = Priority.ALWAYS
            anchorpane {

                stackpane {
                    setPrefSize(500.0, 80.0)
                    progressbar(0.0) {
                        stepperViewModel.progressValueProperty.onChange {
                            if (it != null) {
                                progress = it
                            }
                        }
                        setPrefSize(steps.size * space, 20.0)
                        setWidth(500.0)
                        hgrow = Priority.ALWAYS
                    }
                    hbox(space) {
                        anchorpaneConstraints {
                            topAnchor = 40.0
                            leftAnchor = 0.0
                        }
                        alignment = Pos.CENTER
                        steps.forEach {
                            button("", it) {
                                action {
                                    if(indexInParent < activeIndexProperty.value) {
                                        nextView(indexInParent)
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    fun nextView(index: Int) {
        stepperViewModel.activeIndex = index
        stepperViewModel.setProgress((index.toDouble() / (steps.size - 1)))
    }

    private fun spaceNodes() {
        val width = 500.0
        val numNodes = steps.size
        space = width / (numNodes - 1)
    }
}

fun Pane.progressstepper(steps: List<Node>, init: ProgressStepper.() -> Unit): ProgressStepper {
    val ps = ProgressStepper(steps)
    ps.init()
    add(ps)
    return ps
}