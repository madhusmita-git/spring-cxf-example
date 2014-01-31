package ar.com.pabloExample.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.log4j.Logger;

@WebService(endpointInterface = "ar.com.pabloExample.services.HelloWorldService")
public class HelloWorldServiceBean implements HelloWorldService{
	private static final Logger log = Logger.getLogger(HelloWorldServiceBean.class);
	
	@Override
	public String sayHello(String name) {
		log.info("sayHello(String name)");
		return name.toUpperCase() + " - Hello!!!";
	}

	@WebMethod
	@Override
	public String helloWorld() {
		log.info("helloWorld()");
		return "Hello World" + System.getProperty("org.apache.cxf.Logger") + " -> " + System.getProperty("java.version");
	}
}
