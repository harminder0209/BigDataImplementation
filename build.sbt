name := "BigDataApplication"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.kafka" %% "kafka" % "0.8.2.1"

// set the main class for 'sbt run'
mainClass in (Compile, run) := Some("Kafka.kafkaProducerImplementation")

// set the main class for packaging the main jar
mainClass in (Compile, packageBin) := Some("Kafka.kafkaProducerImplementation")

mainClass in (Compile, packageBin) := Some("Kafka.kafkaProducerImplementation")



