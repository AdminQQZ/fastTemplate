package com.github.adminqqz.fasttemplate.services

import com.intellij.openapi.project.Project
import com.github.adminqqz.fasttemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
