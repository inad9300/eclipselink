/*
 * Copyright (c) 1998, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.jaxb.xmlenum;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.persistence.jaxb.JAXBContextProperties;
import org.eclipse.persistence.testing.jaxb.JAXBWithJSONTestCases;

public class XmlEnumAttributeTestCases extends JAXBWithJSONTestCases {

    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlenum/employee_attribute.xml";
    private final static String JSON_RESOURCE = "org/eclipse/persistence/testing/jaxb/xmlenum/employee_attribute.json";

    private final static String CONTROL_NAME = "John Doe";

    public XmlEnumAttributeTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
        Class[] classes = new Class[2];
        classes[0] = EmployeeDepartmentAttribute.class;
        classes[1] = Department.class;
        setClasses(classes);
    }

    @Override
    protected Object getControlObject() {
        EmployeeDepartmentAttribute emp = new EmployeeDepartmentAttribute();
        emp.name = CONTROL_NAME;
        emp.department = Department.J2EE;
        return emp;
    }

    @Override
    protected Map getProperties(){
        Map<String, String> props = new HashMap<String, String>();
        props.put(JAXBContextProperties.JSON_ATTRIBUTE_PREFIX, "@");
        return props;
    }
}

