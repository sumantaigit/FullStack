package com.org.sum.Core;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

public static void main(String[] args) {
		
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("D:\\Test");
		File[] files = dir.listFiles(filterLambda);
		
		for (File f : files){
			System.out.println(f);
		}
	}	
}
