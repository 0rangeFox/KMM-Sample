buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    dependencies {
        // Universal
        classpath("com.android.tools.build:gradle:${project.property("android_build_tools_gradle")}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.property("kotlin_version")}")

        // Android
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${project.property("android_navigation")}")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}