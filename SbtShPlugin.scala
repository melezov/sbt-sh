package com.oradian.sbt

import sbt._
import Keys._

object SbtShPlugin extends Plugin {
  override lazy val settings = Seq(
    commands += shCommand
  )

  private[this] lazy val execPrefix =
    sys.props("file.separator") match {
      case "\\" => Seq("cmd", "/c")
      case _    => Nil
    }

  lazy val shCommand =
    Command.args("sh", "<shell command>") { (state, args) =>
      (execPrefix ++ args).!
      state
    }
}
