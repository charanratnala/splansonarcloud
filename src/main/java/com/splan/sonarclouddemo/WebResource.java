package com.splan.sonarclouddemo;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class WebResource {

	@GetMapping("/getMessage")
	public void Games_zone() {

		
           // this wiil through exception
		String nullString = null;
	Integer leng=	nullString.length();

	}
	 public void resourceLeak() {
	        BufferedReader reader = null;
	        try {
	            reader = new BufferedReader(new FileReader("somefile.txt"));
	            String line = reader.readLine();
	            System.out.println(line);
	        } catch (IOException e) {
	            e.printStackTrace(); // Use of System.out instead of a logger (Maintainability)
	        } finally {
	            // Resource not closed properly (Reliability)
	        }
	    }
	 
	 
	 
	 
	 public void hardcodedPassword() {
	        String password = "12345"; // Hardcoded password (Security)
	        System.out.println("Password: " + password);
	    }
	 
	 
	 public void unusedVariable() {
	        int unused = 42; // Unused variable (Maintainability)
	    }
	 
	 
	 public void largeMethod() {
	        // Method too large, should be refactored (Maintainability)
	        for (int i = 0; i < 100; i++) {
	            System.out.println("This is a large method.");
	        }
	    }

}
