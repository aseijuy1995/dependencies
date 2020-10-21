buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Libs.ClassPath.toolsBuildGradle)
        classpath(Libs.ClassPath.kotlinGradlePlugin)
        //data store - proto
        classpath(Libs.ClassPath.protobufGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}