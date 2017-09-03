sbtPlugin := true

organization := "com.oradian.sbt"
name := "sbt-sh"
version := "0.2.1"

crossSbtVersions := Seq("1.0.1", "0.13.16")

scriptedSettings
scriptedBufferLog := false
scriptedLaunchOpts += "-Dproject.version=" + version.value

licenses += (("Unlicense", url("http://unlicense.org/")))
bintrayPackageLabels := Seq("sbt", "plugin")

scalacOptions in (Compile, doc) ++= Seq(
  "-no-link-warnings"
, "-sourcepath", baseDirectory.value.toString
, "-doc-source-url", s"""https://github.com/melezov/sbt-sh/blob/${version.value}\u20AC{FILE_PATH}.scala"""
)
