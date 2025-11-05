val djlVersion = "0.31.1"

plugins {
   kotlin("jvm") version "2.2.21"
}

group = "com.sbarrasa"
version = "1.0-SNAPSHOT"

repositories {
   mavenCentral()
   maven("https://mlrepo.djl.ai/maven/")
}

dependencies {
   implementation("ai.djl:api:$djlVersion")
   implementation("ai.djl:model-zoo:$djlVersion")
   implementation("ai.djl.huggingface:tokenizers:$djlVersion")

   runtimeOnly("ai.djl.onnxruntime:onnxruntime-engine:$djlVersion")
   runtimeOnly("org.slf4j:slf4j-simple:2.0.13")

   testImplementation(kotlin("test"))
}

kotlin {
   jvmToolchain(21)
}