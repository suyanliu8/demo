/*
 * Copyright (c) suyanliu.com Corp.
 * All Rights Reserved.
 */
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Post;
import com.example.demo.dao.PostDao;

import lombok.extern.slf4j.Slf4j;

/**
 * post service . 
 * @version v1.0
 * @author Liu Shuyou, 2021年1月9日 
 */
@Service
@Slf4j
public class PostService extends AbstractBaseService<Post>{
	@Autowired
    private PostDao postDao;

    @Override
    protected PostDao getDao() {
        return postDao;
    } 
}
