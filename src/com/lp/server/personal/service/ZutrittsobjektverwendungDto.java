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
package com.lp.server.personal.service;

import java.io.Serializable;

public class ZutrittsobjektverwendungDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer iId;
	private String mandantCNr;
	private Integer iAnzahlverwendung;
	private Integer zutrittsobjektIId;

	public Integer getIId() {
		return iId;
	}

	public void setIId(Integer iId) {
		this.iId = iId;
	}

	public String getMandantCNr() {
		return mandantCNr;
	}

	public void setMandantCNr(String mandantCNr) {
		this.mandantCNr = mandantCNr;
	}

	public Integer getIAnzahlverwendung() {
		return iAnzahlverwendung;
	}

	public void setIAnzahlverwendung(Integer iAnzahlverwendung) {
		this.iAnzahlverwendung = iAnzahlverwendung;
	}

	public Integer getZutrittsobjektIId() {
		return zutrittsobjektIId;
	}

	public void setZutrittsobjektIId(Integer zutrittsobjektIId) {
		this.zutrittsobjektIId = zutrittsobjektIId;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ZutrittsobjektverwendungDto))
			return false;
		ZutrittsobjektverwendungDto that = (ZutrittsobjektverwendungDto) obj;
		if (!(that.iId == null ? this.iId == null : that.iId.equals(this.iId)))
			return false;
		if (!(that.mandantCNr == null ? this.mandantCNr == null
				: that.mandantCNr.equals(this.mandantCNr)))
			return false;
		if (!(that.iAnzahlverwendung == null ? this.iAnzahlverwendung == null
				: that.iAnzahlverwendung.equals(this.iAnzahlverwendung)))
			return false;
		if (!(that.zutrittsobjektIId == null ? this.zutrittsobjektIId == null
				: that.zutrittsobjektIId.equals(this.zutrittsobjektIId)))
			return false;
		return true;
	}

	public int hashCode() {
		int result = 17;
		result = 37 * result + this.iId.hashCode();
		result = 37 * result + this.mandantCNr.hashCode();
		result = 37 * result + this.iAnzahlverwendung.hashCode();
		result = 37 * result + this.zutrittsobjektIId.hashCode();
		return result;
	}

	public String toString() {
		StringBuffer returnStringBuffer = new StringBuffer(128);
		returnStringBuffer.append("[");
		returnStringBuffer.append("iId:").append(iId);
		returnStringBuffer.append("mandantCNr:").append(mandantCNr);
		returnStringBuffer.append("iAnzahlverwendung:").append(
				iAnzahlverwendung);
		returnStringBuffer.append("zutrittsobjektIId:").append(
				zutrittsobjektIId);
		returnStringBuffer.append("]");
		return returnStringBuffer.toString();
	}
}