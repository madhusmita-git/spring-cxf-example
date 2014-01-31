package ar.com.pabloExample.services;

import java.util.Properties;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "ar.com.pabloExample.services.HelloWorldService")
public class HelloWorldServiceBean implements HelloWorldService{

	@Override
	public String sayHello(String name) {
		System.out.println("Name: " + name);
		return name.toUpperCase() + " - Hello!!!";
	}

	@WebMethod
	@Override
	public String helloWorld() {
		
        Properties properties = System.getProperties();
        Set<Object>  sysPropertiesKeys = properties.keySet();
        for (Object key : sysPropertiesKeys) {
            System.out.println(key + " =" + properties.getProperty((String)key));
        }		
		
		return "Hello World" + System.getProperty("org.apache.cxf.Logger") + " -> " + System.getProperty("java.version");
	}
}
