
/**
 * UpdateTransportationStatusFaultException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.autoinc.supplier.supplyservice;

public class UpdateTransportationStatusFaultException extends java.lang.Exception{

    private static final long serialVersionUID = 1434804852630L;
    
    private com.autoinc.supplier.supplyservice.SupplyExcption faultMessage;

    
        public UpdateTransportationStatusFaultException() {
            super("UpdateTransportationStatusFaultException");
        }

        public UpdateTransportationStatusFaultException(java.lang.String s) {
           super(s);
        }

        public UpdateTransportationStatusFaultException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UpdateTransportationStatusFaultException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.autoinc.supplier.supplyservice.SupplyExcption msg){
       faultMessage = msg;
    }
    
    public com.autoinc.supplier.supplyservice.SupplyExcption getFaultMessage(){
       return faultMessage;
    }
}
    