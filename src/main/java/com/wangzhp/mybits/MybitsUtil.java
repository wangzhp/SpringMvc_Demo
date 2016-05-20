package com.wangzhp.mybits;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybitsUtil {

	public static SqlSession getSqlSession() {

		String xml = "mybits_config.xml";
		InputStream stream = MybitsUtil.class.getClassLoader().getResourceAsStream(xml);
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
		return sessionFactory.openSession(true);
	}

}
