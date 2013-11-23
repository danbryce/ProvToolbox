package org.openprovenance.prov.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;
import org.openprovenance.prov.model.Attribute;
import org.w3c.dom.Element;


/**
 * <p>Java class for Removal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Removal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newDictionary" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *         &lt;element name="oldDictionary" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}label" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.w3.org/ns/prov#}type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/ns/prov#}id"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Removal", propOrder = {
    "newDictionary",
    "oldDictionary",
    //"key",
    "label",
    //"type",
    //"any"
    "all"
})
public class DerivedByRemovalFrom implements Equals, HashCode, ToString, org.openprovenance.prov.model.DerivedByRemovalFrom, HasAllAttributes
{

    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.IDRef newDictionary;
    @XmlElement(required = true, type = org.openprovenance.prov.xml.IDRef.class)
    protected org.openprovenance.prov.model.IDRef oldDictionary;
    //@XmlElement(required = true)
    //@XmlSchemaType(name = "anySimpleType")
    transient protected List<org.openprovenance.prov.model.Key> key;
    @XmlElement(type = org.openprovenance.prov.xml.InternationalizedString.class)
    protected List<org.openprovenance.prov.model.InternationalizedString> label;
    
    
    
    transient protected List<org.openprovenance.prov.model.Type> type;
    transient protected List<org.openprovenance.prov.model.Other> others;
 
    @XmlAnyElement
    protected List<Attribute> all;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/ns/prov#")
    protected QName id;

    /**
     * Gets the value of the newDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public org.openprovenance.prov.model.IDRef getNewDictionary() {
        return newDictionary;
    }

    /**
     * Sets the value of the newDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public void setNewDictionary(org.openprovenance.prov.model.IDRef value) {
        this.newDictionary = value;
    }

    /**
     * Gets the value of the oldDictionary property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public org.openprovenance.prov.model.IDRef getOldDictionary() {
        return oldDictionary;
    }

    /**
     * Sets the value of the oldDictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.xml.IDRef }
     *     
     */
    public void setOldDictionary(org.openprovenance.prov.model.IDRef value) {
        this.oldDictionary = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    
    /*
    public List<Object> getKey() {
        if (key == null) {
            key = new ArrayList<Object>();
        }
        return this.key;
    }
    */
    
    public List<org.openprovenance.prov.model.Key> getKey() {
        if (key == null) {
            key=AttributeList.populateKnownAttributes(this,all, org.openprovenance.prov.model.Key.class);
        } 
        return this.key;
    }
    

    /**
     * Gets the value of the label property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the label property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternationalizedString }
     * 
     * 
     */
    public List<org.openprovenance.prov.model.InternationalizedString> getLabel() {
        if (label == null) {
            label = new ArrayList<org.openprovenance.prov.model.InternationalizedString>();
        }
        return this.label;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Type }
     * 
     * 
     */

    public List<org.openprovenance.prov.model.Type> getType() {
        if (type == null) {
            type=AttributeList.populateKnownAttributes(this,all, org.openprovenance.prov.model.Type.class);
        } 
        return this.type;
    }
    

    public List<org.openprovenance.prov.model.Other> getOther() {
	if (others == null) {
	    others=AttributeList.populateKnownAttributes(this,all, org.openprovenance.prov.model.Other.class);
	} 
	return this.others;
    }
     
    
    /** Gets the List of all attributes
     * @see org.openprovenance.prov.xml.HasAllAttributes#getAll()
     */
    @Override
    public List<Attribute> getAllAttributes() {
        if (all == null) {
            all = new SortedAttributeList<Attribute>();
        }
        return this.all;
    }
    

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setId(QName value) {
        this.id = value;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof DerivedByRemovalFrom)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final DerivedByRemovalFrom that = ((DerivedByRemovalFrom) object);
        equalsBuilder.append(this.getNewDictionary(), that.getNewDictionary());
        equalsBuilder.append(this.getOldDictionary(), that.getOldDictionary());
        equalsBuilder.append(this.getKey(), that.getKey());
        equalsBuilder.append(this.getLabel(), that.getLabel());
        equalsBuilder.append(this.getType(), that.getType());
        equalsBuilder.append(this.getOther(), that.getOther());
        equalsBuilder.append(this.getId(), that.getId());
    }

    public boolean equals(Object object) {
        if (!(object instanceof DerivedByRemovalFrom)) {
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
        hashCodeBuilder.append(this.getNewDictionary());
        hashCodeBuilder.append(this.getOldDictionary());
        hashCodeBuilder.append(this.getKey());
        hashCodeBuilder.append(this.getLabel());
        hashCodeBuilder.append(this.getType());
        hashCodeBuilder.append(this.getOther());
        hashCodeBuilder.append(this.getId());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            org.openprovenance.prov.model.IDRef theNewDictionary;
            theNewDictionary = this.getNewDictionary();
            toStringBuilder.append("newDictionary", theNewDictionary);
        }
        {
            org.openprovenance.prov.model.IDRef theOldDictionary;
            theOldDictionary = this.getOldDictionary();
            toStringBuilder.append("oldDictionary", theOldDictionary);
        }
        {
            List<org.openprovenance.prov.model.Key> theKey;
            theKey = this.getKey();
            toStringBuilder.append("key", theKey);
        }
        {
            List<org.openprovenance.prov.model.InternationalizedString> theLabel;
            theLabel = this.getLabel();
            toStringBuilder.append("label", theLabel);
        }
        {
            List<org.openprovenance.prov.model.Type> theType;
            theType = this.getType();
            toStringBuilder.append("type", theType);
        }
        {
            List<org.openprovenance.prov.model.Other> theOthers;
            theOthers = this.getOther();
            toStringBuilder.append("others", theOthers);
        }
        {
            QName theId;
            theId = this.getId();
            toStringBuilder.append("id", theId);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }
    
    public Kind getKind() {
   	return org.openprovenance.prov.model.StatementOrBundle.Kind.PROV_DICTIONARY_REMOVAL;
    }


}
