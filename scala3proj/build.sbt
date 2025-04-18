val scala3Version = "3.6.4"
Compile / resourceDirectory := baseDirectory.value / "src" / "main" / "resources"


lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3proj",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test
    
  )
