package cn.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.PerUserMapper;
import cn.springmvc.model.PerUser;
import cn.springmvc.service.PerUserService;
@Service("perUserService")
public class UserServiceImpl implements PerUserService{
	@Autowired
	private PerUserMapper perUserMapper;

	public int deleteByPrimaryKey(Long id) {
		int count=perUserMapper.deleteByPrimaryKey(id);
		return count;
	}

	public int insert(PerUser record) {
		int  count=perUserMapper.insert(record);
		return count;
	}

	public int insertSelective(PerUser record) {
		int  count=perUserMapper.insertSelective(record);
		return count;
	}

	public PerUser selectByPrimaryKey(Long id) {
		PerUser result=perUserMapper.selectByPrimaryKey(id);
		return result;
	}

	public int updateByPrimaryKeySelective(PerUser record) {
		int count=perUserMapper.updateByPrimaryKeySelective(record);
		return count;
	}

	public int updateByPrimaryKey(PerUser record) {
		int count=perUserMapper.updateByPrimaryKey(record);
		return count;
	}

	

	

}
