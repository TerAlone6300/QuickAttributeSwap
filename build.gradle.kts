plugins {
    id("fabric-loom") version "1.7.3"
}

repositories {
    maven("https://maven.fabricmc.net/")
    maven("https://maven.terraformersmc.com/releases/")
    mavenCentral()
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.5")
    mappings("net.fabricmc:yarn:1.21.5+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.11")
    modImplementation("com.terraformersmc:modmenu:10.0.0")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}