/*******************************************************************************
 * Copyright (c) 2011, 2013 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Oracle = 2.2 - Initial implementation
 ******************************************************************************/
package org.eclipse.persistence.testing.oxm.mappings.choicecollection.ref;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.persistence.oxm.XMLDescriptor;
import org.eclipse.persistence.oxm.XMLField;
import org.eclipse.persistence.oxm.mappings.XMLChoiceCollectionMapping;
import org.eclipse.persistence.oxm.mappings.XMLCompositeCollectionMapping;
import org.eclipse.persistence.oxm.mappings.XMLDirectMapping;
import org.eclipse.persistence.sessions.Project;

public class XMLChoiceWithReferenceOrderProject extends Project {
    public XMLChoiceWithReferenceOrderProject() {
        addDescriptor(getEmployeeDescriptor());
        addDescriptor(getAddressDescriptor());
        addDescriptor(getRootDescriptor());
        addDescriptor(getPhoneNumberDescriptor());
    }
    
    public XMLDescriptor getEmployeeDescriptor() {
        XMLDescriptor desc = new XMLDescriptor();
        desc.setJavaClass(Employee.class);
        
        XMLDirectMapping name = new XMLDirectMapping();
        name.setAttributeName("name");
        name.setXPath("name/text()");
        desc.addMapping(name);
        
        XMLChoiceCollectionMapping mapping = new XMLChoiceCollectionMapping();
        mapping.setAttributeName("contact");
        List<XMLField> sourceFields = new ArrayList<XMLField>();
        List<XMLField> targetFields = new ArrayList<XMLField>();
        
        mapping.addChoiceElement(sourceFields, Address.class, targetFields);
        sourceFields = new ArrayList<XMLField>();
        XMLField source = new XMLField("phone/@id");
        sourceFields.add(source);
        
        targetFields = new ArrayList<XMLField>();
        XMLField target = new XMLField("@id");
        targetFields.add(target);
        
        mapping.addChoiceElement(sourceFields, PhoneNumber.class, targetFields);        
        source = new XMLField("address/address-id/text()");
        sourceFields.add(source);
        source = new XMLField("address/zip/text()");
        sourceFields.add(source);
        
        target = new XMLField("@id");
        targetFields.add(target);
        target = new XMLField("zip/text()");
        targetFields.add(target);
        
        mapping.addChoiceElement(sourceFields, Address.class, targetFields);
        
        sourceFields = new ArrayList<XMLField>();
        source = new XMLField("work-address/id/text()");
        sourceFields.add(source);
        source = new XMLField("work-address/zip/text()");
        sourceFields.add(source);
        

        desc.addMapping(mapping);
        
        return desc;
    }
    
    public XMLDescriptor getAddressDescriptor() {
        XMLDescriptor desc = new XMLDescriptor();
        desc.setJavaClass(Address.class);
        desc.addPrimaryKeyFieldName("@id");
        desc.addPrimaryKeyFieldName("zip/text()");
        
        XMLDirectMapping mapping = new XMLDirectMapping();
        mapping.setAttributeName("id");
        mapping.setXPath("@id");
        desc.addMapping(mapping);
        
        mapping = new XMLDirectMapping();
        mapping.setAttributeName("street");
        mapping.setXPath("street/text()");
        desc.addMapping(mapping);
        
        mapping = new XMLDirectMapping();
        mapping.setAttributeName("zip");
        mapping.setXPath("zip/text()");
        desc.addMapping(mapping);
        
        return desc;
    }
    
    public XMLDescriptor getRootDescriptor() {
        XMLDescriptor desc = new XMLDescriptor();
        desc.setJavaClass(Root.class);
        desc.setDefaultRootElement("root");
        
        XMLCompositeCollectionMapping mapping = new XMLCompositeCollectionMapping();
        mapping.setReferenceClass(Employee.class);
        mapping.setXPath("employees/employee");
        mapping.setAttributeName("employees");
        desc.addMapping(mapping);
        
        mapping = new XMLCompositeCollectionMapping();
        mapping.setReferenceClass(Address.class);
        mapping.setAttributeName("addresses");
        mapping.setXPath("addresses/address");
        desc.addMapping(mapping);
        
        mapping = new XMLCompositeCollectionMapping();
        mapping.setReferenceClass(PhoneNumber.class);
        mapping.setAttributeName("phones");
        mapping.setXPath("phone-numbers/phone");
        desc.addMapping(mapping);
        
        
        return desc;
    }
    
    public XMLDescriptor getPhoneNumberDescriptor() {
        XMLDescriptor desc = new XMLDescriptor();
        desc.setJavaClass(PhoneNumber.class);
        desc.setPrimaryKeyFieldName("@id");
        
        XMLDirectMapping mapping = new XMLDirectMapping();
        mapping.setXPath("@id");
        mapping.setAttributeName("id");
        desc.addMapping(mapping);
        
        mapping = new XMLDirectMapping();
        mapping.setXPath("text()");
        mapping.setAttributeName("number");
        desc.addMapping(mapping);
        
        return desc;
        
    }

}