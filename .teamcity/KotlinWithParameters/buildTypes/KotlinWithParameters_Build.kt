package KotlinWithParameters.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinWithParameters_Build : BuildType({
    name = "Build"

    params {
        param("env.someParam", "222")
        param("param1", "444")
    }

    vcs {
        root(KotlinWithParameters.vcsRoots.KotlinWithParameters_HttpsGithubComKseniailinaKotlinWithParametersRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = """echo "hello""""
        }
    }

    triggers {
        vcs {
        }
    }
})
