package com.okulan.geocorp.persistence.entity;

import com.okulan.geocorp.persistence.enums.Position;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Сущность сотрудника
 *
 * @author Oleg Kulankhin 05.04.2021
 */
@Data
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "email")
    private String email;

    @NotNull
    @OneToOne(mappedBy = "employee", optional = false)
    private PersonEntity person;

    @Enumerated
    @Column(name = "position")
    private Position position;

}
