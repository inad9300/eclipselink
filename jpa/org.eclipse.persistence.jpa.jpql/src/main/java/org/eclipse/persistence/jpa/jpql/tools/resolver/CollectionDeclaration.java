/*
 * Copyright (c) 2012, 2021 Oracle and/or its affiliates. All rights reserved.
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
//     Oracle - initial API and implementation
//
package org.eclipse.persistence.jpa.jpql.tools.resolver;

/**
 * This <code>CollectionDeclaration</code> represents a collection member declaration that was
 * declared in the <code><b>FROM</b></code> clause of a <code><b>SELECT</b></code> top-level query
 * or subquery.
 *
 * @see org.eclipse.persistence.jpa.jpql.parser.CollectionMemberDeclaration
 *
 * @version 2.5
 * @since 2.5
 * @author Pascal Filion
 */
public class CollectionDeclaration extends Declaration {

    /**
     * Creates a new <code>CollectionDeclaration</code>.
     */
    public CollectionDeclaration() {
        super();
    }

    @Override
    public Type getType() {
        return Type.COLLECTION;
    }
}
