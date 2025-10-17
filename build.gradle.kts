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
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("io.kotest:kotest-runner-junit5:5.4.2")
    testImplementation("io.kotest:kotest-assertions-core:5.4.2")
}

tasks.test {
    useJUnitPlatform()
}