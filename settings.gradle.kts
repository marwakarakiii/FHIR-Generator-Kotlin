// Top-level build.gradle.kts
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("com.android.application") version "8.2.0" apply false
        id("org.jetbrains.kotlin.android") version "2.0.0" apply false
        id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false 
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "FHIR-Generator-Kotlin"
include(":app")
