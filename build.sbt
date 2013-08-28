sbtPlugin := true

organization := "hr.element.xsbt"

name := "xsbt-sh"

version := "0.0.2"

publishTo := Some(
  if (version.value endsWith "SNAPSHOT")
    "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"
  else
    "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
)

credentials += Credentials(Path.userHome / ".config" / "xsbt-sh" / "nexus.config")

scalaVersion := "2.10.2"

// crossBuildingSettings

// CrossBuilding.crossSbtVersions := Seq("0.11.3", "0.12", "0.13")
