package hello;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.beans.InputHolder;
import hello.helpers.VehicleDetailBuilder;

@SpringBootApplication
public class RApplication 
{
	private static String SAVED_INPUT;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter input String here");
		
		String inputtedText = scan.next();
		scan.close();
		SAVED_INPUT = inputtedText;
        SpringApplication.run(RApplication.class, args);
    }
	
	@Bean
	public InputHolder inputHolder()
	{
		InputHolder holder = new InputHolder();
		holder.setInputText(SAVED_INPUT);
		return holder;
		
	}
	
}