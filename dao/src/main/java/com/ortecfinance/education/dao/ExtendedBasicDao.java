package com.ortecfinance.education.dao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class ExtendedBasicDao {

    public static final String PERSISTENCE_UNIT_NAME = "ADD_YOUR_PU_HERE";

    @PersistenceContext(name = "entityManager", unitName = PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;
}
