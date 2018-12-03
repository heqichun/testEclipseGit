package com.heqichun.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 该程序统计建设网访问记录，统计结果为用户id以及该用户操作的项目ID和项目总数
 * @author 、
 *
 */
public class TcbciUtil {
	public static void main(String[] args) {
		File file=new File("D:\\test.txt");
		BufferedReader reader=null;
		String temp=null;
		Map<String,List<String>> map =  new HashMap<String,List<String>>();
		try {
			reader=new BufferedReader(new FileReader(file));
			while((temp=reader.readLine())!=null){
				String[] list = temp.split("\t");
				if(!map.containsKey(list[5])) {
					 List l = new ArrayList<String>(); 
					 l.add(list[3]);
					 map.put(list[5], l);
				}else {
					if(!map.get(list[5]).contains(list[3])) {
						map.get(list[5]).add(list[3]);
					}
				}
			}
			for(String k : map.keySet()) {
				System.out.print(k+": ");
				for(String s : map.get(k)) {
					System.out.print(s+ " ");
				}
				System.out.print("项目数："+""+map.get(k).size()+"");
				System.out.println();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
