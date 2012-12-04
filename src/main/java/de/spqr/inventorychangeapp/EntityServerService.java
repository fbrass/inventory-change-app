/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.spqr.inventorychangeapp;




import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
 
/**
 *
 * @author said
 */
@WebServiceClient(name = "EntityServerService", 
		targetNamespace="http://activitiderbysoapservice.spqr.de/", 
		wsdlLocation = "http://localhost:9876/ps?wsdl")
public class EntityServerService extends Service {
    
	 
    private final static URL ENTITYSERVERIMPLSERVICE_WSDL_LOCATION;
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9876/ps?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ENTITYSERVERIMPLSERVICE_WSDL_LOCATION = url;
    }
 

	public EntityServerService(URL wsdlDocumentLocation,
			QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
	}
	
	public EntityServerService() {
		super(ENTITYSERVERIMPLSERVICE_WSDL_LOCATION,
				new QName("http://activitiderbysoapservice.spqr.de/","PartServerService"));
	}


	@WebEndpoint(name="EntityServerPort")
	public EntityServer getEntityServerImplPort(){
		return (EntityServer) super.getPort(new QName("http://activitiderbysoapservice.spqr.de/","PartServerPort"),EntityServer.class);
	}
	
	@WebEndpoint(name="EntityServerPort")
	public EntityServer getEntityServerImplPort(WebServiceFeature...features){
		return (EntityServer) super.getPort(new QName("http://activitiderbysoapservice.spqr.de/","PartServerport"),EntityServer.class,features);
	}

}

