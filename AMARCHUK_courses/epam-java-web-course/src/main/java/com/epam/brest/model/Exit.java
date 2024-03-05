package com.epam.brest.model;

public class Exit implements Status {


    public Status handle() {
        return null;
    }


    public StatusType getType() {
        return StatusType.EXIT;
    }
}
