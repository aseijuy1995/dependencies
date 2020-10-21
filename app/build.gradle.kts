import com.google.protobuf.gradle.builtins
import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.id
import com.google.protobuf.gradle.protoc

plugins {
    id(Libs.Plugins.application)
    kotlin(Libs.Plugins.android)
    id(Libs.Plugins.protobuf)
    kotlin(Libs.Plugins.kapt)
    kotlin(Libs.Plugins.extensions)
}

android {
    compileSdkVersion(App.compileSdk)
    buildToolsVersion(App.buildTools)

    defaultConfig {
        applicationId = App.ID
        minSdkVersion(App.minSdk)
        targetSdkVersion(App.targetSdk)
        versionCode = App.versionCode
        versionName = App.versionName
        multiDexEnabled = App.isMultiDex//method count > 65536
        testInstrumentationRunner = App.testInstrumentationRunner
    }
    buildTypes {
        getByName(App.Release.name) {
            isMinifyEnabled = App.Release.isMinify
            proguardFiles(getDefaultProguardFile(App.Release.proguardFileName), App.Release.proguardFile)
        }
    }
    buildFeatures {
        dataBinding = App.isSupportDataBinding
        viewBinding = App.isSupportViewBinding
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
    implementation(Libs.kotlinStdLib)
    implementation(Libs.materialLib)
    implementation(Libs.constraintLayoutLib)
    testImplementation(Libs.jUnitLib)
    androidTestImplementation(Libs.jUnitAndroidLib)
    androidTestImplementation(Libs.espressoLib)
    //ktx
    implementation(Libs.coreLib)
    implementation(Libs.collectionLib)
    //activity
    implementation(Libs.activityKtxLib)
    //appcompat
    implementation(Libs.appcompatLib)
    implementation(Libs.appcompatResourcesLib)
    //app start up
    implementation(Libs.appStartUpLib)
    //data store
    implementation(Libs.dataStorePrefLib)
    implementation(Libs.dataStoreCoreLib)
    //proto
    implementation(Libs.protoLib)
    //fragment
    implementation(Libs.fragmentKtxLib)
    debugImplementation(Libs.fragmentTestingLib)
    //lifecycle
    implementation(Libs.viewModelKtxLib)
    implementation(Libs.liveDataKtxLib)
    implementation(Libs.lifecycleRuntimeLib)
    implementation(Libs.lifecycleCommonLib)
    implementation(Libs.viewModelSavedStateLib)
    implementation(Libs.lifecycleServiceLib)
    implementation(Libs.lifecycleProcessLib)
    implementation(Libs.lifecycleReactiveStreamsLib)
    //navigation
    implementation(Libs.navRuntimeKtxLib)
    implementation(Libs.navFragmentKtxLib)
    implementation(Libs.navUiKtxLib)
    implementation(Libs.navDynamicFeaturesFragmentLib)
    androidTestImplementation(Libs.navTestingLib)
    //paging
    implementation(Libs.pagingRuntimeKtxLib)
    testImplementation(Libs.pagingCommonKtxLib)
//    implementation(Libs.pagingGuavaLib)
    //room
    implementation(Libs.roomRuntimeLib)
    implementation(Libs.roomKtxLib)
//    implementation(Libs.roomCoroutinesLib)
    kapt(Libs.roomCompilerLib)
    testImplementation(Libs.roomTestingLib)
    //work manager
    implementation(Libs.workRunTimeKtxLib)
    androidTestImplementation(Libs.workRunTimeKtxLib)
    //palette
    implementation(Libs.paletteKtxLib)
    //sqlite
    implementation(Libs.sqLiteKtxLib)
    //coroutines
    implementation(Libs.coroutinesCoreLib)
    implementation(Libs.coroutinesAndroidLib)
    testImplementation(Libs.coroutinesTestingLib)
    //okhttp3
    implementation(Libs.okHttpLib)
    implementation(Libs.okHttpMockWebServerLib)
    implementation(Libs.okHttpLoggingInterceptorLib)
    testImplementation(Libs.okHttpMockWebServerTestingLib)
    //okio
    implementation(Libs.okioLib)
    //retrofit
    implementation(Libs.retrofitLib)
    implementation(Libs.retrofitConverterGsonLib)
    implementation(Libs.retrofitMockLib)
    //gson
    implementation(Libs.gsonLib)
    //koin
    implementation(Libs.koinCoreLib)
    implementation(Libs.koinCoreExtLib)
    implementation(Libs.koinScopeLib)
    implementation(Libs.koinViewModelLib)
    implementation(Libs.koinFragmentLib)
    testImplementation(Libs.koinTestingLib)
    //glide
    implementation(Libs.glideLib)
    implementation(Libs.glideOkHttpIntegrationLib)
    kapt(Libs.glideCompilerLib)
    //logger
    implementation(Libs.loggerLib)
    //rx java
    implementation(Libs.rxJavaLib)
    //rx android
    implementation(Libs.rxAndroidLib)
    //rxkotlin
    implementation(Libs.rxKotlinLib)
    //rxbinding
    implementation(Libs.rxBindingLib)
    implementation(Libs.rxBindingCoreLib)
    implementation(Libs.rxBindingAppcompatLib)
    implementation(Libs.rxBindingDrawerLayoutLib)
//    implementation(Libs.rxBindingLeanbackLib)//min17
    implementation(Libs.rxBindingRecyclerViewLib)
    implementation(Libs.rxBindingSlidingPaneLayoutLib)
    implementation(Libs.rxBindingSwipereFreshLayoutLib)
    implementation(Libs.rxBindingViewPagerLib)
    implementation(Libs.rxBindingViewPager2Lib)
    //rx permission
//    implementation(Libs.rxPermissionsLib)
    //rxrelay
    implementation(Libs.rxRelayLib)
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
        artifact = Libs.protobufLib
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