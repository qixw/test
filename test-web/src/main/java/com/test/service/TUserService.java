package com.test.service;

import com.test.vo.Tuser;

import java.util.List;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：TUserService
 * @date ：2018/2/27 14:53
 */
public interface TUserService {

	public Integer insert(Tuser userVo);

	List<Tuser> selectByPage();
}
