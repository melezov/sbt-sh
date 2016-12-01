#sbt-sh

[![Build Status](https://travis-ci.org/melezov/sbt-sh.svg?branch=master)](https://travis-ci.org/melezov/sbt-sh)
[![License](https://img.shields.io/badge/license-UNLICENSE-brightgreen.svg)](https://spdx.org/licenses/BSD-3-Clause.html)

### Tiny plugin which adds functionality to run shell actions from SBT

Published to Bintray against SBT 0.13.x

    addSbtPlugin("com.oradian.sbt" % "sbt-sh" % "0.1.0")

This is a command plugin, so there is no need to add it to your settings.   
You only need to add the plugin to your `project/plugin.sbt` file.

Usage:

    [info] Loading project definition from ~\my-project\project
    [info] Set current project to my-project (in build file:/~/my-project/)
    [my-project] $ sh java -version
    java version "1.8.0_112"
    Java(TM) SE Runtime Environment (build 1.8.0_112-b15)
    Java HotSpot(TM) 64-Bit Server VM (build 25.112-b15, mixed mode)
    [my-project] $ sh git branch -v
      develop 04b6eb8 Fix previous broken fix for foo widget
      master  797ccbe Merge in pull request #1337

Sample use case (cleaning Play's `RUNNING_PID` when running with SBT revolver):

    [info] Loading project definition from /play-example/project
    [info] Set current project to play-example (in build file:/~/play-example/)
    > ~; reStart; sh rm -v RUNNING_PID
    [info] Application root not yet started
    [info] Starting application root in the background ...
    root Starting play.core.server.ProdServerStart.main()
    [success] Total time: 0 s, completed Dec 1, 2016 12:00:00 AM
    root [info] play.api.Play - Application started (Prod)
    root [info] p.c.s.NettyServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000
    rm: cannot remove `RUNNING_PID': No such file or directory
    1. Waiting for source changes... (press enter to interrupt)
    [info] Application root not yet started
    [info] Starting application root in the background ...
    root Starting play.core.server.ProdServerStart.main()
    [success] Total time: 1 s, completed Dec 1, 2016 12:00:11 AM
    removed `RUNNING_PID'
    2. Waiting for source changes... (press enter to interrupt)
    root [info] play.api.Play - Application started (Prod)
    root [info] p.c.s.NettyServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000

This is free and unencumbered software released into the public domain.
