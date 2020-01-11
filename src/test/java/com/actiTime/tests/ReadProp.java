/**
 * 
 */
package com.actiTime.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

/**
 * @author Poornima
 *
 */
public class ReadProp {
	
	@Test
	public void testA() {
		File f=new File("./src/test/resources/testdata/input.properties");
		try {
			FileInputStream fis=new FileInputStream(f);
			Properties p=new Properties();
			p.load(fis);
			String un=p.getProperty("un");
			System.out.println("un : "+un);
			
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
