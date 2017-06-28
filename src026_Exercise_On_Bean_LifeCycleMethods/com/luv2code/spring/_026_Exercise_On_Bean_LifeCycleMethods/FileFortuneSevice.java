package com.luv2code.spring._026_Exercise_On_Bean_LifeCycleMethods;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneSevice implements FortuneService {

	private List<String> fortunes;
	
	private Random randomNumber = new Random();
	
	public FileFortuneSevice() {
		System.out.println(">> inside default constructor: FileFortuneSevice()");
	}
	
	@PostConstruct
	public void doSomeStartUpStuff(){
		System.out.println(">> inside init method: doSomeStartUpStuff()");
		
		fortunes = new ArrayList<String>();
		
		String pathName = "/home/me/Desktop/chadSpring/DevEnv/ChadUdemyWorkspace/SpringCore/src026_Exercise_On_Bean_LifeCycleMethods/fileName.txt";
		System.out.println("Reading Fortunes from the file: " + new File(pathName));
		System.out.println("Required File Exists: " + new File(pathName).exists());
		
		try( BufferedReader br =
				new BufferedReader(
						new FileReader(
								new File(pathName)))) {
			String tempString;
			while( (tempString = br.readLine()) != null){
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
