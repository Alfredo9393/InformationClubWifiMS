# InformationClubWifiMS
proyect onissolutions - microservices sprint boot use maven Dependency management

******Requirement****

java 1.8

spring boot 2.5.3

apache maven 3.8.1 

example endpoint type GET: 
http://localhost:8080/api/informationclubwifi/getInformation

example endpoint type POST: request xml and response xml 
http://localhost:8080/api/informationclubwifi/processReceive
    request
        <?xml version="1.0" encoding="UTF-8"?>
        <InformationClubWifiModel>
            <input>139</input>
        </InformationClubWifiModel>
    response
        <InfClubWifiResponseModel>
            <result>accout valid</result>
        </InfClubWifiResponseModel>

start docker imagen optional
docker run -it -p 8080:8080 informationclubwifi .



