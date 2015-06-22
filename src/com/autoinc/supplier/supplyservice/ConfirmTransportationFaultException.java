
/**
 * ConfirmTransportationFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.supplier.supplyservice;

public class ConfirmTransportationFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434804852594L;
    
    private com.autoinc.supplier.supplyservice.SupplyExcption faultMessage;

    
        public ConfirmTransportationFaultException() {
            super("ConfirmTransportationFaultException");
        }

        public ConfirmTransportationFaultException(java.lang.String s) {
           super(s);
        }

        public ConfirmTransportationFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ConfirmTransportationFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.supplier.supplyservice.SupplyExcption msg){
       faultMessage = msg;
    }
    
    public com.autoinc.supplier.supplyservice.SupplyExcption getFaultMessage(){
       return faultMessage;
    }
}
    