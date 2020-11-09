package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'ReactUI_Publish'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("ReactUI_Publish")) {
    triggers {
        val trigger1 = find<VcsTrigger> {
            vcs {
                branchFilter = "+:@skbkontur/react-ui@*"
            }
        }
        trigger1.apply {
            enabled = false
        }
    }
}
