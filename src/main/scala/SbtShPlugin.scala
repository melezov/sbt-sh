package com.oradian.sbt

import sbt._

object SbtShPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def globalSettings = Seq(
    Keys.commands += shCommand
  )

  private[this] final val ShCommand = "sh"
  private[this] final val ShBrief = s"Usage: $ShCommand <arg1> <arg2> ..."
  private[this] final val ShInfo = "Runs shell commands within SBT"
  private[this] final val ShDetail = s"""
  $ShInfo

  $ShBrief

  Uses Java ProcessBuilder to instantiate processes;
  throws an exception on non-zero exit codes.

  Streams stdout & stderr into SBT REPL,
  stream redirection via < > arguments is currently not supported.

  Performs OS detection to differentiate between Windows and Unixoids;
  if under Windows (but not within Cygwin), it will prepend arguments with
  "cmd" "/c", allowing to run CMD commands ("dir", "copy", etc...)
"""

  lazy val shCommand =
    Command.args(ShCommand, (ShBrief, ShInfo), ShDetail, ShBrief) { (state, args) =>
      if (args.isEmpty) {
        state.log.error(ShBrief)
      } else {
        Resolvers.run(args: _*)
      }
      state
    }
}
