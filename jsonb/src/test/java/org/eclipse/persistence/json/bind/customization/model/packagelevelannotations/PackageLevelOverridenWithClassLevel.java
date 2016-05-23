/*******************************************************************************
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.persistence.json.bind.customization.model.packagelevelannotations;

import javax.json.bind.annotation.JsonbNillable;

/**
 * @author Roman Grigoriadi
 */
@JsonbNillable(false)
public class PackageLevelOverridenWithClassLevel {

    private String nillableOverridenField;

    public String getNillableOverridenField() {
        return nillableOverridenField;
    }

    public void setNillableOverridenField(String nillableOverridenField) {
        this.nillableOverridenField = nillableOverridenField;
    }
}