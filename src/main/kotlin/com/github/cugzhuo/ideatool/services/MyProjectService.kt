package com.github.cugzhuo.ideatool.services

import com.intellij.openapi.project.Project
import com.github.cugzhuo.ideatool.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
