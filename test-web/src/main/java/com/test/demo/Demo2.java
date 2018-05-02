package com.test.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：Demo2
 * @date ：2018/4/16 16:22
 */
public class Demo2 {

	public static void main(String[] args) {


		/*try {
			//int i =1/0;
			Map map = new HashMap<String,String>() ;
			map.put("a","1");
			map.put("b","2");
			map.put("bb","3");
			map.put("ca","14");
			Iterator iterator = map.entrySet().iterator();
			while (iterator.hasNext()){
				Map.Entry entry =(Map.Entry) iterator.next();
				Object key = entry.getKey();
				//System.out.println(key);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}  finally {
			//i+=1;
			System.out.println("11111111111");
		}
		int a=2;
		System.out.println(a);*/

		char ac[] = {
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
		};
		StringBuilder stringbuffer = new StringBuilder();
		Random random = new Random();
		for (int j = 0; j <30; j++) {

			stringbuffer.append(ac[random.nextInt(ac.length)]);
		}

		/*System.out.println(stringbuffer.toString());
		System.out.println(new Random().nextInt(3));
		System.out.println("pre.all".substring("pre".length()+1));
		System.out.println("pre".length());*/
		//System.out.println(new Random().nextInt(3));
	//	System.out.println(new DateTime(new DateTime().plusDays(7).toDate()).toString("yyyyMMdd"));
		//System.out.println(new SimpleDateFormat("yyyyMMdd").format(new DateTime().plusDays(7).toDate()));
		 test("1");

	}

	public static void test(String a){
		List list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		for (int i=0;i<list.size();i++){
			if (a.equals(list.get(i))){

				list.remove(i);
			}
		}
	}
}
