package cn.springmvc.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import cn.springmvc.dao.PerUserMapper;
import cn.springmvc.model.PerUser;
import cn.springmvc.service.PerUserService;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:conf/spring-mvc.xml","classpath*:conf/spring.xml","classpath*:conf/spring-mybatis.xml","classpath*:conf/mybatis-config.xml"})
public class UserServiceTest extends AbstractTransactionalJUnit4SpringContextTests{
	
	Logger logger=LoggerFactory.getLogger(UserServiceTest.class);
	
	@Autowired
	private PerUserService perUserService;
	
	@Autowired
	private PerUserMapper perUserMapper;
	
	@Test
	public void PerUserTest () {
		logger.debug("*********测试开始了");
		Date date=new Date();
		PerUser user=new PerUser();
		user.setUserName("x872731861");
		user.setPassWord("123456");
		user.setAge("17");
		user.setAddress("江西九江");
		user.setCreateTime(date);
		user.setUpdateTime(date);
		try{
			int count=perUserMapper.insertSelective(user);
			System.out.println("更新了 ："+count+" 条数据");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
