package com.isbasi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Email {

    private Long id;

    private String to;
    private String title;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
