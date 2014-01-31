package ar.com.pabloExample.services;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.Logging;
import org.apache.cxf.feature.Features;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
/*
 * Used for ApacheCXF default logging using j2se common logging
 * 
 * @Logging(pretty=true, 
	inLocation="file:/C:/wsimport/log.txt", 
	outLocation="file:/C:/wsimport/log.txt"
	)*/
public interface HelloWorldService {
	
	public String sayHello(@WebParam(name="parameter") String name);
	
	public String helloWorld();
}
