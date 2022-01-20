package com.github.lchli.mutiprocesstemplate.services

import com.intellij.openapi.project.Project
import com.github.lchli.mutiprocesstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
