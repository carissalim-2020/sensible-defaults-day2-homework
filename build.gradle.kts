plugins {
    java
    idea
    eclipse
    id("java")
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.5"
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude (group = "org.junit.vintage", module = "junit-vintage-engine")
    }
    implementation("junit:junit:4.13.1")
    implementation("com.mysql:mysql-connector-j:8.4.0")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:3.2.5")
    testImplementation ("com.h2database:h2")
    compileOnly("org.projectlombok:lombok:1.18.32")
}

tasks.test {
    useJUnitPlatform()
}