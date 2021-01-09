/*
 * Copyright (c) suyanliu.com Corp.
 * All Rights Reserved.
 */
package com.example.demo.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.demo.bean.Person;
import com.example.demo.bean.Post;
import com.example.demo.dao.PostDao;

import lombok.extern.slf4j.Slf4j;

/**
 * service . 
 * @version v1.0
 * @author Liu Shuyou, 2021年1月9日 
 */
@Service
@Slf4j
public class PersonService extends AbstractBaseService<Person>{
	@Autowired
	private PostDao postDao; 
	/**
	 * 排序。
	 * @param personList Person List。
	 * @return sorted List。
	 */
	public void sort(List<Person> personList){
		if (log.isDebugEnabled()) {
			log.debug("start sort ", personList);
		}
		postSort(personList);
	}

	/**
	 * 职务List。
	 * @param personList List。
	 */
	private void postSort(List<Person> personList) {
		Collections.sort(personList, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				if (p1 == null || p1.getPost() ==null || p1.getPost().isEmpty()) {
					return 1;
				}
				if (p2 == null || p2.getPost() ==null || p2.getPost().isEmpty()) {
					return -1;
				}
				
				
				int r1 = postPriority(p1.getPost());
				int r2 = postPriority(p2.getPost());
				
				return r2 - r1;
			}

			/**
			 * 返回最高优先级
			 * @param strs1 
			 * @param result
			 * @return
			 */
			private int postPriority(String posts) {
				int result = 0;
				String strs1[] = posts.split(",");
				for (String p :strs1) {
					Post post = postDao.findById(p);
					if (post.getPriority() > result) {
						result = post.getPriority();
					}
				}
				return result;
			}
			});
	}
}
