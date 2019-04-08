package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'TestConfig'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("TestConfig")) {
    vcs {
        remove(RelativeId("HttpsGithubComSkbkonturRetailUiRefsHeadsMaster_2"))
        add(RelativeId("RetailUi"))
    }

    triggers {
        val trigger1 = find<VcsTrigger> {
            vcs {
            }
        }
        trigger1.apply {
            enabled = false
        }
    }
}
