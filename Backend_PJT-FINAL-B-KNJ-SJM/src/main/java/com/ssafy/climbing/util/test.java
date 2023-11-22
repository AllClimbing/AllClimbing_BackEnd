package com.ssafy.climbing.util;

import java.io.File;
import java.io.IOException;

import org.springframework.util.FileCopyUtils;

public class test {
	
	public static void main(String[] args) {
		
		File target = new File("C:\\uploadTemp\\2023-11-22", "이건왜 문제가없지");
		try {
			FileCopyUtils.copy("시발시발시발".getBytes(), target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
