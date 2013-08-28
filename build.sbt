sbtPlugin := true

organization := "hr.element.xsbt"

name := "xsbt-sh"

version := "0.0.2"

publishTo <<= version { version => Some(
  if (version endsWith "SNAPSHOT")
    "Element Snapshots" at "http://repo.element.hr/nexus/content/repositories/snapshots/"
  else
    "Element Releases"  at "http://repo.element.hr/nexus/content/repositories/releases/"
)}

credentials += Credentials(Path.userHome / ".config" / "xsbt-sh" / "nexus.config")

crossBuildingSettings

CrossBuilding.crossSbtVersions := Seq("0.11.3", "0.12", "0.13")
