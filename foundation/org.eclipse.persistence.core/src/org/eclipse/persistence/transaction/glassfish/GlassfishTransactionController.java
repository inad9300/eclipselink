
/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
 ******************************************************************************/
package org.eclipse.persistence.transaction.glassfish;

import javax.transaction.TransactionManager;

import org.eclipse.persistence.transaction.JTATransactionController;

/**
 * <p>
 * <b>Purpose</b>: TransactionController implementation for Glassfish JTA
 * <p>
 * <b>Description</b>: Implements the required behavior for controlling JTA
 * transactions in Glassfish. The JTA TransactionManager must be set on the instance.
 *
 * @see org.eclipse.persistence.transaction.JTATransactionController
 */
public class GlassfishTransactionController extends JTATransactionController {

    // Use "java:appserver/TransactionManager" instead of java:pm/TransactionManager
    // as the former one is available in ACC as well as server.
    // See com.sun.enterprise.naming.java.javaURLContext in GlassFish appserv-core
    static final String JNDI_TRANSACTION_MANAGER_NAME = "java:appserver/TransactionManager";

    public GlassfishTransactionController() {
        super();
    }

    /**
     * INTERNAL:
     * Obtain and return the JTA TransactionManager on this platform
     */
    protected TransactionManager acquireTransactionManager() throws Exception {
        return (TransactionManager)jndiLookup(JNDI_TRANSACTION_MANAGER_NAME);
    }
}
