
/**
 * CancelTransportationFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.supplier.supplyservice;

public class CancelTransportationFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434804852612L;
    
    private com.autoinc.supplier.supplyservice.SupplyExcption faultMessage;

    
        public CancelTransportationFaultException() {
            super("CancelTransportationFaultException");
        }

        public CancelTransportationFaultException(java.lang.String s) {
           super(s);
        }

        public CancelTransportationFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public CancelTransportationFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.supplier.supplyservice.SupplyExcption msg){
       faultMessage = msg;
    }
    
    public com.autoinc.supplier.supplyservice.SupplyExcption getFaultMessage(){
       return faultMessage;
    }
}
    