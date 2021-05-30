name := "scala-github-actions"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,
  "net.debasishg" %% "redisclient" % "3.30"
)

coverageEnabled := true
