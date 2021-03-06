package org.openprovenance.prov.sql;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.openprovenance.prov.xml.builder.Equals;
import org.openprovenance.prov.xml.builder.HashCode;
import org.openprovenance.prov.xml.builder.ToString;
import org.openprovenance.prov.xml.builder.JAXBEqualsBuilder;
import org.openprovenance.prov.xml.builder.JAXBHashCodeBuilder;
import org.openprovenance.prov.xml.builder.JAXBToStringBuilder;
import org.openprovenance.prov.model.StatementOrBundle;

/**
 * <p>Java class for Membership complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Membership">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/ns/prov#}AStatement">
 *       &lt;sequence>
 *         &lt;element name="collection" type="{http://www.w3.org/ns/prov#}IDRef"/>
 *         &lt;element name="entity" type="{http://www.w3.org/ns/prov#}IDRef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Membership", propOrder = {
    "collection",
    "entity"
})
@Entity(name = "HadMember")
@Table(name = "HADMEMBER")
public class HadMember
    extends AStatement
    implements Equals, HashCode, ToString, org.openprovenance.prov.model.HadMember
{

    @XmlElement(required = true, type = org.openprovenance.prov.sql.IDRef.class)
    protected org.openprovenance.prov.model.QualifiedName collection;
    @XmlElement(required = true, type = org.openprovenance.prov.sql.IDRef.class)
    protected List<org.openprovenance.prov.model.QualifiedName> entity;

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link org.openprovenance.prov.sql.IDRef }
     *     
     */
    @ManyToOne(targetEntity = org.openprovenance.prov.sql.QualifiedName.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COLLECTION")
    public org.openprovenance.prov.model.QualifiedName getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.openprovenance.prov.sql.IDRef }
     *     
     */
    public void setCollection(org.openprovenance.prov.model.QualifiedName value) {
        this.collection = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.openprovenance.prov.sql.IDRef }
     * 
     * 
     */
    @ManyToMany(targetEntity = org.openprovenance.prov.sql.QualifiedName.class, cascade = {
        CascadeType.ALL
    })
    @JoinTable(name = "HADMEMBER_ELEMENTS", joinColumns = {
        @JoinColumn(name = "COLLECTION")
    }, inverseJoinColumns = {
        @JoinColumn(name = "ENTITY")
    })
    public List<org.openprovenance.prov.model.QualifiedName> getEntity() {
        if (entity == null) {
            entity = new ArrayList<org.openprovenance.prov.model.QualifiedName>();
        }
        return this.entity;
    }

    /**
     * 
     * 
     */
    public void setEntity(List<org.openprovenance.prov.model.QualifiedName> entity) {
        this.entity = entity;
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof HadMember)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final HadMember that = ((HadMember) object);
        equalsBuilder.append(this.getCollection(), that.getCollection());
        equalsBuilder.append(this.getEntity(), that.getEntity());
    }

    public boolean equals(Object object) {
        if (!(object instanceof HadMember)) {
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
        hashCodeBuilder.append(this.getCollection());
        hashCodeBuilder.append(this.getEntity());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            org.openprovenance.prov.model.QualifiedName theCollection;
            theCollection = this.getCollection();
            toStringBuilder.append("collection", theCollection);
        }
        {
            List<org.openprovenance.prov.model.QualifiedName> theEntity;
            theEntity = this.getEntity();
            toStringBuilder.append("entity", theEntity);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }
    
    
    @Transient
    public Kind getKind() {
	return StatementOrBundle.Kind.PROV_MEMBERSHIP;
    }


}
