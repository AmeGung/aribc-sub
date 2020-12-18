package com.github.amegung.aribcsub.services

import com.intellij.openapi.project.Project
import com.github.amegung.aribcsub.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
