addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.4")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.9")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "1.0.0")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt-coursier" % "1.15")

//libraryDependencies += "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.3-1"
libraryDependencies += "com.github.pathikrit" %% "better-files" % "2.17.1"

scalacOptions += "-feature"

// https://github.com/coursier/coursier/issues/450
classpathTypes += "maven-plugin"
