/*******************************************************************************
 * Copyright (c) 2012, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     12/07/2012-2.5 Guy Pelletier
 *       - 389090: JPA 2.1 DDL Generation Support
 ******************************************************************************/
package org.eclipse.persistence.testing.models.jpa22.advanced.xml.ddl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {
    public Integer id;
    public String name;
    public List<Runner> runners;
    protected Map<Responsibility, Organizer> organizers;

    public Race() {
        runners = new ArrayList<>();
        organizers = new HashMap<>();
    }

    public void addOrganizer(Organizer organizer, Responsibility responsibility) {
        organizers.put(responsibility, organizer);
    }

    public void addRunner(Runner runner) {
        runners.add(runner);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Responsibility, Organizer> getOrganizers() {
        return organizers;
    }

    public List<Runner> getRunners() {
        return runners;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganizers(Map<Responsibility, Organizer> organizers) {
        this.organizers = organizers;
    }

    public void setRunners(List<Runner> runners) {
        this.runners = runners;
    }
}