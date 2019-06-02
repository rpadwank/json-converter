name := "JsonDemo2"

version := "0.1"

scalaVersion := "2.12.8"

//libraryDependencies += "net.liftweb" %% "lift-json" % "3.3.0"

libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-json" % "3.3.0",
  "org.json4s" %% "json4s-native" % "3.6.5"
)