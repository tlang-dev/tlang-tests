name := "io.sorne.tlang.tests"

version := "0.1"

scalaVersion := "2.13.4"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % Test

lazy val core = RootProject(file("../io.sorne.tlang"))

val main = Project(id = "TLangTests", base = file(".")).dependsOn(core)
