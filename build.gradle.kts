plugins {
    id("com.ryderbelserion.feather.patcher")
    `java-plugin`
}

rootProject.version = rootProject.property("version") as String
rootProject.group = rootProject.property("group") as String

val path = projectDir.resolve("src")

patcher {
    patchesDirectory.set(projectDir.resolve("patches"))
    targetDirectory.set(path.resolve("target"))
    workingDirectory.set(path)

    url.set("git@github.com:snakeyaml/snakeyaml.git")
    sha.set("7b8b171c0dbfa8af665c24a63d91f2b185b8701b")

    group = "feather-patcher"
}

tasks.withType<Test> {
    isEnabled = false
}