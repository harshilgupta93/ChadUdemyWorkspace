package com.luv2code.spring._021_Exercise_DI_Annotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private  List<String> fortunes;
	
	private Random randomNumber = new Random();
	
	public FileFortuneService() {
		System.out.println(">> inside default constructor: FileFortuneService()");
		
		fortunes = new ArrayList<String>();
		
		String fileName = "/home/me/Desktop/chadSpring/DevEnv/ChadUdemyWorkspace/SpringCore/src021_Exercise_DI_Annotation/fileName.txt";
		System.out.println("Reading Fortune from File: " + new File(fileName));
		System.out.println("File Exists: " + new File(fileName).exists());
		
		try(BufferedReader br = 
				new BufferedReader(
						new FileReader(
								new File(fileName)))) {
			
			String tempString;
			while( (tempString = br.readLine()) != null ){
				fortunes.add(tempString);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = randomNumber.nextInt(fortunes.size());
		String fortuneString = fortunes.get(index);
		return fortuneString;
	}
}
