
package services;

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
 * JAX-WS RI 2.2.6-2b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioSes", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/ServicioAlquileres/ServicioSes?wsdl")
public class ServicioSes_Service
    extends Service
{

    private final static URL SERVICIOSES_WSDL_LOCATION;
    private final static WebServiceException SERVICIOSES_EXCEPTION;
    private final static QName SERVICIOSES_QNAME = new QName("http://services/", "ServicioSes");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ServicioAlquileres/ServicioSes?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOSES_WSDL_LOCATION = url;
        SERVICIOSES_EXCEPTION = e;
    }

    public ServicioSes_Service() {
        super(__getWsdlLocation(), SERVICIOSES_QNAME);
    }

    public ServicioSes_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOSES_QNAME, features);
    }

    public ServicioSes_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOSES_QNAME);
    }

    public ServicioSes_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOSES_QNAME, features);
    }

    public ServicioSes_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioSes_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioSes
     */
    @WebEndpoint(name = "ServicioSesPort")
    public ServicioSes getServicioSesPort() {
        return super.getPort(new QName("http://services/", "ServicioSesPort"), ServicioSes.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioSes
     */
    @WebEndpoint(name = "ServicioSesPort")
    public ServicioSes getServicioSesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "ServicioSesPort"), ServicioSes.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOSES_EXCEPTION!= null) {
            throw SERVICIOSES_EXCEPTION;
        }
        return SERVICIOSES_WSDL_LOCATION;
    }

}
