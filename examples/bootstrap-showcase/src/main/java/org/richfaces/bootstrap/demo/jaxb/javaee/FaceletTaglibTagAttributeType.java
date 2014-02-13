//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.30 at 08:41:00 AM PDT 
//


package org.richfaces.bootstrap.demo.jaxb.javaee;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 
 *         The attribute element defines an attribute for the nesting
 *         tag.  The attribute element may have several subelements
 *         defining:
 * 
 *         description     a description of the attribute
 * 
 *         name            the name of the attribute
 * 
 *         required        whether the attribute is required or
 *         		optional
 * 
 *         type            the type of the attribute
 * 
 *       
 * 
 * <p>Java class for facelet-taglib-tag-attributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facelet-taglib-tag-attributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://java.sun.com/xml/ns/javaee}descriptionGroup"/>
 *         &lt;element name="name" type="{http://java.sun.com/xml/ns/javaee}java-identifierType"/>
 *         &lt;element name="required" type="{http://java.sun.com/xml/ns/javaee}generic-booleanType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;sequence minOccurs="0">
 *               &lt;element name="type" type="{http://java.sun.com/xml/ns/javaee}fully-qualified-classType" minOccurs="0"/>
 *             &lt;/sequence>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facelet-taglib-tag-attributeType", propOrder = {
    "description",
    "displayName",
    "icon",
    "name",
    "required",
    "type"
})
public class FaceletTaglibTagAttributeType {

    protected List<DescriptionType> description;
    @XmlElement(name = "display-name")
    protected List<DisplayNameType> displayName;
    protected List<IconType> icon;
    @XmlElement(required = true)
    protected JavaIdentifierType name;
    protected GenericBooleanType required;
    protected FullyQualifiedClassType type;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected java.lang.String id;

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     *
     *
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the displayName property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.richfaces.bootstrap.demo.jaxb.javaee.DisplayNameType }
     *
     *
     */
    public List<DisplayNameType> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<DisplayNameType>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the icon property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the icon property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIcon().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.richfaces.bootstrap.demo.jaxb.javaee.IconType }
     *
     *
     */
    public List<IconType> getIcon() {
        if (icon == null) {
            icon = new ArrayList<IconType>();
        }
        return this.icon;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link org.richfaces.bootstrap.demo.jaxb.javaee.JavaIdentifierType }
     *
     */
    public JavaIdentifierType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link org.richfaces.bootstrap.demo.jaxb.javaee.JavaIdentifierType }
     *
     */
    public void setName(JavaIdentifierType value) {
        this.name = value;
    }

    /**
     * Gets the value of the required property.
     *
     * @return
     *     possible object is
     *     {@link org.richfaces.bootstrap.demo.jaxb.javaee.GenericBooleanType }
     *
     */
    public GenericBooleanType getRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     *
     * @param value
     *     allowed object is
     *     {@link org.richfaces.bootstrap.demo.jaxb.javaee.GenericBooleanType }
     *
     */
    public void setRequired(GenericBooleanType value) {
        this.required = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link org.richfaces.bootstrap.demo.jaxb.javaee.FullyQualifiedClassType }
     *
     */
    public FullyQualifiedClassType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link org.richfaces.bootstrap.demo.jaxb.javaee.FullyQualifiedClassType }
     *     
     */
    public void setType(FullyQualifiedClassType value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

}
