import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2025.01"

project {
    buildType(SimpleBuild)
}

object SimpleBuild : BuildType({
    name = "Simple Build"

    steps {
        script {
            name = "Hello"
            scriptContent = """echo "Hello, World!""""
        }
        script {
            name = "Pytest"
            scriptContent = """uv run pytest"""
        }
    }
})
