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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.lp.server.schema.opentrans_2_1.OT2AGREEMENTDESCR;
import com.lp.server.schema.opentrans_2_1.OT2ALLOWORCHARGEDESCR;
import com.lp.server.schema.opentrans_2_1.OT2ALLOWORCHARGENAME;
import com.lp.server.schema.opentrans_2_1.OT2FINANCECHARGEDESCR;
import com.lp.server.schema.opentrans_2_1.OT2INVOICEDESCR;
import com.lp.server.schema.opentrans_2_1.OT2ORDERDESCR;
import com.lp.server.schema.opentrans_2_1.OT2PACKAGEDESCR;
import com.lp.server.schema.opentrans_2_1.OT2REWARDSDESCR;
import com.lp.server.schema.opentrans_2_1.OT2REWARDSSYSTEM;


/**
 * <p>Java class for dtMLSTRING complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dtMLSTRING">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.bmecat.org/bmecat/2005>dtSTRING">
 *       &lt;attribute name="lang" type="{http://www.bmecat.org/bmecat/2005}dtLANG" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtMLSTRING", propOrder = {
    "value"
})
@XmlSeeAlso({
    OT2FINANCECHARGEDESCR.class,
    OT2REWARDSDESCR.class,
    OT2REWARDSSYSTEM.class,
    OT2ORDERDESCR.class,
    OT2AGREEMENTDESCR.class,
    OT2INVOICEDESCR.class,
    com.lp.server.schema.opentrans_2_1.TypeMLSTRING64000 .class,
    OT2ALLOWORCHARGEDESCR.class,
    OT2ALLOWORCHARGENAME.class,
    com.lp.server.schema.opentrans_2_1.TypeMLSTRING00050 .class,
    OT2PACKAGEDESCR.class,
    BCCONTACT.class,
    BCSTREET.class,
    BCNAME3 .class,
    BCSOURCENAME.class,
    BCNAME2 .class,
    BCCOUNTRY.class,
    BCNAME.class,
    BCADDRESSREMARKS.class,
    BCSTATE.class,
    BCCITY.class,
    BCFVALUE.class,
    BCFNAME.class,
    BCREFERENCEFEATUREGROUPNAME.class,
    BCMANUFACTURERTYPEDESCR.class,
    BCDESCRIPTIONLONG.class,
    TypeMLSTRING00250 .class,
    BCFVALUEDETAILS.class,
    BCBOXNO.class,
    BCCONTACTDESCR.class,
    BCTITLE.class,
    BCFIRSTNAME.class,
    BCCONTACTNAME.class,
    BCDESCRIPTIONSHORT.class,
    BCMEANSOFTRANSPORTNAME.class,
    BCFDESCR.class,
    BCUNITSHORTNAME.class,
    BCCLASSIFICATIONSYSTEMDESCR.class,
    BCCLASSIFICATIONSYSTEMFULLNAME.class,
    com.lp.server.schema.bmecat_2005.TypeMLSTRING64000 .class,
    BCPREDEFINEDCONFIGDESCR.class,
    BCPREDEFINEDCONFIGNAME.class,
    BCSTEPDESCRLONG.class,
    BCSTEPDESCRSHORT.class,
    BCSTEPHEADER.class,
    BCCLASSIFICATIONGROUPNOTE.class,
    BCCLASSIFICATIONGROUPDESCR.class,
    BCCLASSIFICATIONGROUPSHORTNAME.class,
    BCCLASSIFICATIONGROUPNAME.class,
    BCALLOWEDVALUEDESCR.class,
    BCALLOWEDVALUESHORTNAME.class,
    BCALLOWEDVALUENAME.class,
    BCGROUPSYSTEMDESCRIPTION.class,
    BCGROUPDESCRIPTION.class,
    BCGROUPNAME.class,
    BCGROUPSYSTEMNAME.class,
    BCACADEMICTITLE.class,
    BCZIPBOX.class,
    BCFTREMARK.class,
    BCFTNOTE.class,
    BCSYNONYM.class,
    BCFTSYMBOL.class,
    BCFTGROUPNAME.class,
    BCFTDESCR.class,
    BCFTSHORTNAME.class,
    TypeMLSTRING00080 .class,
    BCLEGALTEXT.class,
    BCAREADESCR.class,
    BCAREANAME.class,
    BCIPPURI.class,
    BCIPPPARAMDESCR.class,
    BCIPPOPERATIONDESCR.class,
    BCIPPDESCR.class,
    BCDEPARTMENT.class,
    BCTRANSPORTREMARK.class,
    BCMIMEROOT.class,
    BCCATALOGNAME.class,
    BCFORMULANAME.class,
    TypeMLSTRING06000 .class,
    BCPARAMETERUNIT.class,
    BCPARAMETERDESCR.class,
    BCPARAMETERNAME.class,
    BCFTNAME.class,
    BCKEYWORD.class,
    BCFTGROUPDESCR.class,
    BCSEGMENT.class,
    BCJURISDICTION.class,
    BCEXEMPTIONREASON.class,
    BCMIMEALT.class,
    BCMIMEDESCR.class,
    BCMIMESOURCE.class,
    BCVALUETEXT.class,
    BCREFERENCEDESCR.class,
    BCPACKINGUNITDESCR.class,
    BCUNITDESCR.class,
    com.lp.server.schema.bmecat_2005.TypeMLSTRING00050 .class,
    BCZIP.class,
    BCUNITNAME.class,
    BCCLASSIFICATIONGROUPREMARK.class,
    BCFORMULADESCR.class
})
public class DtMLSTRING {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String lang;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}