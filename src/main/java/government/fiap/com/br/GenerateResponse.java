/**
 * GenerateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package government.fiap.com.br;

public class GenerateResponse  implements java.io.Serializable {
    private government.fiap.com.br.InvoiceResponse generate;

    public GenerateResponse() {
    }

    public GenerateResponse(
           government.fiap.com.br.InvoiceResponse generate) {
           this.generate = generate;
    }


    /**
     * Gets the generate value for this GenerateResponse.
     * 
     * @return generate
     */
    public government.fiap.com.br.InvoiceResponse getGenerate() {
        return generate;
    }


    /**
     * Sets the generate value for this GenerateResponse.
     * 
     * @param generate
     */
    public void setGenerate(government.fiap.com.br.InvoiceResponse generate) {
        this.generate = generate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GenerateResponse)) return false;
        GenerateResponse other = (GenerateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.generate==null && other.getGenerate()==null) || 
             (this.generate!=null &&
              this.generate.equals(other.getGenerate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGenerate() != null) {
            _hashCode += getGenerate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GenerateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://br.com.fiap.government/", "generateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://br.com.fiap.government/", "invoiceResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
