import io.gitlab.arturbosch.detekt.Detekt

plugins {
    kotlin("jvm") version "2.0.0"
    id("io.gitlab.arturbosch.detekt") version "1.23.8"
}

group = "ru.job4j"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
}

tasks {
    withType<Detekt> {
        reports {
            html.required.set(true)
            xml.required.set(true)
            txt.required.set(false)
        }
    }
    test {
        useJUnitPlatform()
    }
}

detekt {
    toolVersion = "1.23.8"
    config.setFrom("$projectDir/config/detekt/detekt.yml")
    buildUponDefaultConfig = true
    allRules = false
}
