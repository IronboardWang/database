package com.experiment.database.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",length = 24)
    private String name;
    @ManyToMany(mappedBy = "usr")
    private List<Address> address;
    @Column(columnDefinition = "DATETIME NOT NULL" +
            "DEFAULT CURRENT_TIMESTAMP ON UPDATE" +
            "CURRENT_TIMESTAMP")
    private LocalDateTime updateTime;
    @Column(columnDefinition = "TIMESTAMP NOT NULL"  +
            "CURRENT_TIMESTAMP",
            updatable = false,
            insertable = false)
    private LocalDateTime insertTime;
    public User(String name) {
        this.name = name;
    }
}
