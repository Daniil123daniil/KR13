package com.company.DAOSuper2;

import com.company.fashiondesigner2.CarEntrance1;
import com.company.utils.TransactionManager1;

public class CarEntranceDao1 {
    public void create(CarEntrance1 carEntrance){
        TransactionManager1.doInTransaction(entityManager -> entityManager.persist(carEntrance));
    }
}