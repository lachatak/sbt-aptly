import sbt.Keys._
import sbt._

object Testing {

  lazy val defaultSettings = Seq(
    fork in Test := false,
    parallelExecution in Test := false
  )

}

