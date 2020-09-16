package KotlinWithParameters

import KotlinWithParameters.buildTypes.*
import KotlinWithParameters.vcsRoots.*
import KotlinWithParameters.vcsRoots.KotlinWithParameters_HttpsGithubComKseniailinaKotlinWithParametersRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    id("KotlinWithParameters")
    parentId("_Root")
    name = "Kotlin With Parameters"

    vcsRoot(KotlinWithParameters_HttpsGithubComKseniailinaKotlinWithParametersRefsHeadsMaster)

    buildType(KotlinWithParameters_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinWithParameters_HttpsGithubComKseniailinaKotlinWithParametersRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
