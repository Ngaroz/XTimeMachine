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
        jcenter() // <--- IT MUST BE HERE (The second block)
        maven { url 'https://api.xposed.info/' } // <--- Add this backup just in case
    }
}
