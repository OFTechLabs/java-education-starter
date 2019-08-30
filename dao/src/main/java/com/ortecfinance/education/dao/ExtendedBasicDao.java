package com.ortecfinance.education.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Transactional
public class ExtendedBasicDao {

    public static final String PERSISTENCE_UNIT_NAME = "ADD_YOUR_PU_HERE";

    @PersistenceContext(name = "entityManager", unitName = PERSISTENCE_UNIT_NAME)
    protected EntityManager entityManager;
}
