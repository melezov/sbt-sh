sbtPlugin := true

name := "xsbt-sh"

version := "0.0.2-SNAPSHOT"

publishTo := Some(
  if (version.value endsWith "SNAPSHOT")
    "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"
  else
    "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
)

credentials += Credentials(Path.userHome / ".config" / "xsbt-sh" / "nexus.config")

organization := "hr.element.xsbt"

// CrossBuilding.crossSbtVersions := Seq("0.11.3", "0.12", "0.13")

scalaVersion := "2.10.2"
