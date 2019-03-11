package com.experiment.database.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String detail;
    @ManyToOne
    private User user;
    @Column(columnDefinition = "DATETIME NOT NULL" +
            "DEFAULT CURRENT_TIMESTAMP ON UPDATE" +
            "CURRENT_TIMESTAMP")
    private LocalDateTime updateTime;
    @Column(columnDefinition = "TIMESTAMP NOT NULL"  +
            "CURRENT_TIMESTAMP",
            updatable = false,
            insertable = false)
    private LocalDateTime insertTime;
    public Address(String detail) {
        this.detail = detail;
    }
}
