import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.targets

plugins {
    kotlin("jvm") version "1.9.23"
}

kotlin {
    jvmToolchain(18) // 사용할 JDK 런타임 지정
}

group = "io.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}