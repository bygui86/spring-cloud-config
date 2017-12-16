#!bin/sh

# Prerequisites:
#	. Java
#	. Gradle
#	. SpringCloudCofigServer
#	. Postman [optional]

# Compile with Gradle
cd springcloudclient
./gradlew build

# Run the application
java -jar build/libs/rs-springcloudclient-0.1.jar

# Test the application
# ... via Postman

# ... via CLI
curl http://rabbitshop:pohstibbar@localhost:8080/users/role
curl http://rabbitshop:pohstibbar@localhost:8080/users/password
