package com.github.tenglovemeng.epointplugin.services

import com.intellij.openapi.project.Project
import com.github.tenglovemeng.epointplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
