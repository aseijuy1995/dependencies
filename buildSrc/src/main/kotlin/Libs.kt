object Libs {

    //jetBrains
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinStd}"

    //ktx
    const val coreLib = "androidx.core:core-ktx:${Versions.core}"
    const val collectionLib = "androidx.collection:collection-ktx:${Versions.collection}"

    //activity
    const val activityKtxLib = "androidx.activity:activity-ktx:${Versions.activity}"

    //appcompat
    const val appcompatLib = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val appcompatResourcesLib = "androidx.appcompat:appcompat-resources:${Versions.appcompat}"

    //app start up
    const val appStartUpLib = "androidx.startup:startup-runtime:${Versions.appStartUp}"

    //data store
    const val dataStorePrefLib = "androidx.datastore:datastore-preferences:${Versions.dataStore}"
    const val dataStoreCoreLib = "androidx.datastore:datastore-core:${Versions.dataStore}"

    //proto
    const val protoLib = "com.google.protobuf:protobuf-javalite:${Versions.proto}"

    //fragment
    const val fragmentKtxLib = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val fragmentTestingLib = "androidx.fragment:fragment-testing:${Versions.fragment}"//Unused

    //lifecycle
    const val viewModelKtxLib = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val liveDataKtxLib = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    const val lifecycleRuntimeLib = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val lifecycleCommonLib = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"//DefaultLifecycleObserver
    const val viewModelSavedStateLib = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"//Unused
    const val lifecycleServiceLib = "androidx.lifecycle:lifecycle-service:${Versions.lifecycle}"//Unused
    const val lifecycleProcessLib = "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"//Unused
    const val lifecycleReactiveStreamsLib = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${Versions.lifecycle}"//Unused

    //navigation
    const val navRuntimeKtxLib = "androidx.navigation:navigation-runtime-ktx:${Versions.navigation}"//Unused
    const val navFragmentKtxLib = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"//Unused
    const val navUiKtxLib = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"//Unused
    const val navDynamicFeaturesFragmentLib = "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"//Unused
    const val navTestingLib = "androidx.navigation:navigation-testing:${Versions.navigation}"//Unused

    //paging
    const val pagingRuntimeKtxLib = "androidx.paging:paging-runtime-ktx:${Versions.paging}"
    const val pagingCommonKtxLib = "androidx.paging:paging-common-ktx:${Versions.paging}"
    const val pagingGuavaLib = "androidx.paging:paging-guava:${Versions.paging}"//Unused

    //room
    const val roomRuntimeLib = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtxLib = "androidx.room:room-ktx:${Versions.room}"
    const val roomCoroutinesLib = "androidx.room:room-coroutines:${Versions.room}"
    const val roomCompilerLib = "androidx.room:room-compiler:${Versions.room}"
    const val roomTestingLib = "androidx.room:room-testing:${Versions.room}"//Unused

    //work manager
    const val workRunTimeKtxLib = "androidx.work:work-runtime-ktx:${Versions.work}"
    const val workTestingKtxLib = "androidx.work:work-testing:${Versions.work}"

    //palette
    const val paletteKtxLib = "androidx.palette:palette-ktx:${Versions.palette}"

    //sqlite
    const val sqLiteKtxLib = "androidx.sqlite:sqlite-ktx:${Versions.sqlite}"

    //coroutines
    const val coroutinesCoreLib = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroidLib = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    const val coroutinesTestingLib = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"

    //okhttp3
    const val okHttpLib = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val okHttpMockWebServerLib = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"
    const val okHttpLoggingInterceptorLib = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    const val okHttpMockWebServerTestingLib = "com.squareup.okhttp3:mockwebserver:${Versions.okhttp}"

    //okio
    const val okioLib = "com.squareup.okio:okio:${Versions.okio}"

    //retrofit
    const val retrofitLib = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverterGsonLib = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitMockLib = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"

    //gson
    const val gsonLib = "com.google.code.gson:gson:${Versions.gson}"

    //koin
    const val koinCoreLib = "org.koin:koin-core:${Versions.koin}"
    const val koinCoreExtLib = "org.koin:koin-core-ext:${Versions.koin}"
    const val koinScopeLib = "org.koin:koin-androidx-scope:${Versions.koin}"
    const val koinViewModelLib = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koinFragmentLib = "org.koin:koin-androidx-fragment:${Versions.koin}"
    const val koinTestingLib = "org.koin:koin-test:${Versions.koin}"

    //glide
    const val glideLib = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideOkHttpIntegrationLib = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
    const val glideCompilerLib = "com.github.bumptech.glide:compiler:${Versions.glide}"

    //logger
    const val loggerLib = "com.orhanobut:logger:${Versions.logger}"

    //rx java
    const val rxJavaLib = "io.reactivex.rxjava3:rxjava:${Versions.rxJava}"

    //rx android
    const val rxAndroidLib = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid}"

    //rxkotlin
    const val rxKotlinLib = "io.reactivex.rxjava3:rxkotlin:${Versions.rxKotlin}"

    //rxbinding
    const val rxBindingLib = "com.jakewharton.rxbinding4:rxbinding:${Versions.rxBinding}"
    const val rxBindingCoreLib = "com.jakewharton.rxbinding4:rxbinding-core:${Versions.rxBinding}"
    const val rxBindingAppcompatLib = "com.jakewharton.rxbinding4:rxbinding-appcompat:${Versions.rxBinding}"
    const val rxBindingDrawerLayoutLib = "com.jakewharton.rxbinding4:rxbinding-drawerlayout:${Versions.rxBinding}"
    const val rxBindingLeanbackLib = "com.jakewharton.rxbinding4:rxbinding-leanback:${Versions.rxBinding}"//min 17
    const val rxBindingRecyclerViewLib = "com.jakewharton.rxbinding4:rxbinding-recyclerview:${Versions.rxBinding}"
    const val rxBindingSlidingPaneLayoutLib = "com.jakewharton.rxbinding4:rxbinding-slidingpanelayout:${Versions.rxBinding}"
    const val rxBindingSwipereFreshLayoutLib = "com.jakewharton.rxbinding4:rxbinding-swiperefreshlayout:${Versions.rxBinding}"
    const val rxBindingViewPagerLib = "com.jakewharton.rxbinding4:rxbinding-viewpager:${Versions.rxBinding}"
    const val rxBindingViewPager2Lib = "com.jakewharton.rxbinding4:rxbinding-viewpager2:${Versions.rxBinding}"

    //rx permission
    const val rxPermissionsLib = "com.github.tbruyelle:rxpermissions:${Versions.rxPermissions}"

    //rxrelay
    const val rxRelayLib = "com.jakewharton.rxrelay3:rxrelay:${Versions.rxRelay}"
}