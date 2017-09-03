package com.oradian.sbt

import sbt._

object SbtShPlugin extends Plugin {
  override lazy val settings = Seq(
    Keys.commands += shCommand
  )

  lazy val shCommand =
    Command.args("sh", "<shell command>") { (state, args) =>
      Resolvers.run(args: _*)
      state
    }
}
