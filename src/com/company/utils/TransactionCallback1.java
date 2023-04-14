package com.company.utils;

import javax.persistence.EntityManager;

public interface TransactionCallback1 {

    void doInTransaction(EntityManager entityManager);

}