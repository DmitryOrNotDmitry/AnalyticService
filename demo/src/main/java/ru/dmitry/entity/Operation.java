package ru.dmitry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Operation {

    private long id;
    private long playerId;
    private double amount;

    public Operation() {

    }


}
