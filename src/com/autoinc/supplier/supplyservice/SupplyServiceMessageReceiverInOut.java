
/**
 * SupplyServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package com.autoinc.supplier.supplyservice;

        /**
        *  SupplyServiceMessageReceiverInOut message receiver
        */

        public class SupplyServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        SupplyServiceSkeleton skel = (SupplyServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("cancelTransportation".equals(methodName)){
                
                com.autoinc.supplier.supplyservice.CancelTransportationResponse cancelTransportationResponse1 = null;
	                        com.autoinc.supplier.supplyservice.CancelTransportation wrappedParam =
                                                             (com.autoinc.supplier.supplyservice.CancelTransportation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.supplier.supplyservice.CancelTransportation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               cancelTransportationResponse1 =
                                                   
                                                   
                                                         skel.cancelTransportation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), cancelTransportationResponse1, false, new javax.xml.namespace.QName("http://supplier.autoinc.com/SupplyService/",
                                                    "cancelTransportation"));
                                    } else 

            if("confirmTransportation".equals(methodName)){
                
                com.autoinc.supplier.supplyservice.ConfirmTransportationResponse confirmTransportationResponse3 = null;
	                        com.autoinc.supplier.supplyservice.ConfirmTransportation wrappedParam =
                                                             (com.autoinc.supplier.supplyservice.ConfirmTransportation)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.supplier.supplyservice.ConfirmTransportation.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               confirmTransportationResponse3 =
                                                   
                                                   
                                                         skel.confirmTransportation(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), confirmTransportationResponse3, false, new javax.xml.namespace.QName("http://supplier.autoinc.com/SupplyService/",
                                                    "confirmTransportation"));
                                    } else 

            if("updateTransportationStatus".equals(methodName)){
                
                com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse updateTransportationStatusResponse5 = null;
	                        com.autoinc.supplier.supplyservice.UpdateTransportationStatus wrappedParam =
                                                             (com.autoinc.supplier.supplyservice.UpdateTransportationStatus)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    com.autoinc.supplier.supplyservice.UpdateTransportationStatus.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateTransportationStatusResponse5 =
                                                   
                                                   
                                                         skel.updateTransportationStatus(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateTransportationStatusResponse5, false, new javax.xml.namespace.QName("http://supplier.autoinc.com/SupplyService/",
                                                    "updateTransportationStatus"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ConfirmTransportationFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"SupplyExcption");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (CancelTransportationFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"SupplyExcption");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
         catch (UpdateTransportationStatusFaultException e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"SupplyExcption");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.CancelTransportation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.CancelTransportation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.CancelTransportationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.CancelTransportationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.SupplyExcption param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.SupplyExcption.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.ConfirmTransportation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.ConfirmTransportation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.ConfirmTransportationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.ConfirmTransportationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.UpdateTransportationStatus param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.UpdateTransportationStatus.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.supplier.supplyservice.CancelTransportationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.supplier.supplyservice.CancelTransportationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.supplier.supplyservice.CancelTransportationResponse wrapcancelTransportation(){
                                com.autoinc.supplier.supplyservice.CancelTransportationResponse wrappedElement = new com.autoinc.supplier.supplyservice.CancelTransportationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.supplier.supplyservice.ConfirmTransportationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.supplier.supplyservice.ConfirmTransportationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.supplier.supplyservice.ConfirmTransportationResponse wrapconfirmTransportation(){
                                com.autoinc.supplier.supplyservice.ConfirmTransportationResponse wrappedElement = new com.autoinc.supplier.supplyservice.ConfirmTransportationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse wrapupdateTransportationStatus(){
                                com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse wrappedElement = new com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (com.autoinc.supplier.supplyservice.CancelTransportation.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.CancelTransportation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.CancelTransportationResponse.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.CancelTransportationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.SupplyExcption.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.SupplyExcption.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.ConfirmTransportation.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.ConfirmTransportation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.ConfirmTransportationResponse.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.ConfirmTransportationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.SupplyExcption.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.SupplyExcption.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.UpdateTransportationStatus.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.UpdateTransportationStatus.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.UpdateTransportationStatusResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (com.autoinc.supplier.supplyservice.SupplyExcption.class.equals(type)){
                
                           return com.autoinc.supplier.supplyservice.SupplyExcption.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    