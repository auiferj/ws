/**
 * HelloWSDDService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.ws_axis.services.HelloWSDD;

public interface HelloWSDDService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWSDDAddress();

    public localhost.ws_axis.services.HelloWSDD.HelloWSDD getHelloWSDD() throws javax.xml.rpc.ServiceException;

    public localhost.ws_axis.services.HelloWSDD.HelloWSDD getHelloWSDD(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
