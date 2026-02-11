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
        // The fix: Kotlin syntax uses 'uri()' and double quotes
        maven { url = uri("https://api.xposed.info/") }
    }
}

rootProject.name = "XTimeMachine" // Keep your project name
include(":app")
