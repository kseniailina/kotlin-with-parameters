package KotlinWithParameters.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinWithParameters_HttpsGithubComKseniailinaKotlinWithParametersRefsHeadsMaster : GitVcsRoot({
    uuid = "cbe5abc1-bfbd-463c-8d21-feb4e3d02343"
    name = "https://github.com/kseniailina/kotlin-with-parameters#refs/heads/master"
    pollInterval = 300
    url = "https://github.com/kseniailina/kotlin-with-parameters"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:aaf7c681-992e-450b-837c-3eb8c6c23651"
    }
})
