package ar.com.pabloExample.services;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.cxf.annotations.Logging;
import org.apache.cxf.feature.Features;
import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public interface HelloWorldService {
	
	public String sayHello(@WebParam(name="parameter") String name);
	
	public String helloWorld();
}
