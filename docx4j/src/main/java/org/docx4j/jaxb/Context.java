/*
 *  Copyright 2007, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is free software: you can use it, redistribute it and/or modify
    it under the terms of version 3 of the GNU Affero General Public License 
    as published by the Free Software Foundation.

    docx4j is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License   
    along with docx4j.  If not, see <http://www.fsf.org/licensing/licenses/>.
    
 */


package org.docx4j.jaxb;


import javax.xml.bind.JAXBContext;

public class Context {
	
	public static JAXBContext jc;
	public static JAXBContext jcThemePart;
	public static JAXBContext jcDocPropsCore;
	public static JAXBContext jcDocPropsCustom;
	public static JAXBContext jcDocPropsExtended;
	
	static {
		
		try {		
			jc = JAXBContext.newInstance("org.docx4j.wml");
			jcThemePart = JAXBContext.newInstance("org.docx4j.dml");
			jcDocPropsCore = JAXBContext.newInstance("org.docx4j.docProps.core:org.docx4j.docProps.core.dc.elements:org.docx4j.docProps.core.dc.terms");
			jcDocPropsCustom = JAXBContext.newInstance("org.docx4j.docProps.custom");
			jcDocPropsExtended = JAXBContext.newInstance("org.docx4j.docProps.extended");
		} catch (Exception ex) {
			ex.printStackTrace();
		}				
	}
		
}
