package com.test;

import com.github.pagehelper.PageHelper;
import com.test.service.TUserService;
import com.test.service.TestInterface;
import com.test.util.ChineseNameUtil;
import com.test.vo.Tuser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.security.MessageDigest;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：JunitTest
 * @date ：2018/2/26 18:02
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-*.xml"})
public class JunitTest {

	@Resource
	TUserService tUserService;

	@Autowired
	TestInterface aTestInterface;
	@Test
	public void test()throws Exception{
		for(int i=0;i<1000;i++){
		Tuser userVo = new Tuser();
		userVo.setUserName(ChineseNameUtil.getChinesName());
		//userVo.setUserName("张三");
		//Math.random();
		userVo.setPhone(getTel());
		userVo.setIsLimit(1);
		//PrivateKey privateKey = SignatureUtils.getRsaPkcs8PrivateKey(Base64.decodeBase64("qixuewei"));
		//byte[] sign = SignatureUtils.sign(SignatureAlgorithm.SHA1WithRSA, privateKey, "123456");
		//String password = Base64.encodeBase64String(sign);
		String password = md5Util("12345");
		userVo.setPassword(password);
		userVo.setRegDate(new Date());

			tUserService.insert(userVo);
		}
	}

	/**
	 * 随机生成手机号
	 */
	private static String[] telFirst="134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153,176,177".split(",");
	private static String getTel() {
		String number = telFirst[(int)Math.random()*(telFirst.length)];
		Random  random= new Random();
		for (int j=0;j<8;j++){
			   number+=random.nextInt(9);
		}
		System.out.println(number);
	   return number;
	}

	/**
	 * md5加密
	 */

	public String md5Util(String str) throws Exception {
		MessageDigest md5 = MessageDigest.getInstance("md5");
		byte[] digest = md5.digest(str.getBytes());

		//Base64编码  它的作用是用于将非ascii码转成ascii码
		BASE64Encoder b64 = new BASE64Encoder();
		return b64.encode(digest);
	}
	@Test
	public void test2(){

		//aTestInterface.testInterface();
		PageHelper.startPage(2,10);
		List<Tuser> userVos = tUserService.selectByPage();
		System.out.println(userVos.size());
		for (Tuser userVo:userVos){
			System.out.println(userVo.toString());
		}
	}

	@Test
	public void test3(){
		String str ="j";
		str.substring(1).replaceAll("","*");
		System.out.println(str.substring(0,1)+str.substring(1).replaceAll("\\S","*"));
	}
}





















