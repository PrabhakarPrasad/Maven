package com.maven.Utility;

import java.util.Set;

import com.maven.Base.TestBase;

public class MultipleWindow extends TestBase {
	public void SwirchToWindow(){
		String Parent=driver.getWindowHandle();
		Set<String> AllWindows=driver.getWindowHandles();
		int size=AllWindows.size();
		System.out.println(size);
		for (String next : AllWindows) {
			if(!Parent.equalsIgnoreCase(next)){
				driver.switchTo().window(next);
			}
			
		}
		
	}

}
