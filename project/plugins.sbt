// The Lagom plugin
addSbtPlugin("com.lightbend.lagom" % "lagom-sbt-plugin" % "1.5.0-RC2")

// Akka GRPC
addSbtPlugin("com.lightbend.akka.grpc" %% "sbt-akka-grpc" % "0.5.0+14-c97a24a0")
resolvers += Resolver.bintrayRepo("akka", "maven") // for the snapshot ^


// Needed for importing the project into Eclipse
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
