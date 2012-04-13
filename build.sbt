name := "ScalaScalatraMongoDB"

version := "1.0"

scalaVersion := "2.9.1"

seq(com.github.siasia.WebPlugin.webSettings :_*)

libraryDependencies ++= Seq(
  /* libraryDependencies += groupID % artifactID % revision */
  "com.mongodb.casbah" %% "casbah" % "2.1.5-1",
  "com.codahale" %% "jerkson" % "0.5.0",
  "com.github.mpeltonen" % "sbt-idea-plugin" % "0.3.0",
  "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.scalatra" %% "scalatra" % "2.0.2",
  "org.scalatra" %% "scalatra-scalate" % "2.0.2",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "container",
  //"org.mortbay.jetty" % "jetty" % "7.0.0.pre5" % "jetty",
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


