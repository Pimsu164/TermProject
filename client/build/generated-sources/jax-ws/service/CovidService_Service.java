
package service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CovidService", targetNamespace = "http://Service/", wsdlLocation = "http://localhost:8080/Server/CovidService?WSDL")
public class CovidService_Service
    extends Service
{

    private final static URL COVIDSERVICE_WSDL_LOCATION;
    private final static WebServiceException COVIDSERVICE_EXCEPTION;
    private final static QName COVIDSERVICE_QNAME = new QName("http://Service/", "CovidService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Server/CovidService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COVIDSERVICE_WSDL_LOCATION = url;
        COVIDSERVICE_EXCEPTION = e;
    }

    public CovidService_Service() {
        super(__getWsdlLocation(), COVIDSERVICE_QNAME);
    }

    public CovidService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COVIDSERVICE_QNAME, features);
    }

    public CovidService_Service(URL wsdlLocation) {
        super(wsdlLocation, COVIDSERVICE_QNAME);
    }

    public CovidService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COVIDSERVICE_QNAME, features);
    }

    public CovidService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CovidService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CovidService
     */
    @WebEndpoint(name = "CovidServicePort")
    public CovidService getCovidServicePort() {
        return super.getPort(new QName("http://Service/", "CovidServicePort"), CovidService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CovidService
     */
    @WebEndpoint(name = "CovidServicePort")
    public CovidService getCovidServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Service/", "CovidServicePort"), CovidService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COVIDSERVICE_EXCEPTION!= null) {
            throw COVIDSERVICE_EXCEPTION;
        }
        return COVIDSERVICE_WSDL_LOCATION;
    }

}
