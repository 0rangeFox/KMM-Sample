import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    id("com.android.library")
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    kotlin("kapt")
    kotlin("plugin.serialization") version "1.4.32"
}

version = "1.0"

kotlin {
    android()

    val iosTarget: (String, KotlinNativeTarget.() -> Unit) -> KotlinNativeTarget =
        if (System.getenv("SDK_NAME")?.startsWith("iphoneos") == true)
            ::iosArm64
        else
            ::iosX64

    iosTarget("ios") {}

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "14.1"
        frameworkName = "shared"
        podfile = project.file("../iosApp/Podfile")
    }
    
    sourceSets {
        val commonMain by getting

        val androidMain by getting {
            dependencies {
                // AndroidX
                implementation("androidx.multidex:multidex:${project.property("android_multidex")}")

                // Material Components
                implementation("com.google.android.material:material:${project.property("android_material")}")
            }
        }

        val iosMain by getting
    }
}

android {
    compileSdkVersion(30)

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdkVersion(16)
        targetSdkVersion(30)
        multiDexEnabled = true
    }

    buildFeatures {
        dataBinding = true
    }
}