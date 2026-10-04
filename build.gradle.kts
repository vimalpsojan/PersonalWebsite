plugins {
    kotlin("multiplatform") version "2.4.20"
    id("org.jetbrains.compose") version "1.12.1"
    id("org.jetbrains.kotlin.plugin.compose") version "2.4.20"
}

group = "me.vimal"
version = "1.0"

repositories {
    mavenCentral()
    google()
}

kotlin {
    js {
        browser {
            commonWebpackConfig {
                outputFileName = "PersonalWebsite.js"
            }
            testTask {
                testLogging.showStandardStreams = true
                useKarma {
                    useChromeHeadless()
                }
            }
        }
        binaries.executable()
    }
    sourceSets {
        named("jsMain") {
            dependencies {
                implementation("org.jetbrains.compose.html:html-core:1.12.1")
                implementation("org.jetbrains.compose.runtime:runtime:1.12.1")
            }
        }
        named("jsTest") {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
