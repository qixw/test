package com.test.service.impl;

import com.test.service.TestInterface;
import org.springframework.stereotype.Service;

/**
 * @author ：Qxw
 * @Description ：
 * @ClassName ：ATestInterfaceImpl
 * @date ：2018/4/25 17:40
 */
@Service("aTestInterface")
public class ATestInterfaceImpl implements TestInterface {
	@Override
	public void testInterface() {
		System.out.println("1111");
	}
}
