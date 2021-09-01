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
package org.eclipse.persistence.testing.oxm.mappings.compositecollection.identifiedbyname.withoutgroupingelement;

import java.util.Vector;
import org.eclipse.persistence.testing.oxm.mappings.XMLWithJSONMappingTestCases;
import org.eclipse.persistence.testing.oxm.mappings.compositecollection.Employee;
import org.eclipse.persistence.testing.oxm.mappings.compositecollection.EmailAddress;
import org.eclipse.persistence.testing.oxm.mappings.compositecollection.MailingAddress;

public class CompositeCollectionEmptyCollectionTestCases extends XMLWithJSONMappingTestCases {
    private final static String XML_RESOURCE = "org/eclipse/persistence/testing/oxm/mappings/compositecollection/identifiedbyname/withoutgroupingelement/CompositeCollectionEmptyCollection.xml";
    private final static String JSON_RESOURCE = "org/eclipse/persistence/testing/oxm/mappings/compositecollection/identifiedbyname/withoutgroupingelement/CompositeCollectionEmptyCollection.json";
    private final static int CONTROL_EMPLOYEE_ID = 123;
    private final static String CONTROL_EMAIL_ADDRESS_1_USER_ID = "jane.doe";
    private final static String CONTROL_EMAIL_ADDRESS_1_DOMAIN = "example.com";
    private final static String CONTROL_EMAIL_ADDRESS_2_USER_ID = "jdoe";
    private final static String CONTROL_EMAIL_ADDRESS_2_DOMAIN = "test.com";

    public CompositeCollectionEmptyCollectionTestCases(String name) throws Exception {
        super(name);
        setControlDocument(XML_RESOURCE);
        setControlJSON(JSON_RESOURCE);
        setProject(new CompositeCollectionWithoutGroupingElementIdentifiedByNameProject());
    }

    @Override
    protected Object getControlObject() {
        Employee employee = new Employee();
        employee.setID(CONTROL_EMPLOYEE_ID);

        EmailAddress emailAddress1 = new EmailAddress();
        emailAddress1.setUserID(CONTROL_EMAIL_ADDRESS_1_USER_ID);
        emailAddress1.setDomain(CONTROL_EMAIL_ADDRESS_1_DOMAIN);
        employee.getEmailAddresses().add(emailAddress1);

        EmailAddress emailAddress2 = new EmailAddress();
        emailAddress2.setUserID(CONTROL_EMAIL_ADDRESS_2_USER_ID);
        emailAddress2.setDomain(CONTROL_EMAIL_ADDRESS_2_DOMAIN);
        employee.getEmailAddresses().add(emailAddress2);

        employee.setMailingAddresses(new Vector());

        return employee;
    }

    @Override
    public void testXMLToObjectFromInputStream() throws Exception {
        //do nothing
    }

    @Override
    public void testXMLToObjectFromURL() throws Exception {
        //do nothing
    }

    /*
        public void testXMLToObjectFromDocument() throws Exception {
            //do nothing
        }
            */
}
