#!bin/sh

# Prerequisites:
#	. Java
#	. Gradle


### Compile with Gradle

# All projects (root and subs)
./gradlew build

# Specific subproject 
#	$ ./gradlew :<PROJECT_NAME>:<COMMAND>
./gradlew :springcloudserver:build
./gradlew :springcloudclient:build
