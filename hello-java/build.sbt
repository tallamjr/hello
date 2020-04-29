name := "Tarek Allam Jr"
version := "0.1"
organization := "org.aar.tallamjr"

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines")

crossPaths := false // drop off Scala suffix from artifact names.
autoScalaLibrary := false // exclude scala-library from dependencies

libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12" % Test,
    "com.novocode" % "junit-interface" % "0.11" % Test exclude("junit", "junit-dep")
)
