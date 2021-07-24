class Deps {
    object AppConfig {
        const val sdkVersion = 30
        const val buildToolsVersion = "30.0.3"
        const val minSdkVersion = 23
        const val targetSdkVersion = 30
        const val versionCode = 1
        const val versionName = "1.0"

        private const val kotlinVersion = "1.5.0"
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    }

    object AndroidX {
        const val androidCore = "androidx.core:core-ktx:1.3.1"
        const val appCompat = "androidx.appcompat:appcompat:1.2.0"
        const val androidLegacy = "androidx.legacy:legacy-support-v4:1.0.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.1"
        // Test
        const val junit = "androidx.test.ext:junit:1.1.2"
        const val junitImp = "junit:junit:4.13.2"
        const val espresso = "androidx.test.espresso:espresso-core:3.3.0"
        // Navigation
        private const val navVersion = "2.3.5"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navVersion"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:$navVersion"
    }

    object Network {
        // http interceptor
        const val httpInterceptor = "com.squareup.okhttp3:logging-interceptor:4.2.2"
        // http request
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        // body parser for retrofit
        const val gson = "com.google.code.gson:gson:2.8.6"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.4.0"
        // lightweight image processing
        const val glide = "com.github.bumptech.glide:glide:4.12.0"
        const val glideCompiler = "com.github.bumptech.glide:compiler:4.12.0"
    }

    object Utils {
        private const val coroutinesVersion = "1.4.2"
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"

        private const val daggerVersion = "2.27"
        const val dagger = "com.google.dagger:dagger:$daggerVersion"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    }

    object UI {
        const val material = "com.google.android.material:material:1.2.1"
    }
}