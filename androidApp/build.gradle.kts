plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
    kotlin("android")
    kotlin("kapt")
}

dependencies {
    implementation(project(":shared"))

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${project.property("kotlin_version")}")

    // AndroidX
    implementation("androidx.multidex:multidex:${project.property("android_multidex")}")
    implementation("androidx.navigation:navigation-fragment-ktx:${project.property("android_navigation")}")
    implementation("androidx.navigation:navigation-ui-ktx:${project.property("android_navigation")}")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")

    // Material Components
    implementation("com.google.android.material:material:${project.property("android_material")}")
}

android {
    compileSdkVersion(30)

    defaultConfig {
        applicationId = "pt.saphirex.sample.android"
        minSdkVersion(16)
        targetSdkVersion(30)
        multiDexEnabled = true
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        dataBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}