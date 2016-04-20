name := """DigiHawk"""

version := "1.0-RELEASE"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
 "org.postgresql" % "postgresql" % "9.3-1100-jdbc41",
 "org.webjars" %% "webjars-play" % "2.5.0",
 "org.webjars" % "bootstrap" % "3.3.4",
 "net.sf.jasperreports" % "jasperreports" % "3.7.6",
 "org.json" % "json" % "20131018"
)
routesGenerator := InjectedRoutesGenerator
