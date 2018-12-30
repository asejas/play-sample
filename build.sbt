name := """play-sample"""
organization := "org.alvaro"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.7"

libraryDependencies += guice

//Checkstyle configs
checkstyleConfigLocation := CheckstyleConfigLocation.File("checkstyle/sun_checks.xml")
(checkstyle in Compile) := (checkstyle in Compile).triggeredBy(compile in Compile).value
checkstyleSeverityLevel := Some(CheckstyleSeverityLevel.Error)
checkstyleXsltTransformations := {
  Some(Set(CheckstyleXSLTSettings(baseDirectory(_ / "checkstyle/checkstyle-noframes-severity-sorted.xsl").value, target(_ / "checkstyle-report.html").value)))
}
