package com.company.utils;

import javax.persistence.EntityManager;

public class TransactionManager1 {

    public static void doInTransaction(TransactionCallback1 callback) {
        EntityManager entityManager = DBConnector2.getEntityManager();
        entityManager.getTransaction().begin();

        callback.doInTransaction(entityManager);

        entityManager.getTransaction().commit();
    }
}