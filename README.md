# spring-cloud-configserver-Git

Basic example of using spring-cloud-config to retrieve configs from a git-backed server


## Quick Start

Build code
git clone https://github.com/krishna8485/SpringCloudConfigServerGitRef.git
cd SpringCloudConfigServerGitRef

### Start Config Server

cd employee-config-server
gradle clean bootrun
Load http://localhost:8888. This displays the config properties which are being retrieved from the git repo defined in application.properties. This currently is the config directory in this repository.

### Start Eureka Server

cd EurekaServer
gradle clean bootrun
Load http://localhost:8090 to register the services.

### Start Employee-producer

gradle clean bootrun
Load http://localhost:8081/employee displays the employee response. Reads the eureka register url from properties in config server and register to eureka during startup.

Reload configuration from server (at runtime)
Spring Cloud Config has a @RefreshScope mechanism to allow beans to be reinitialized on demand to fetch updated configuration values. The AppController on the client has this annotation, so it will display the new config value once the refresh endpoint is called.

curl -X POST 'http://localhost:8081/employee'
