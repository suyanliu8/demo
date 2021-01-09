/*
 * Copyright (c) suyanliu.com Corp.
 * All Rights Reserved.
 */
package com.example.demo.bean;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @version v1.0
 * @author Liu Shuyou, 2021年1月9日 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Builder
public class Person extends AbstractAuditableEntity{
	private static final long serialVersionUID = 1L;
    /**
     * 数据项编号
     */
    //@TableId(value = "id", type = IdType.ASSIGN_ID)
	/** 编码*/
	private String id;
	/** name*/
	//@TableField("name")
	private String name;
	/** 职务*/
	//@TableField("post")
	private String post;
	/** 头像*/
	//@TableField("pic")
	private String pic;
}
