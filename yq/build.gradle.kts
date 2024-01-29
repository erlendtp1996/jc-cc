plugins {
    id("application")
}

application {
    mainClass = "main.java.YQMain"
}

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/org.yaml/snakeyaml
    implementation("org.yaml:snakeyaml:1.8")
}