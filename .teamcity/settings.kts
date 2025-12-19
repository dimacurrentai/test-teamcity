import jetbrains.buildServer.configs.kotlin.*

version = "2023.11"

project {
    buildType(HelloWorld)
}

object HelloWorld : BuildType({
    name = "Hello World"

    steps {
        script {
            name = "Echo"
            scriptContent = "echo Hello from TeamCity"
        }
    }
})
