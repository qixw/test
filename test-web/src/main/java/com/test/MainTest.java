package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：MainTest
 * @date ：2018/3/19 11:10
 */
public class MainTest {

	public static void main(String[] args) {
			String idNo="421221199210032637";
			int year = Integer.parseInt(idNo.substring(6, 10));
		System.out.println("year:"+year);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			Date update = null;
			try {
				update = sdf.parse(String.valueOf(year + 18) + idNo.substring(10, 14));
				System.out.println("update          :"+update);
			} catch (ParseException e) {
				//log.info("身份证不正确：" + idNo);
			}

			Date today = new Date();
		System.out.println(today.after(update));
	}
}
