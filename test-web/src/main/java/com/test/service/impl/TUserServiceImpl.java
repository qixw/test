package com.test.service.impl;

import com.test.mapper.TuserMapper;
import com.test.service.TUserService;
import com.test.vo.Tuser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：TUserServiceImpl
 * @date ：2018/2/27 14:54
 */
@Component
public class TUserServiceImpl implements TUserService {

	@Autowired
	TuserMapper tUserMapper;
	@Override
	public Integer insert(Tuser userVo) {
		return tUserMapper.insert(userVo);
	}

	@Override
	public List<Tuser> selectByPage() {
		return tUserMapper.selectByPage();
	}
}
