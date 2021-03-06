/*******************************************************************************
 * HELIUM V, Open Source ERP software for sustained success
 * at small and medium-sized enterprises.
 * Copyright (C) 2004 - 2014 HELIUM V IT-Solutions GmbH
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published 
 * by the Free Software Foundation, either version 3 of theLicense, or 
 * (at your option) any later version.
 * 
 * According to sec. 7 of the GNU Affero General Public License, version 3, 
 * the terms of the AGPL are supplemented with the following terms:
 * 
 * "HELIUM V" and "HELIUM 5" are registered trademarks of 
 * HELIUM V IT-Solutions GmbH. The licensing of the program under the 
 * AGPL does not imply a trademark license. Therefore any rights, title and
 * interest in our trademarks remain entirely with us. If you want to propagate
 * modified versions of the Program under the name "HELIUM V" or "HELIUM 5",
 * you may only do so if you have a written permission by HELIUM V IT-Solutions 
 * GmbH (to acquire a permission please contact HELIUM V IT-Solutions
 * at trademark@heliumv.com).
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contact: developers@heliumv.com
 ******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.01.30 at 04:44:14 PM MEZ 
//


package com.lp.server.schema.bmecat_2005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}HEADER"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.bmecat.org/bmecat/2005}T_NEW_CATALOG"/>
 *           &lt;element ref="{http://www.bmecat.org/bmecat/2005}T_UPDATE_PRODUCTS"/>
 *           &lt;element ref="{http://www.bmecat.org/bmecat/2005}T_UPDATE_PRICES"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.bmecat.org/bmecat/2005}typeBMEcat_version" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "tnewcatalog",
    "tupdateproducts",
    "tupdateprices"
})
@XmlRootElement(name = "BMECAT")
public class BCBMECAT {

    @XmlElement(name = "HEADER", required = true)
    protected BCHEADER header;
    @XmlElement(name = "T_NEW_CATALOG")
    protected BCTNEWCATALOG tnewcatalog;
    @XmlElement(name = "T_UPDATE_PRODUCTS")
    protected BCTUPDATEPRODUCTS tupdateproducts;
    @XmlElement(name = "T_UPDATE_PRICES")
    protected BCTUPDATEPRICES tupdateprices;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link BCHEADER }
     *     
     */
    public BCHEADER getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCHEADER }
     *     
     */
    public void setHEADER(BCHEADER value) {
        this.header = value;
    }

    /**
     * Gets the value of the tnewcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link BCTNEWCATALOG }
     *     
     */
    public BCTNEWCATALOG getTNEWCATALOG() {
        return tnewcatalog;
    }

    /**
     * Sets the value of the tnewcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCTNEWCATALOG }
     *     
     */
    public void setTNEWCATALOG(BCTNEWCATALOG value) {
        this.tnewcatalog = value;
    }

    /**
     * Gets the value of the tupdateproducts property.
     * 
     * @return
     *     possible object is
     *     {@link BCTUPDATEPRODUCTS }
     *     
     */
    public BCTUPDATEPRODUCTS getTUPDATEPRODUCTS() {
        return tupdateproducts;
    }

    /**
     * Sets the value of the tupdateproducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCTUPDATEPRODUCTS }
     *     
     */
    public void setTUPDATEPRODUCTS(BCTUPDATEPRODUCTS value) {
        this.tupdateproducts = value;
    }

    /**
     * Gets the value of the tupdateprices property.
     * 
     * @return
     *     possible object is
     *     {@link BCTUPDATEPRICES }
     *     
     */
    public BCTUPDATEPRICES getTUPDATEPRICES() {
        return tupdateprices;
    }

    /**
     * Sets the value of the tupdateprices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCTUPDATEPRICES }
     *     
     */
    public void setTUPDATEPRICES(BCTUPDATEPRICES value) {
        this.tupdateprices = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
