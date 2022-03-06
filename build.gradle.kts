buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(BuildPlugins.androidApp) version Versions.anroidapp apply false
    id(BuildPlugins.androidLib) version Versions.androidlib apply false
    id(BuildPlugins.kotlinAndroid) version Versions.kotlinandroid apply false
    id(BuildPlugins.kotlinJvm) version Versions.kotlinjvm apply false
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
