name := "ScalaScalatraMongoDB"

version := "1.0"

scalaVersion := "2.9.0-1"

seq(WebPlugin.webSettings :_*)

libraryDependencies ++= Seq(
  "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
  "com.codahale" %% "jerkson" % "0.3.2",
  "com.github.mpeltonen" % "sbt-idea-plugin" % "0.3.0",
  "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.scalatra" %% "scalatra" % "2.0.0-SNAPSHOT",
  "org.scalatra" %% "scalatra-scalate" % "2.0.0-SNAPSHOT",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty",
  "org.slf4j" % "slf4j-api" % "1.6.1"
)

resolvers ++= Seq(
  "Sonatype OSS" at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Download Java.NET" at "http://download.java.net/maven/2/",
  "Web plugin repo" at "http://siasia.github.com/maven2",
  "repo.novus rels" at "http://repo.novus.com/releases/",
  "repo.novus snaps" at "http://repo.novus.com/snapshots/",
  "Coda Hale's Repository" at "http://repo.codahale.com/",
  "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
)


