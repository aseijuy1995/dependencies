import com.google.protobuf.gradle.builtins
import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.protoc

plugins {
    id(Plugins.application)
    kotlin(Plugins.Kotlin.android)
    id(Plugins.protobuf)
    kotlin(Plugins.Kotlin.kapt)
    kotlin(Plugins.Kotlin.extensions)
}

android {
    compileSdkVersion(Android.compileSdk)
    buildToolsVersion(Android.buildTools)

    defaultConfig {
        applicationId = Android.ID
        minSdkVersion(Android.minSdk)
        targetSdkVersion(Android.targetSdk)
        versionCode = Android.versionCode
        versionName = Android.versionName
        multiDexEnabled = Android.isMultiDex//method count > 65536
        testInstrumentationRunner = Android.testInstrumentationRunner
    }
    buildTypes {
        getByName(Android.Release.name) {
            isMinifyEnabled = Android.Release.isMinify
            proguardFiles(getDefaultProguardFile(Android.Release.proguardFileName), Android.Release.proguardFile)
        }
    }
    buildFeatures {
        dataBinding = Android.isSupportDataBinding
        viewBinding = Android.isSupportViewBinding
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(Libs.Jetbrains.kotlinStdLib)
    implementation(Libs.materialLib)
    implementation(Libs.AndroidX.constraintLayoutLib)
    testImplementation(Libs.jUnitLib)
    androidTestImplementation(Libs.AndroidX.jUnitAndroidLib)
    androidTestImplementation(Libs.AndroidX.espressoLib)
    //ktx
    implementation(Libs.AndroidX.coreLib)
    implementation(Libs.AndroidX.collectionLib)
    //activity
    implementation(Libs.AndroidX.activityKtxLib)
    //appcompat
    implementation(Libs.AndroidX.appcompatLib)
    implementation(Libs.AndroidX.appcompatResourcesLib)
    //app start up
    implementation(Libs.AndroidX.appStartUpLib)
    //data store
    implementation(Libs.AndroidX.dataStorePrefLib)
    implementation(Libs.AndroidX.dataStoreCoreLib)
    //proto
    implementation(Libs.ProtoBuf.protoLib)
    //fragment
    implementation(Libs.AndroidX.fragmentKtxLib)
    debugImplementation(Libs.AndroidX.fragmentTestingLib)
    //lifecycle
    implementation(Libs.AndroidX.viewModelKtxLib)
    implementation(Libs.AndroidX.liveDataKtxLib)
    implementation(Libs.AndroidX.lifecycleRuntimeLib)
    implementation(Libs.AndroidX.lifecycleCommonLib)
    implementation(Libs.AndroidX.viewModelSavedStateLib)
    implementation(Libs.AndroidX.lifecycleServiceLib)
    implementation(Libs.AndroidX.lifecycleProcessLib)
    implementation(Libs.AndroidX.lifecycleReactiveStreamsLib)
    //navigation
    implementation(Libs.AndroidX.navRuntimeKtxLib)
    implementation(Libs.AndroidX.navFragmentKtxLib)
    implementation(Libs.AndroidX.navUiKtxLib)
    implementation(Libs.AndroidX.navDynamicFeaturesFragmentLib)
    androidTestImplementation(Libs.AndroidX.navTestingLib)
    //paging
    implementation(Libs.AndroidX.pagingRuntimeKtxLib)
    testImplementation(Libs.AndroidX.pagingCommonKtxLib)
//    implementation(Libs.pagingGuavaLib)
    //room
    implementation(Libs.AndroidX.roomRuntimeLib)
    implementation(Libs.AndroidX.roomKtxLib)
//    implementation(Libs.AndroidX.roomCoroutinesLib)
    kapt(Libs.AndroidX.roomCompilerLib)
    testImplementation(Libs.AndroidX.roomTestingLib)
    //work manager
    implementation(Libs.AndroidX.workRunTimeKtxLib)
    androidTestImplementation(Libs.AndroidX.workRunTimeKtxLib)
    //palette
    implementation(Libs.AndroidX.paletteKtxLib)
    //sqlite
    implementation(Libs.AndroidX.sqLiteKtxLib)
    //coroutines
    implementation(Libs.Jetbrains.coroutinesCoreLib)
    implementation(Libs.Jetbrains.coroutinesAndroidLib)
    testImplementation(Libs.Jetbrains.coroutinesTestingLib)
    //okhttp3
    implementation(Libs.Squareup.okHttpLib)
    implementation(Libs.Squareup.okHttpMockWebServerLib)
    implementation(Libs.Squareup.okHttpLoggingInterceptorLib)
    testImplementation(Libs.Squareup.okHttpMockWebServerTestingLib)
    //okio
    implementation(Libs.Squareup.okioLib)
    //retrofit
    implementation(Libs.Squareup.retrofitLib)
    implementation(Libs.Squareup.retrofitConverterGsonLib)
    implementation(Libs.Squareup.retrofitMockLib)
    //gson
    implementation(Libs.gsonLib)
    //koin
    implementation(Libs.Koin.koinCoreLib)
    implementation(Libs.Koin.koinCoreExtLib)
    implementation(Libs.Koin.koinScopeLib)
    implementation(Libs.Koin.koinViewModelLib)
    implementation(Libs.Koin.koinFragmentLib)
    testImplementation(Libs.Koin.koinTestingLib)
    //glide
    implementation(Libs.BumpTech.glideLib)
    implementation(Libs.BumpTech.glideOkHttpIntegrationLib)
    kapt(Libs.BumpTech.glideCompilerLib)
    //logger
    implementation(Libs.loggerLib)
    //rx java
    implementation(Libs.ReactiveX.rxJavaLib)
    //rx android
    implementation(Libs.ReactiveX.rxAndroidLib)
    //rxkotlin
    implementation(Libs.ReactiveX.rxKotlinLib)
    //rxbinding
    implementation(Libs.Jakewharton.rxBindingLib)
    implementation(Libs.Jakewharton.rxBindingCoreLib)
    implementation(Libs.Jakewharton.rxBindingAppcompatLib)
    implementation(Libs.Jakewharton.rxBindingDrawerLayoutLib)
//    implementation(Libs.Jakewharton.rxBindingLeanbackLib)//min17
    implementation(Libs.Jakewharton.rxBindingRecyclerViewLib)
    implementation(Libs.Jakewharton.rxBindingSlidingPaneLayoutLib)
    implementation(Libs.Jakewharton.rxBindingSwipereFreshLayoutLib)
    implementation(Libs.Jakewharton.rxBindingViewPagerLib)
    implementation(Libs.Jakewharton.rxBindingViewPager2Lib)
    //rx permission
//    implementation(Libs.rxPermissionsLib)
    //rxrelay
    implementation(Libs.Jakewharton.rxRelayLib)
    //Test
    testImplementation(Libs.mockitoLib)
}

//data store - proto
// Generates the java Protobuf-lite code for the Protobufs in this project. See
// https://github.com/google/protobuf-gradle-plugin#customizing-protobuf-compilation
// for more information.

//Kotlin
protobuf.protobuf.run {
    protoc {
        artifact = Libs.ProtoBuf.protobufLib
    }
    generateProtoTasks {
        all().forEach {
            it.builtins {
                java {
                    id("lite")
                }
            }
        }
    }
}

//Groovy
//protobuf {
//    protoc {
//        artifact = "com.google.protobuf:protoc:3.10.0"
//    }
//    generateProtoTasks {
//        all().each { task ->
//            task.builtins {
//                java {
//                    option 'lite'
//                }
//            }
//        }
//    }
//}