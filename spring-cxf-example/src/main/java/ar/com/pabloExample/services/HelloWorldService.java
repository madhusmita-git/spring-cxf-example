package ar.com.pabloExample.services;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.Logging;
import org.apache.cxf.feature.Features;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
@Logging(pretty=true, 
	inLocation="file:/C:/Users/madhusmitap/git/spring-cxf-example/spring-cxf-example/wslog/log.txt", 
	outLocation="file:/C:/Users/madhusmitap/git/spring-cxf-example/spring-cxf-example/wslog/log.txt"
)
public interface HelloWorldService {
	
	public String sayHello(@WebParam(name="parameter") String name);
	
	public String helloWorld();
}
