package IncludeAllThings.java;

 class NumberReverse {
	
	    public int reverseNumber(int number) {
	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        return reversedNumber;
	    }

	    public void displayResult(int number) {
	        System.out.println("Original number: " + number);
	        System.out.println("Reversed number: " + reverseNumber(number));
	    }



		public static void main(String[] args) {
			

		}

	}

	  class ExtendedNumberReverser extends NumberReverse {
	  //  @Override
	    public int reverseNumber(int number) {
	        int reversedNumber = super.reverseNumber(number);
	        // Add some additional logic if needed
	        return reversedNumber;
	    }

	   // @Override
	    public void displayResult(int number) {
	        System.out.println("ExtendedNumberReverser Display Result:");
	        super.displayResult(number);
	    }

	    public void displayResult(double number) {
	        System.out.println("ExtendedNumberReverser Display Result:");
	        displayResult((int) number); // Call the existing displayResult method with integer argument
	    }

	    public void displayResult(int number1, int number2) {
	        System.out.println("ExtendedNumberReverser Display Result:");
	        System.out.println("Number 1: " + number1);
	        System.out.println("Number 2: " + number2);
	        System.out.println("Reversed Number 1: " + reverseNumber(number1));
	        System.out.println("Reversed Number 2: " + reverseNumber(number2));
	    }
	
	    public class Main {
	    
	    }


		    public static void main(String[] args){
		        ExtendedNumberReverser reverser = new ExtendedNumberReverser();
		        int number = 12345;
		        reverser.displayResult(number);

		        double doubleNumber = 98765.4321;
		        reverser.displayResult(doubleNumber);

		        int number1 = 111;
		        int number2 = 222;
		        reverser.displayResult(number1, number2);
		       
		    }
	  }
	  
		

