plugins {
    kotlin("jvm") version "1.9.20"
    // needed a way to run a CLI through Gradle, this has the JavaExec task we can build on
    application
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
}

tasks {
    wrapper {
        gradleVersion = "8.5"
    }

    register<JavaExec>("runApp") {
        group = "application"
        description = "custom run tasks"

        classpath = sourceSets.main.get().runtimeClasspath

        var mc = "Day02Kt"
        if (project.hasProperty("myClass")) {
            val prop = project.property("myClass").toString()
            println("----> ${prop}")
            mc = prop
            println("----> ${mc}")
        }
        // TODO: configure as gradle property (project.hasProperty("foo") ? project.getProperty("foo") : "default")
        mainClass.set(mc)
    }
}
