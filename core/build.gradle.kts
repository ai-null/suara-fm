plugins {
    id("java-library")
    id("kotlin")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation(Deps.AppConfig.kotlin)

    // body parser for retrofit
    implementation(Deps.Network.gson)
    implementation(Deps.Network.gsonConverter)
}