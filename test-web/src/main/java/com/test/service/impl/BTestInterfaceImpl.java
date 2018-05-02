package com.test.service.impl;

import com.test.service.TestInterface;
import org.springframework.stereotype.Service;

/**
 * @author ：Qxw
 * @Description ：
 * @ClassName ：BTestInterfaceImpl
 * @date ：2018/4/25 17:41
 */
@Service("bTestInterface")
public class BTestInterfaceImpl implements TestInterface {
	@Override
	public void testInterface() {
		System.out.println("22222");
	}
}
