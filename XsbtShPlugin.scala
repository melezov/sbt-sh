package hr.element.xsbt

import sbt._
import Keys._

object XsbtShPlugin extends Plugin {
  override lazy val settings = Seq(
    commands ++= Seq(
      shCommand
    )
  )

  sealed abstract class OS(val execPrefix: String*)
  case object Windows extends OS("cmd", "/c")
  case object Linux extends OS()

  lazy val OS =
    sys.props.get("os.name") match {
      case Some(x) if x.toLowerCase contains "windows" =>
        Windows

      case _ =>
        Linux
    }

  lazy val shCommand =
    Command.args("sh", "<shell command>") { (state, args) =>
      OS.execPrefix ++ args !;
      state
    }
}
