package cn.springmvc.dao;

import cn.springmvc.model.PerUser;

public interface PerUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PerUser record);

    int insertSelective(PerUser record);

    PerUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PerUser record);

    int updateByPrimaryKey(PerUser record);
}