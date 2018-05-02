package com.jlc.test;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：TestDemo
 * @date ：2017/8/15 13:36
 */
public class TestDemo {

	public static void main(String[] args) throws Exception {
		//readAndWrite();
		/*File file = new File("D:\\pro_temp\\test");
		if (!file.exists() && !file.isDirectory()){
			file.mkdirs();
		}*/
		/*String str ="1234";
		System.out.println(Long.valueOf(str));
		//BigDecimal amt = new BigDecimal(11.95888);
		//System.out.println(amt.setScale(2,BigDecimal.ROUND_DOWN));
		Hashtable hashtable = new Hashtable();
		HashMap hashMap = new HashMap();*/
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		HashMap<String,Object> haspmap = new HashMap();

		haspmap.put("Zara", new Double(3434.34));
		haspmap.put("Mahnaz", new Double(123.22));
		haspmap.put("Ayan", new Double(1378.00));
		haspmap.put("Daisy", new Double(99.22));
		haspmap.put("Qadir", new Double(-19.08));
		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(19.08));

		// Show all balances in hash table.
		names = balance.keys();
		while(names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " +
					balance.get(str));
		}
		System.out.println();
		// Deposit 1,000 into Zara's account
		bal = ((Double)balance.get("Zara")).doubleValue();
		balance.put("Zara", new Double(bal+1000));
		System.out.println("Zara's new balance: " +
				balance.get("Zara"));
	}

	public static  int muti(int m) {
		if (m < 0) {

			return 0;
		}
		else if (m == 1) {

			return 1;
		} else {

			return m * muti(m - 1);
		}
	}


	//文件读取与输出

	public static void  readAndWrite()throws Exception{
		try {
			File readFile = new File("D://test.txt");
			FileInputStream fileInputStream = new FileInputStream(readFile);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String temp ="";
			StringBuffer sb=new StringBuffer();

			File writeFile = new File("D://1.txt");
			FileOutputStream fileOutputStream = new FileOutputStream(writeFile);
			PrintWriter pw = new PrintWriter(fileOutputStream);
			for (int a=1;(temp=bufferedReader.readLine())!=null;a++){
				sb.append(temp);
				sb.append("\r\n");
			}
			pw.write(sb.toString().toCharArray());
			pw.flush();
			fileInputStream.close();
			inputStreamReader.close();
			bufferedReader.close();
			fileOutputStream.close();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
