package com.wangzhp.mybits;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;

import com.wangzhp.model.Classes;
import com.wangzhp.model.Demo1;
import com.wangzhp.model.user;

public class demoTest {

	public static void main(String[] args) {

		InputStream stream = demoTest.class.getClassLoader().getResourceAsStream("mybits_config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
		SqlSession session = factory.openSession();
		String statemnet = "com.wangzhp.model.getperson";

		List<Demo1> p = session.selectList(statemnet, "justrun");
		System.out.println(p.size());
	}

	@Test
	public void testInsert() {

		SqlSession sqlSession = MybitsUtil.getSqlSession();
		Demo1 demo = new Demo1();
		demo.setName("justrun");
		demo.setAge(12);
		int res = sqlSession.insert("com.wangzhp.model.insert", demo);
		Assert.assertTrue(res == 1);
		System.out.println(res == 1);
	}

	@Test
	public void testDelete() {

		SqlSession sqlSession = MybitsUtil.getSqlSession();
		int res = sqlSession.delete("com.wangzhp.model.delete", "wzp");

		sqlSession.close();
		System.out.println(res);
	}
	@Test
	public void SelectAll() {
		SqlSession sqlSession = MybitsUtil.getSqlSession();
		String statemnet = "com.wangzhp.model.selectAll";
		Classes p = sqlSession.selectOne(statemnet, 2);
		System.out.println(p);
	}
	
	
	@Test
	public void SelectAllGenerator() {
//		SqlSession sqlSession = MybitsUtil.getSqlSession();
//		String statement = "com.wangzhp.dao.ZeroSaleClueMapper.insertSelective";
//		//User  use=new User();
//		use.setUserId("333");
//		use.setUserName("333");
//
//		int insert = sqlSession.insert(statement, use);
//		System.out.println(insert);
	}

}
