#!bin/sh

# Prerequisites:
#	. Java
#	. Gradle
#	. Git
#	. Postman [optional]

# Compile with Gradle
cd springcloudserver
./gradlew build

# Run the application
java -jar build/libs/rs-springcloudserver-0.1.jar

# Test the application
# ... via Postman

# ... via CLI
#	$ curl http://<CLIENT_ID>:<CLIENT_SECRET>@<URL>:<PORT>/<APPLICATION>/<PROFILE>/[<LABEL>]
curl http://rabbitshop:pohstibbar@localhost:8888/cloudclient/development/master
curl http://rabbitshop:pohstibbar@localhost:8888/cloudclient/development
curl http://rabbitshop:pohstibbar@localhost:8888/cloudclient-development.properties

# Generate key store
keytool -genkeypair -alias rs-config-server-key -keyalg RSA -keysize 4096 -sigalg SHA512withRSA -dname "CN=rS-SpringCloudConfig,OU=RabbitHole Cloud,O=RabbitHole" -keypass rS-s42 -keystore rs-config-server.jks -storepass rS-s42-s70r3

# Generating encrypted passwords
# ... via Postman

# ... via CLI
#	$ curl -X POST --data-urlencode <PASSWORD> http://<CLIENT_ID>:<CLIENT_SECRET>@<URL>:<PORT>/encrypt]
curl -X POST --data-urlencode dev-password http://rabbitshop:pohstibbar@localhost:8888/encrypt
curl -X POST --data-urlencode prod-password http://rabbitshop:pohstibbar@localhost:8888/encrypt
curl -X POST --data-urlencode test-password http://rabbitshop:pohstibbar@localhost:8888/encrypt
