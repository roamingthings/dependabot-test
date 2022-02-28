apply(from = "../../dependencies.gradle")

plugins {
    id("java")
}

repositories {
    mavenCentral()
}

val awsVersion: String by project
dependencies {
    implementation(platform("software.amazon.awssdk:bom:$awsVersion"))
    implementation("software.amazon.awssdk:ssm")
    implementation("com.fasterxml.jackson.core:jackson-databind:${project.properties["jacksonVersion"]}")
    implementation("org.assertj:assertj-core:3.22.0")
}
