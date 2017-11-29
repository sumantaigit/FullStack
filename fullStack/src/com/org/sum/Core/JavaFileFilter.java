package com.org.sum.Core;

import java.io.File;
import java.io.FileFilter;

public class JavaFileFilter implements FileFilter{
	 
	public boolean accept(File file){
		return file.getName().endsWith(".java");
	}
	
	FileFilter fileFilter2 = new FileFilter() {
		
		@Override
		public boolean accept(File pathname) {
			// TODO Auto-generated method stub
			return pathname.getName().endsWith(".java");
		}
	};
	
	FileFilter fileFilter3 = (File pathname) -> pathname.getName().endsWith(".java");

	FileFilter fileFilter = new JavaFileFilter();
	File dir = new File("D:\\Test\\Testing.java");
	File[] javaFiles = dir.listFiles(fileFilter2);
}
