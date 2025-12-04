import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2025.01"

project {
    buildType(UvPytestBuild)
}

object UvPytestBuild : BuildType({
    name = "Command line: echo + pytest"

    steps {
        script {
            name = "Echo and run pytest"
            scriptContent = """
                echo dima
                uv run pytest
            """.trimIndent()
        }
    }
})
