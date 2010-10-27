import sbt._
import com.twitter.sbt._

class NaggatiProject(info: ProjectInfo) extends StandardProject(info) with DefaultRepos {
  val netty = "org.jboss.netty" % "netty" % "3.2.2"

  // scala actors library with fork-join replaced by java 5 util.concurrent:
  // FIXME: we should investigate akka actors.
  val twitter_actors = "com.twitter" %% "twitteractors" % "2.0.0"

  // for tests:
  val specs = "org.scala-tools.testing" %% "specs" % "1.6.5" % "test"
  val jmock = "org.jmock" % "jmock" % "2.4.0" % "test"
  val hamcrest_all = "org.hamcrest" % "hamcrest-all" % "1.1" % "test"
  val cglib = "cglib" % "cglib" % "2.1_3" % "test"
  val asm = "asm" % "asm" % "1.5.3" % "test"
  val objenesis = "org.objenesis" % "objenesis" % "1.1" % "test"

  override def disableCrossPaths = false
}
