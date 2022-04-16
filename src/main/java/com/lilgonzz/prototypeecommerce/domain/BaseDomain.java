package com.lilgonzz.prototypeecommerce.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

//@MappedSuperclass
public abstract class BaseDomain implements Serializable{
    private static final long serialVersionUID = 1l;
    private Integer id;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public BaseDomain(){}
    public BaseDomain(Integer id, LocalDateTime createAt, LocalDateTime updateAt) {
        this.id = id;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
