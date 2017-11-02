package hello;

import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hello.beans.InputHolder;

@SpringBootApplication
public class RApplication 
{
	private static String SAVED_INPUT;
	
	@Autowired
	InputHolder holder;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter input String here");
		
		String inputtedText = scan.next();
		scan.close();
		SAVED_INPUT = inputtedText;
        SpringApplication.run(RApplication.class, args);
    }
	
	@PostConstruct
	public void populateInputHolder()
	{
		holder.setInputText(SAVED_INPUT);		
	}
	
}