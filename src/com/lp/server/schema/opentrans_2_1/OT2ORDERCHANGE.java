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


package com.lp.server.schema.opentrans_2_1;

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
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/2.1}ORDERCHANGE_HEADER"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/2.1}ORDERCHANGE_ITEM_LIST"/>
 *         &lt;element ref="{http://www.opentrans.org/XMLSchema/2.1}ORDERCHANGE_SUMMARY"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.opentrans.org/XMLSchema/2.1}typeOPENTRANS_version" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderchangeheader",
    "orderchangeitemlist",
    "orderchangesummary"
})
@XmlRootElement(name = "ORDERCHANGE")
public class OT2ORDERCHANGE {

    @XmlElement(name = "ORDERCHANGE_HEADER", required = true)
    protected OT2ORDERCHANGEHEADER orderchangeheader;
    @XmlElement(name = "ORDERCHANGE_ITEM_LIST", required = true)
    protected OT2ORDERCHANGEITEMLIST orderchangeitemlist;
    @XmlElement(name = "ORDERCHANGE_SUMMARY", required = true)
    protected OT2ORDERCHANGESUMMARY orderchangesummary;
    @XmlAttribute(required = true)
    protected String version;

    /**
     * Gets the value of the orderchangeheader property.
     * 
     * @return
     *     possible object is
     *     {@link OT2ORDERCHANGEHEADER }
     *     
     */
    public OT2ORDERCHANGEHEADER getORDERCHANGEHEADER() {
        return orderchangeheader;
    }

    /**
     * Sets the value of the orderchangeheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link OT2ORDERCHANGEHEADER }
     *     
     */
    public void setORDERCHANGEHEADER(OT2ORDERCHANGEHEADER value) {
        this.orderchangeheader = value;
    }

    /**
     * Gets the value of the orderchangeitemlist property.
     * 
     * @return
     *     possible object is
     *     {@link OT2ORDERCHANGEITEMLIST }
     *     
     */
    public OT2ORDERCHANGEITEMLIST getORDERCHANGEITEMLIST() {
        return orderchangeitemlist;
    }

    /**
     * Sets the value of the orderchangeitemlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link OT2ORDERCHANGEITEMLIST }
     *     
     */
    public void setORDERCHANGEITEMLIST(OT2ORDERCHANGEITEMLIST value) {
        this.orderchangeitemlist = value;
    }

    /**
     * Gets the value of the orderchangesummary property.
     * 
     * @return
     *     possible object is
     *     {@link OT2ORDERCHANGESUMMARY }
     *     
     */
    public OT2ORDERCHANGESUMMARY getORDERCHANGESUMMARY() {
        return orderchangesummary;
    }

    /**
     * Sets the value of the orderchangesummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link OT2ORDERCHANGESUMMARY }
     *     
     */
    public void setORDERCHANGESUMMARY(OT2ORDERCHANGESUMMARY value) {
        this.orderchangesummary = value;
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
