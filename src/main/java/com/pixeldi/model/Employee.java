package com.pixeldi.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private Date doj;
    private String dept;
    private double salary;

    @CreatedDate
    private long createDate;
    @LastModifiedDate
    private long lastModifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedDate
    private String modifiedBy;




}
