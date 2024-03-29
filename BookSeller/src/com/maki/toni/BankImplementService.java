
package com.maki.toni;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BankImplementService", targetNamespace = "http://toni.wst.com/", wsdlLocation = "http://localhost:8090/WS/Bank?wsdl")
public class BankImplementService
    extends Service
{

    private final static URL BANKIMPLEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.maki.toni.BankImplementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.maki.toni.BankImplementService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8090/WS/Bank?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8090/WS/Bank?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BANKIMPLEMENTSERVICE_WSDL_LOCATION = url;
    }

    public BankImplementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankImplementService() {
        super(BANKIMPLEMENTSERVICE_WSDL_LOCATION, new QName("http://toni.wst.com/", "BankImplementService"));
    }

    /**
     * 
     * @return
     *     returns BankInterface
     */
    @WebEndpoint(name = "BankImplementPort")
    public BankInterface getBankImplementPort() {
        return super.getPort(new QName("http://toni.wst.com/", "BankImplementPort"), BankInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankInterface
     */
    @WebEndpoint(name = "BankImplementPort")
    public BankInterface getBankImplementPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://toni.wst.com/", "BankImplementPort"), BankInterface.class, features);
    }

}
