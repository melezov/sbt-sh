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

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.2")

// +-------------------------------------------------------------------------------------+
// | Sbt Cross Building Plugin (https://github.com/jrudolph/sbt-cross-building)          |
// | Enables building of plugins targeting older versions of SBT                         |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("net.virtual-void" % "sbt-cross-building" % "0.7.0-RC2")