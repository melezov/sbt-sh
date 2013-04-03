sbtPlugin := true

name := "xsbt-sh"

version := "0.0.1"

organization := "hr.element.xsbt"

publishTo := Some("Element Releases" at "http://repo.element.hr/nexus/content/repositories/releases/")

credentials += Credentials(Path.userHome / ".config" / "xsbt-sh" / "nexus.config")

CrossBuilding.crossSbtVersions := Seq("0.11.2", "0.11.3", "0.12")
