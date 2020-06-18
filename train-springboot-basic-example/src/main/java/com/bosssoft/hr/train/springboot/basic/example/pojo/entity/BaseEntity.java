package com.bosssoft.hr.train.springboot.basic.example.pojo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
public abstract class BaseEntity implements Serializable {
    private Long id;
    private Long companyId;
    private Date createdTime;
    private Long createdBy;
    private Date updatedTime;
    private Long updatedBy;
    private Long version;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
