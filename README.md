# spring-cloud-configServer
Spring Cloud Config Server and client

## config-properties
This folder has the list of properties which will be hosted to any sever and the same will be referenced by config-server application
    
## spring-config-server
This folder has the config-server source code. This relies on the config-properties folder locally or could reference from git repo
    
## sprint-config-client
This folder has a sample client application which makes use of config-server to retrieve the properties and will be used within this application

## Scenarios for which this config-properties could be tested
1. Setting the Active profile as config-client
        
        Access: http://localhost:8080/msg
   Provides default configuration available from /config-client-{region}.properties     
   
2. Setting the Active profile as config-client2
        
        Access: http://localhost:8080/config
    Provides configuration available from /config-client2/config-client2-{region}.yml
    
3. Setting the Active profile as common, config-client2

        Access: http://localhost:8080/config
   Provides configuration available from common/common-{region}.yml & config-client2/config-client2-{region}.yml
   
4. Setting Spring.profiles.include property

        Access: http://localhost:8080/config
   Overrides configuration from common/common-{region}.yml with config-client2/config-client2-{region}.yml if they are with same keys