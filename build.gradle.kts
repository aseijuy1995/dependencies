buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(ClassPath.tools)
        classpath(ClassPath.kotlin)
        //data store - proto
        classpath(ClassPath.protobuf)
        //navigation
        classpath(ClassPath.navigation)
        //hilt
        classpath(ClassPath.hilt)
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