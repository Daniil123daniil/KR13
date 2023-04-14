package com.company.fashiondesigner2;

import javax.persistence.*;

@Entity
@Table(name = "carentrance")
public class CarEntrance1 {
    private int id;
    @Column(name = "number")
    private String number;
    @Column(name = "date")
    private String date;
    private Object GenerationType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public CarEntrance1() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}