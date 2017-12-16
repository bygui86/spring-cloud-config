package com.rabbitshop.springcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * We need to configure the server port on which our server is listening and a Git-url which provides our version-controlled
 * configuration content. The latter can be used with protocols like http, ssh or a simple file on a local filesystem.
 * We also need to set a username and a password for the Basic-Authentication in our application.properties to avoid an auto-generated
 * password on every application restart.
 *
 * *** Tip: If you are planning to use multiple config server instances pointing to the same config repository, you can configure
 *     the server to clone your repo into a local temporary folder. But be aware of private repositories with two-factor authentication,
 *     they are difficult to handle! In such a case, it is easier to clone them on your local filesystem and work with the copy.
 *
 * There are also some placeholder variables and search patterns for configuring the repository-url available; but this is beyond
 * the scope of our example. The official documentation is a good place to start.
 *
 * Now we’re able to start our server. The Git-backed configuration API provided by our server can be queried using the following paths:
 *		/{application}/{profile}[/{label}]
 *		[/{label}]/{application}-{profile}.{format}
 * In which:
 *		the {label} refers to a Git branch
 *		the {application} refers to the client’s application name
 *		the {profile} refers to the client’s current active application profile
 *		the {format} refers to the format in which the configuration will be delivered [yml | properties]
 *
 *
 * TODO check for possibly problems during:
 *	. refresh of properties-repo
 *	. refresh of code (build and reload)
 *
 *
 * TODO better understand HOW the encrypted properties are delivered from server to client
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudServerApplication {

	public static void main(final String[] args) {

		SpringApplication.run(SpringCloudServerApplication.class, args);
	}
}
