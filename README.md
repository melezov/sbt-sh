xsbt-sh
=======

Tiny XSBT plugin which adds functionality to run shell actions.

Inspired by: https://github.com/steppenwells/sbt-sh

Published against SBT 0.11.3, 0.12.x & 0.13.x

    resolvers += "Element Releases" at "http://repo.element.hr/nexus/content/repositories/releases/"

    addSbtPlugin("hr.element.xsbt" % "xsbt-sh" % "0.0.1")

This is a command plugin, so there is no need to add it to your settings, 
you only need to add it to the project/plugin.sbt file.

Usage:

    [info] Loading project definition from R:\code\xsbt-sh\project
    [info] Set current project to xsbt-sh (in build file:/R:/code/xsbt-sh/)
    > sh java -version
    java version "1.7.0_25"
    Java(TM) SE Runtime Environment (build 1.7.0_25-b17)
    Java HotSpot(TM) 64-Bit Server VM (build 23.25-b01, mixed mode)
    >
