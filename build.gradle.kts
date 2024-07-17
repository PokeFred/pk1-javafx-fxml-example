group = "de.pokefred.app"
version = "1.0-SNAPSHOT"

application {
    mainClass = "de.pokefred.app.App"
}

javafx {
    version = "22.0.1"
    modules(
        "javafx.base",
        "javafx.graphics",
        "javafx.controls",
        "javafx.fxml"
    )
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }

    compileTestJava {
        options.encoding = "UTF-8"
    }

    test {
        useJUnitPlatform()
    }
}
