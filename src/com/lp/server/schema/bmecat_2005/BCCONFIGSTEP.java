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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}STEP_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}STEP_HEADER" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}STEP_DESCR_SHORT" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}STEP_DESCR_LONG" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}STEP_ORDER" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}STEP_INTERACTION_TYPE" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}CONFIG_CODE" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}PRODUCT_PRICE_DETAILS" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.bmecat.org/bmecat/2005}CONFIG_FEATURE"/>
 *           &lt;element ref="{http://www.bmecat.org/bmecat/2005}CONFIG_PARTS"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}MIN_OCCURANCE"/>
 *         &lt;element ref="{http://www.bmecat.org/bmecat/2005}MAX_OCCURANCE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stepid",
    "stepheader",
    "stepdescrshort",
    "stepdescrlong",
    "steporder",
    "stepinteractiontype",
    "configcode",
    "productpricedetails",
    "configfeature",
    "configparts",
    "minoccurance",
    "maxoccurance"
})
@XmlRootElement(name = "CONFIG_STEP")
public class BCCONFIGSTEP {

    @XmlElement(name = "STEP_ID", required = true)
    protected String stepid;
    @XmlElement(name = "STEP_HEADER", required = true)
    protected List<BCSTEPHEADER> stepheader;
    @XmlElement(name = "STEP_DESCR_SHORT")
    protected List<BCSTEPDESCRSHORT> stepdescrshort;
    @XmlElement(name = "STEP_DESCR_LONG")
    protected List<BCSTEPDESCRLONG> stepdescrlong;
    @XmlElement(name = "STEP_ORDER")
    protected BigInteger steporder;
    @XmlElement(name = "STEP_INTERACTION_TYPE", defaultValue = "force_userinput")
    protected String stepinteractiontype;
    @XmlElement(name = "CONFIG_CODE")
    protected String configcode;
    @XmlElement(name = "PRODUCT_PRICE_DETAILS")
    protected BCPRODUCTPRICEDETAILS productpricedetails;
    @XmlElement(name = "CONFIG_FEATURE")
    protected BCCONFIGFEATURE configfeature;
    @XmlElement(name = "CONFIG_PARTS")
    protected BCCONFIGPARTS configparts;
    @XmlElement(name = "MIN_OCCURANCE", required = true)
    protected BigInteger minoccurance;
    @XmlElement(name = "MAX_OCCURANCE", required = true)
    protected BigInteger maxoccurance;

    /**
     * Gets the value of the stepid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTEPID() {
        return stepid;
    }

    /**
     * Sets the value of the stepid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTEPID(String value) {
        this.stepid = value;
    }

    /**
     * Gets the value of the stepheader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepheader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTEPHEADER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCSTEPHEADER }
     * 
     * 
     */
    public List<BCSTEPHEADER> getSTEPHEADER() {
        if (stepheader == null) {
            stepheader = new ArrayList<BCSTEPHEADER>();
        }
        return this.stepheader;
    }

    /**
     * Gets the value of the stepdescrshort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepdescrshort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTEPDESCRSHORT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCSTEPDESCRSHORT }
     * 
     * 
     */
    public List<BCSTEPDESCRSHORT> getSTEPDESCRSHORT() {
        if (stepdescrshort == null) {
            stepdescrshort = new ArrayList<BCSTEPDESCRSHORT>();
        }
        return this.stepdescrshort;
    }

    /**
     * Gets the value of the stepdescrlong property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepdescrlong property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSTEPDESCRLONG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BCSTEPDESCRLONG }
     * 
     * 
     */
    public List<BCSTEPDESCRLONG> getSTEPDESCRLONG() {
        if (stepdescrlong == null) {
            stepdescrlong = new ArrayList<BCSTEPDESCRLONG>();
        }
        return this.stepdescrlong;
    }

    /**
     * Gets the value of the steporder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSTEPORDER() {
        return steporder;
    }

    /**
     * Sets the value of the steporder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSTEPORDER(BigInteger value) {
        this.steporder = value;
    }

    /**
     * Gets the value of the stepinteractiontype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTEPINTERACTIONTYPE() {
        return stepinteractiontype;
    }

    /**
     * Sets the value of the stepinteractiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTEPINTERACTIONTYPE(String value) {
        this.stepinteractiontype = value;
    }

    /**
     * Gets the value of the configcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIGCODE() {
        return configcode;
    }

    /**
     * Sets the value of the configcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIGCODE(String value) {
        this.configcode = value;
    }

    /**
     * Gets the value of the productpricedetails property.
     * 
     * @return
     *     possible object is
     *     {@link BCPRODUCTPRICEDETAILS }
     *     
     */
    public BCPRODUCTPRICEDETAILS getPRODUCTPRICEDETAILS() {
        return productpricedetails;
    }

    /**
     * Sets the value of the productpricedetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCPRODUCTPRICEDETAILS }
     *     
     */
    public void setPRODUCTPRICEDETAILS(BCPRODUCTPRICEDETAILS value) {
        this.productpricedetails = value;
    }

    /**
     * Gets the value of the configfeature property.
     * 
     * @return
     *     possible object is
     *     {@link BCCONFIGFEATURE }
     *     
     */
    public BCCONFIGFEATURE getCONFIGFEATURE() {
        return configfeature;
    }

    /**
     * Sets the value of the configfeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCCONFIGFEATURE }
     *     
     */
    public void setCONFIGFEATURE(BCCONFIGFEATURE value) {
        this.configfeature = value;
    }

    /**
     * Gets the value of the configparts property.
     * 
     * @return
     *     possible object is
     *     {@link BCCONFIGPARTS }
     *     
     */
    public BCCONFIGPARTS getCONFIGPARTS() {
        return configparts;
    }

    /**
     * Sets the value of the configparts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BCCONFIGPARTS }
     *     
     */
    public void setCONFIGPARTS(BCCONFIGPARTS value) {
        this.configparts = value;
    }

    /**
     * Gets the value of the minoccurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMINOCCURANCE() {
        return minoccurance;
    }

    /**
     * Sets the value of the minoccurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMINOCCURANCE(BigInteger value) {
        this.minoccurance = value;
    }

    /**
     * Gets the value of the maxoccurance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMAXOCCURANCE() {
        return maxoccurance;
    }

    /**
     * Sets the value of the maxoccurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMAXOCCURANCE(BigInteger value) {
        this.maxoccurance = value;
    }

}