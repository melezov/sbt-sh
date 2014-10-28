xsbt-sh
=======

Tiny XSBT plugin which adds functionality to run shell actions.

Inspired by: https://github.com/steppenwells/sbt-sh

Published against SBT 0.13.x

    resolvers += "Element Releases" at "http://repo.element.hr/nexus/content/repositories/releases/"

    addSbtPlugin("hr.element.xsbt" % "xsbt-sh" % "0.1.0")

This is a command plugin, so there is no need to add it to your settings, 
you only need to add it to the project/plugin.sbt file.

Usage:

    [info] Loading project definition from ~\xsbt-sh\project
    [info] Set current project to xsbt-sh (in build file:/~/xsbt-sh/)
    > sh java -version
    java version "1.8.0_20"
    Java(TM) SE Runtime Environment (build 1.8.0_20-b26)
    Java HotSpot(TM) 64-Bit Server VM (build 25.20-b23, mixed mode)
    
Use case (deleting Play's RUNNING_PID when running with SBT Revolver):

    [info] Loading project definition from ~\play-example\project
    [info] Set current project to play-example (in build file:/~/play-example/)
    > ~; reStart; sh rm -v RUNNING_PID
    [info] Application root not yet started
    [info] Starting application root in the background ...
    root Starting play.core.server.NettyServer.main()
    [success] Total time: 2 s, completed Oct 28, 2014 11:00:26 AM
    rm: cannot remove `RUNNING_PID': No such file or directory
    1. Waiting for source changes... (press enter to interrupt)
    root Play server process ID is 7864
    [info] Compiling 1 Scala source to ~\play-example\scala\target\scala-2.11\classes...
    [info] Stopping application root (by killing the forked JVM) ...
    [info] Starting application root in the background ...
    root ... finished with exit code 1
    root Starting play.core.server.NettyServer.main()
    [success] Total time: 16 s, completed Oct 28, 2014 11:00:51 AM
    removed `RUNNING_PID'
    2. Waiting for source changes... (press enter to interrupt)
    root Play server process ID is 892
