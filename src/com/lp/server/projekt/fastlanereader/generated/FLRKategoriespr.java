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
package com.lp.server.projekt.fastlanereader.generated;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/** @author Hibernate CodeGenerator */
public class FLRKategoriespr implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** nullable persistent field */
    private String kategorie_c_nr;

    /** nullable persistent field */
    private String mandant_c_nr;

    /** nullable persistent field */
    private String locale_c_nr;

    /** nullable persistent field */
    private String c_bez;

    /** identifier field */
    private com.lp.server.projekt.fastlanereader.generated.FLRKategorie flrkategorie;

    /** full constructor */
    public FLRKategoriespr(String kategorie_c_nr, String mandant_c_nr, String locale_c_nr, String c_bez, com.lp.server.projekt.fastlanereader.generated.FLRKategorie flrkategorie) {
        this.kategorie_c_nr = kategorie_c_nr;
        this.mandant_c_nr = mandant_c_nr;
        this.locale_c_nr = locale_c_nr;
        this.c_bez = c_bez;
        this.flrkategorie = flrkategorie;
    }

    /** default constructor */
    public FLRKategoriespr() {
    }

    /** minimal constructor */
    public FLRKategoriespr(com.lp.server.projekt.fastlanereader.generated.FLRKategorie flrkategorie) {
        this.flrkategorie = flrkategorie;
    }

    public String getKategorie_c_nr() {
        return this.kategorie_c_nr;
    }

    public void setKategorie_c_nr(String kategorie_c_nr) {
        this.kategorie_c_nr = kategorie_c_nr;
    }

    public String getMandant_c_nr() {
        return this.mandant_c_nr;
    }

    public void setMandant_c_nr(String mandant_c_nr) {
        this.mandant_c_nr = mandant_c_nr;
    }

    public String getLocale_c_nr() {
        return this.locale_c_nr;
    }

    public void setLocale_c_nr(String locale_c_nr) {
        this.locale_c_nr = locale_c_nr;
    }

    public String getC_bez() {
        return this.c_bez;
    }

    public void setC_bez(String c_bez) {
        this.c_bez = c_bez;
    }

    public com.lp.server.projekt.fastlanereader.generated.FLRKategorie getFlrkategorie() {
        return this.flrkategorie;
    }

    public void setFlrkategorie(com.lp.server.projekt.fastlanereader.generated.FLRKategorie flrkategorie) {
        this.flrkategorie = flrkategorie;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("flrkategorie", getFlrkategorie())
            .toString();
    }

    public boolean equals(Object other) {
        if ( (this == other ) ) return true;
        if ( !(other instanceof FLRKategoriespr) ) return false;
        FLRKategoriespr castOther = (FLRKategoriespr) other;
        return new EqualsBuilder()
            .append(this.getFlrkategorie(), castOther.getFlrkategorie())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getFlrkategorie())
            .toHashCode();
    }

}
