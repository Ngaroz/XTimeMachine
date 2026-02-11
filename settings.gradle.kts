pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
}
allprojects {
    repositories {
        google()
        mavenCentral() // <--- ADD THIS LINE
        jcenter()
    }
}
rootProject.name = "XTimeMachine"
include(":app")
