/**
 * HelloWSDDServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ws_axis.services.HelloWSDD;

public class HelloWSDDServiceLocator extends org.apache.axis.client.Service implements localhost.ws_axis.services.HelloWSDD.HelloWSDDService {

    public HelloWSDDServiceLocator() {
    }


    public HelloWSDDServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWSDDServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWSDD
    private java.lang.String HelloWSDD_address = "http://localhost:8080/ws-axis/services/HelloWSDD";

    public java.lang.String getHelloWSDDAddress() {
        return HelloWSDD_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWSDDWSDDServiceName = "HelloWSDD";

    public java.lang.String getHelloWSDDWSDDServiceName() {
        return HelloWSDDWSDDServiceName;
    }

    public void setHelloWSDDWSDDServiceName(java.lang.String name) {
        HelloWSDDWSDDServiceName = name;
    }

    public localhost.ws_axis.services.HelloWSDD.HelloWSDD getHelloWSDD() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWSDD_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWSDD(endpoint);
    }

    public localhost.ws_axis.services.HelloWSDD.HelloWSDD getHelloWSDD(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.ws_axis.services.HelloWSDD.HelloWSDDSoapBindingStub _stub = new localhost.ws_axis.services.HelloWSDD.HelloWSDDSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWSDDWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWSDDEndpointAddress(java.lang.String address) {
        HelloWSDD_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.ws_axis.services.HelloWSDD.HelloWSDD.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.ws_axis.services.HelloWSDD.HelloWSDDSoapBindingStub _stub = new localhost.ws_axis.services.HelloWSDD.HelloWSDDSoapBindingStub(new java.net.URL(HelloWSDD_address), this);
                _stub.setPortName(getHelloWSDDWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWSDD".equals(inputPortName)) {
            return getHelloWSDD();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/ws-axis/services/HelloWSDD", "HelloWSDDService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/ws-axis/services/HelloWSDD", "HelloWSDD"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWSDD".equals(portName)) {
            setHelloWSDDEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
