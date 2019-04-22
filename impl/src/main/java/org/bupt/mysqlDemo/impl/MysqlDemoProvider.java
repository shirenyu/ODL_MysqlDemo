/*
 * Copyright © 2017 sry.Inc and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.bupt.mysqlDemo.impl;
import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MysqlDemoProvider {

    private static final Logger LOG = LoggerFactory.getLogger(MysqlDemoProvider.class);

    private final DataBroker dataBroker;

    private PersonService personService;
//    private StudentServiceImpl studentServiceImpl;


    public MysqlDemoProvider(final DataBroker dataBroker,PersonService personService) {
        this.dataBroker = dataBroker;
        this.personService = personService;
    }

    /**
     * Method called when the blueprint container is created.
     */
    public void init() {
        LOG.info("MysqlDemoProvider Session Initiated");
        System.out.println("gose");
        Person person = new Person();
        person.setName("test");
        personService.add(person);
        personService.getAll();




//        studentServiceImpl.add();
//        System.out.println("After add");
//
//        studentServiceImpl.getAll();
//        studentServiceImpl.get();
//        studentServiceImpl.update();
//        studentServiceImpl.getAll();
//        studentServiceImpl.delete();
//        studentServiceImpl.getAll();
//        studentServiceImpl.rollBack();
//        studentServiceImpl.getAll();
//        studentServiceImpl.hqlQuery();
//        studentServiceImpl.getAll();
//        studentServiceImpl.pageQuery();
    }

    /**
     * Method called when the blueprint container is destroyed.
     */
    public void close() {
        LOG.info("MysqlDemoProvider Closed");
    }
}