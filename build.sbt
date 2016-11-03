name := "akka-demo"

version := "0.1"

scalaVersion := "2.10.5"

scalacOptions += "-deprecation"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature")


resolvers ++= Seq(
	"Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",

	"Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases",

	"softprops-maven" at "http://dl.bintray.com/content/softprops/maven",

	"tkmt" at "https://github.com/TkmTwoProjects/tkmtwo-mvn-repo/raw/master/release",

	"hortonworks" at "http://repo.hortonworks.com/content/repositories/releases/"
)

libraryDependencies ++= Seq(


	"com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",

	"org.apache.logging.log4j" % "log4j-api" % "2.6",

	"org.apache.logging.log4j" % "log4j-core" % "2.6",

	"org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.6",

	"com.typesafe.akka" %% "akka-actor" % "2.3.15",

	"com.typesafe.akka" %% "akka-remote" % "2.3.15"
)

test in assembly := {}

//unmanagedJars in Compile += file("lib/sqljdbc42.jar")

//mainClass in assembly := Some("com.accenture.socialengineer.importing.SocialEngineerMain")

packAutoSettings ++ Seq(
	packGenerateWindowsBatFile := false,
	packResourceDir += (baseDirectory.value / "bin" -> "bin"),
	packResourceDir += (baseDirectory.value / "lib" -> "lib")
)




