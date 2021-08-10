package org.devops

def Build(buildType,buildShell){
    def buildTools = ["maven":"M2","ant":"ANT","gradle":"GRADLE","npm":"NPM"]
    println("当前构建工具为 ${buildType}")
    buildHome = tool buildTools[buildType]

    sh "${buildHome}/bin${buildType} ${buildShell}" 
}

