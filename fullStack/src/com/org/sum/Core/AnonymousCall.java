package com.org.sum.Core;

import java.io.File;
import java.io.FileFilter;

public class AnonymousCall {
	 
	public static void main(String[] args) {
		
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.getName().endsWith(".java");
			}
		};
		
		File dir = new File("D:\\Test");
		File[] files = dir.listFiles(filter);
		
		for (File f : files){
			System.out.println(f);
		}
	}
}
