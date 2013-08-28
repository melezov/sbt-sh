resolvers ++= Seq(
  "Element Nexus" at "http://repo.element.hr/nexus/content/groups/public/"
, Resolver.url("Element Nexus (Ivy)",
    url("http://repo.element.hr/nexus/content/groups/public/"))(Resolver.ivyStylePatterns)
)

// =======================================================================================

// +-------------------------------------------------------------------------------------+
// | SBT Eclipse (https://github.com/typesafehub/sbteclipse)                             |
// | Creates .project and .classpath files for easy Eclipse project imports              |
// |                                                                                     |
// | See also: Eclipse downloads (http://www.eclipse.org/downloads/)                     |
// | See also: Scala IDE downloads (http://download.scala-ide.org/)                      |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.3.0")

// +-------------------------------------------------------------------------------------+
// | Sbt Cross Building Plugin (https://github.com/jrudolph/sbt-cross-building)          |
// | Enables building of plugins targeting older versions of SBT                         |
// +-------------------------------------------------------------------------------------+

// Waiting for 0.13.x!
// addSbtPlugin("net.virtual-void" % "sbt-cross-building" % "0.8.0")

// +-------------------------------------------------------------------------------------+
// | Tiny XSBT shell plugin (https://github.com/melezov/xsbt-sh)                         |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("hr.element.xsbt" % "xsbt-sh" % "0.0.1")
