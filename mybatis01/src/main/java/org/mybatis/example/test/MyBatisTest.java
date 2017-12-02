package org.mybatis.example.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.Blog;

public class MyBatisTest {

//	public static void main(String[] args) throws IOException {
//		// 读取mybatis整体配置文件
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		// 创建SqlSessionFactory
//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		// 创建SqlSession
//		SqlSession session = sqlSessionFactory.openSession();
//		try {
//			List<Blog> list = new ArrayList<Blog>();
//			list = session.selectList("org.mybatis.example.test.BlogMapper.FindBlogbyUsername","2");
//			for (int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i).toString());
//			}
//
//		} finally {
//			session.close();
//		}
//	}
	 public static List<Blog> FindBlogbyUsername(String username){
	 SqlSession session = null;
	 List<Blog> blogs = null;
	 String resource = "mybatis-config.xml";
	 InputStream inputStream;
	 try {
	 inputStream = Resources.getResourceAsStream(resource);
	 SqlSessionFactory sqlSessionFactory = new
	 SqlSessionFactoryBuilder().build(inputStream);
	 session = sqlSessionFactory.openSession();
	
	 BlogMapper blogMapper = session.getMapper(BlogMapper.class);
	 blogs = blogMapper.FindBlogbyUsername(username);
	 } catch (IOException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 return blogs;
	 }
	
	 public static List<Blog> FindBlogbyUP(String username,String password){
	 SqlSession session = null;
	 List<Blog> blogs = null;
	 String resource = "mybatis-config.xml";
	 InputStream inputStream;
	 try {
	 inputStream = Resources.getResourceAsStream(resource);
	 SqlSessionFactory sqlSessionFactory = new
	 SqlSessionFactoryBuilder().build(inputStream);
	 session = sqlSessionFactory.openSession();
	
	 BlogMapper blogMapper = session.getMapper(BlogMapper.class);
	 blogs = blogMapper.FindBlogbyUP(username,password);
	 } catch (IOException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	 return blogs;
	 }

	 public static void main(String[] args) throws IOException {
	 List<Blog> Blogers = FindBlogbyUP("2", "3");
	 for (Blog bloger : Blogers) {
	 System.out.println(bloger);
	 }
	 }
}
