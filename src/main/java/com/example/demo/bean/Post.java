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
 * 职务
 * @version v1.0
 * @author Liu Shuyou, 2021年1月9日 
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@Builder
public class Post extends AbstractAuditableEntity{
	private static final long serialVersionUID = 1L;
	/** 编码*/
	private String id;
	/** name*/
	private String name;
	/** 优先级*/
	private int priority;
}
