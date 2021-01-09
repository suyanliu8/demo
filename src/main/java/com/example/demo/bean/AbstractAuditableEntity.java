/*
 * Copyright (c) suyanliu.com.
 * All Rights Reserved.
 */
package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 公共属性
 *
 * @version demo v1
 * @author Liu ShuYou, 2021年1月9日
 */
@Data
@Accessors(chain = true)
public class AbstractAuditableEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //@TableField(value = "created_by", fill = FieldFill.INSERT)
    private String createdBy;

    //@TableField(value = "created_date", fill = FieldFill.INSERT)
    private Date createdDate;

    //@TableField(value = "last_modified_by", fill = FieldFill.UPDATE)
    private String lastModifiedBy;

    //@TableField(value = "last_modified_date", fill = FieldFill.UPDATE)
    private Date lastModifiedDate;

}
