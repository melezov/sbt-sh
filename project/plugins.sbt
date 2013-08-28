// +-------------------------------------------------------------------------------------+
// | SBT Eclipse (https://github.com/typesafehub/sbteclipse)                             |
// | Creates .project and .classpath files for easy Eclipse project imports              |
// |                                                                                     |
// | See also: Eclipse downloads (http://www.eclipse.org/downloads/)                     |
// | See also: Scala IDE downloads (http://download.scala-ide.org/)                      |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.2.0")

// +-------------------------------------------------------------------------------------+
// | Sbt Cross Building Plugin (https://github.com/jrudolph/sbt-cross-building)          |
// | Enables building of plugins targeting older versions of SBT                         |
// +-------------------------------------------------------------------------------------+

addSbtPlugin("net.virtual-void" % "sbt-cross-building" % "0.8.0")
