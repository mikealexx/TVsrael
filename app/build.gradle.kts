plugins {
    alias(libs.plugins.android.application)
    apply{"com.android.library"}
    apply{"org.jetbrains.kotlin.android"}
}

android {
    namespace = "com.mikealexx.tvsrael"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mikealexx.tvsrael"
        minSdk = 21
        targetSdk = 34
        //x.y.zw: x[1 - Play Store, 2 - Non Play Store].y[minor version number].z[update number].w[1 - mobile, 2 - android TV]
        versionCode = 10442
        versionName = "v1.0.42 - alpha"

    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("com.google.android.exoplayer:exoplayer:2.14.2")
    implementation(libs.androidx.appcompat)
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.22")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.22")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.squareup.okhttp3:okhttp:4.9.3");
}