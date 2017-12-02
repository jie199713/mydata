package org.mybatis.example.test;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.mybatis.example.Blog;
import org.springframework.stereotype.Repository;

//@Repository("BlogMapper")
public interface BlogMapper {
	
//	@Select("select * from blog where username=#{username}")
//	@ResultMap("BlogresultMap")
	public List<Blog> FindBlogbyUsername(String username);
	
//	@Select("select * from blog where password=#{password}")
//	@ResultMap("BlogresultMap")
//	public List<Blog> FindBlogbyPassword(String password);
//	
//	@Select("select * from blog where age=#{age}")
//	@ResultMap("BlogresultMap")
//	public List<Blog> FindBlogbyAge(int age);
//	
//	@Select("select * from blog where sex=#{sex}")
//	@ResultMap("BlogresultMap")
//	public List<Blog> FindBlogbySex(String sex);
	
//	@Select("select * from blog where username=#{0} and password=#{1} limit 5")
//	@ResultMap("BlogresultMap")
	public List<Blog> FindBlogbyUP(String username,String password);
	
//	@Select("select * from blog where username=#{0} , password=#{1} and age=#{2}")
//	@ResultMap("BlogresultMap")
	public List<Blog> FindBlogbyUPS(String username,String password,int age);
}
