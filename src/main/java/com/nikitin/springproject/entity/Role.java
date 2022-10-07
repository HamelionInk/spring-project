package com.nikitin.springproject.entity;

import com.nikitin.springproject.util.RoleEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "role")
public class Role {

    @Id
    private UUID id;

    @Column(name = "roles")
    private RoleEnum role;
}
