package com.example.demo.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.bean.Post;

/**
 * 临时代码。 
 * @author liushuyou
 *
 */
//public interface PostDao //extends BaseDao<Post> {
@Component
public class PostDao {

	private static Map<String, Post> map = new HashMap<>();
	static {
		map.put("1001", Post.builder().id("1001").name("董事长").priority(8).build());
		map.put("1002", Post.builder().id("1002").name("副董事长").priority(7).build());
		map.put("1003", Post.builder().id("1003").name("执行董事").priority(6).build());
		map.put("1004", Post.builder().id("1004").name("监事").priority(5).build());
		map.put("1005", Post.builder().id("1005").name("总经理").priority(3).build());
		map.put("1006", Post.builder().id("1006").name("工程师").priority(2).build());
		map.put("1007", Post.builder().id("1007").name("董事").priority(2).build());
	}
	
	public Post findById(String id) {
		return map.get(id);
	}

}