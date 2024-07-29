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

		String nullString = null;
           // this wiil through exception
		System.out.println(nullString.length());

	}
	public void resourceLeak() {
        try (BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"))) {
            String line = reader.readLine();
            System.out.println(line);
            // Reader is not closed
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
