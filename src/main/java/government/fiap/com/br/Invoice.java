/**
 * Invoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package government.fiap.com.br;

public class Invoice  implements java.io.Serializable {
    private java.lang.String detail;

    private boolean issued;

    private government.fiap.com.br.Document recipient;

    private government.fiap.com.br.Document source;

    private government.fiap.com.br.Tax[] taxes;

    private java.lang.Double value;

    private java.lang.Double valueWithTax;

    public Invoice() {
    }

    public Invoice(
           java.lang.String detail,
           boolean issued,
           government.fiap.com.br.Document recipient,
           government.fiap.com.br.Document source,
           government.fiap.com.br.Tax[] taxes,
           java.lang.Double value,
           java.lang.Double valueWithTax) {
           this.detail = detail;
           this.issued = issued;
           this.recipient = recipient;
           this.source = source;
           this.taxes = taxes;
           this.value = value;
           this.valueWithTax = valueWithTax;
    }


    /**
     * Gets the detail value for this Invoice.
     * 
     * @return detail
     */
    public java.lang.String getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Invoice.
     * 
     * @param detail
     */
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }


    /**
     * Gets the issued value for this Invoice.
     * 
     * @return issued
     */
    public boolean isIssued() {
        return issued;
    }


    /**
     * Sets the issued value for this Invoice.
     * 
     * @param issued
     */
    public void setIssued(boolean issued) {
        this.issued = issued;
    }


    /**
     * Gets the recipient value for this Invoice.
     * 
     * @return recipient
     */
    public government.fiap.com.br.Document getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this Invoice.
     * 
     * @param recipient
     */
    public void setRecipient(government.fiap.com.br.Document recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the source value for this Invoice.
     * 
     * @return source
     */
    public government.fiap.com.br.Document getSource() {
        return source;
    }


    /**
     * Sets the source value for this Invoice.
     * 
     * @param source
     */
    public void setSource(government.fiap.com.br.Document source) {
        this.source = source;
    }


    /**
     * Gets the taxes value for this Invoice.
     * 
     * @return taxes
     */
    public government.fiap.com.br.Tax[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this Invoice.
     * 
     * @param taxes
     */
    public void setTaxes(government.fiap.com.br.Tax[] taxes) {
        this.taxes = taxes;
    }

    public government.fiap.com.br.Tax getTaxes(int i) {
        return this.taxes[i];
    }

    public void setTaxes(int i, government.fiap.com.br.Tax _value) {
        this.taxes[i] = _value;
    }


    /**
     * Gets the value value for this Invoice.
     * 
     * @return value
     */
    public java.lang.Double getValue() {
        return value;
    }


    /**
     * Sets the value value for this Invoice.
     * 
     * @param value
     */
    public void setValue(java.lang.Double value) {
        this.value = value;
    }


    /**
     * Gets the valueWithTax value for this Invoice.
     * 
     * @return valueWithTax
     */
    public java.lang.Double getValueWithTax() {
        return valueWithTax;
    }


    /**
     * Sets the valueWithTax value for this Invoice.
     * 
     * @param valueWithTax
     */
    public void setValueWithTax(java.lang.Double valueWithTax) {
        this.valueWithTax = valueWithTax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Invoice)) return false;
        Invoice other = (Invoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            this.issued == other.isIssued() &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.valueWithTax==null && other.getValueWithTax()==null) || 
             (this.valueWithTax!=null &&
              this.valueWithTax.equals(other.getValueWithTax())));
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
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        _hashCode += (isIssued() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getValueWithTax() != null) {
            _hashCode += getValueWithTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Invoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://br.com.fiap.government/", "invoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issued");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issued"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://br.com.fiap.government/", "document"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://br.com.fiap.government/", "document"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://br.com.fiap.government/", "tax"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueWithTax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valueWithTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
