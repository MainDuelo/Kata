package amusements.fizzbuzz;

import java.util.ArrayList;

public class Game {
	public static final String FIZZ = "Fizz";
	public static final String BUZZ = "Buzz";
	public static final String FIZZBUZZ = "FizzBuzz";
	
	ArrayList<Rule> rule = new ArrayList<Rule>();
    public Game(){   	
        FizzBuzz fizzbuzz = new FizzBuzz();
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();
        
        rule.add(fizzbuzz);
        rule.add(fizz);
        rule.add(buzz);      
    }
            
    public String fizzBuzz(int value){
        for(Rule rule1 : rule){
            if(rule1.checkValue(value)){
                return rule1.getValue();
            }     
        }
        return String.valueOf(value);    
    }
	
}
