package com.test.mapper;

import com.test.vo.Tuser;

import java.util.List;

public interface TuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    Tuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);

	List<Tuser> selectByPage();
}