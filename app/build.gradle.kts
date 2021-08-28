plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.secrets_gradle_plugin").version("0.1")
}

android {
    compileSdkVersion(Deps.AppConfig.sdkVersion)
    buildToolsVersion(Deps.AppConfig.buildToolsVersion)

    defaultConfig {
        applicationId("com.github.ainul.suarafm")
        minSdkVersion(Deps.AppConfig.minSdkVersion)
        targetSdkVersion(Deps.AppConfig.targetSdkVersion)
        versionCode = Deps.AppConfig.versionCode
        versionName = Deps.AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            buildConfigField("String", "BASE_URL", "\"https://listen-api.listennotes.com/api/v2/\"")
        }

        getByName("release") {
            buildConfigField("String", "BASE_URL", "\"https://listen-api.listennotes.com/api/v2/\"")

            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        dataBinding = true
    }
}

dependencies {

    implementation(Deps.AppConfig.kotlin)
    implementation(Deps.AndroidX.androidCore)
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.androidLegacy)
    testImplementation(Deps.AndroidX.junitImp)
    androidTestImplementation(Deps.AndroidX.junit)
    androidTestImplementation(Deps.AndroidX.espresso)

    // material ui
    implementation(Deps.UI.material)

    // constraint layout
    implementation(Deps.AndroidX.constraintLayout)

    // http logging interceptor
    implementation(Deps.Network.httpInterceptor)

    // retrofit for http request
    implementation(Deps.Network.retrofit)

    // coroutines
    implementation(Deps.Utils.coroutinesAndroid)
    implementation(Deps.Utils.coroutinesCore)

    // Dagger
    implementation(Deps.Utils.dagger)
    kapt(Deps.Utils.daggerCompiler)

    // lightweight image processing
    implementation(Deps.Network.glide)
    kapt(Deps.Network.glideCompiler)

    // jetpack fragment
    implementation(Deps.AndroidX.navigationFragment)
    implementation(Deps.AndroidX.navigationUI)
}