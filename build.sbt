sbtPlugin := true

organization := "hr.element.xsbt"

name := "xsbt-sh"

version := "0.1.0"

publishTo := Some("Element Releases" at "http://repo.element.hr/nexus/content/repositories/releases/")

credentials ++= {
  val creds = Path.userHome / ".config" / "xsbt-sh" / "nexus.config"
  if (creds.exists) Some(Credentials(creds)) else None
}.toSeq
