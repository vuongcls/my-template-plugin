package com.github.vuongcls.mytemplateplugin.services

import com.intellij.openapi.project.Project
import com.github.vuongcls.mytemplateplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
