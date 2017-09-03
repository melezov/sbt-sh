package com.oradian.sbt

import sbt._

object SbtShPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def globalSettings = Seq(
    Keys.commands += shCommand
  )

  lazy val shCommand =
    Command.args("sh", "<shell command>") { (state, args) =>
      Resolvers.run(args: _*)
      state
    }
}
