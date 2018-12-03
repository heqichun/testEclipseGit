package com.heqichun.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZhaoBiaoUtils {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\py_anaylsis_20181201_missing.txt");
		FileWriter writer = new FileWriter("D://test5.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		BufferedReader reader=null;
		String temp=null;
		Map<String,List<String>> map =  new HashMap<String,List<String>>();
		int i = 0;
		try {
			reader=new BufferedReader(new FileReader(file));
			while((temp=reader.readLine())!=null){
				String[] l = temp.split("}");
				bw.write(l[0]+"}");
				bw.newLine();
				System.out.println(++i);
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
