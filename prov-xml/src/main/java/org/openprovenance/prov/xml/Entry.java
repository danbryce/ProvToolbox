//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.05 at 11:27:10 AM GMT 
//


package org.openprovenance.prov.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAnyElement;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for KeyEntityPair complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyEntityPair">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/ns/prov#}TypedValue"/>
 *         &lt;element name="entity" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyEntityPair", propOrder = {
    "key",
    "entity"
})
public class Entry
    implements Equals, HashCode, ToString, org.openprovenance.prov.model.Entry
{
    @javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(KeyAdapter.class)
    @XmlAnyElement
    protected org.openprovenance.prov.xml.Key key;
    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.IDRef entity;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.TypedValue }
     *     
     */
    public org.openprovenance.prov.model.Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.TypedValue }
     *     
     */
    public void setKey(org.openprovenance.prov.model.Key value) {
        this.key = (org.openprovenance.prov.xml.Key) value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public org.openprovenance.prov.model.IDRef getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public void setEntity(org.openprovenance.prov.model.IDRef value) {
        this.entity = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof Entry)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final Entry that = ((Entry) object);
        equalsBuilder.append(this.getKey(), that.getKey());
        equalsBuilder.append(this.getEntity(), that.getEntity());
    }

    public boolean equals(Object object) {
        if (!(object instanceof Entry)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getKey());
        hashCodeBuilder.append(this.getEntity());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            org.openprovenance.prov.model.TypedValue theKey;
            theKey = this.getKey();
            toStringBuilder.append("key", theKey);
        }
        {
            org.openprovenance.prov.model.IDRef theEntity;
            theEntity = this.getEntity();
            toStringBuilder.append("entity", theEntity);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

}
