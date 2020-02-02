package homeworkJan31;

public class HomeworkJan31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///Arithmetic	operators
		
		int firstNumber = 16;
		int secondNumber = 34;
		int thirdNumber = 46;
		int fourthNumber = 72;
		
		int additionResults = firstNumber + fourthNumber;
		int subtractionResults = fourthNumber - thirdNumber;
		int multiplicationResults = thirdNumber * 4;
		int divisionResults = secondNumber/4;
		int modulaResults = thirdNumber%fourthNumber;
		
		int postIncrementResults = thirdNumber++;
		int postDecrementResults = thirdNumber--;
		
		System.out.println("Added Results are = " + additionResults);
		System.out.println("Substracted Results are =" +subtractionResults);
		System.out.println("Multiplied Results are = " +multiplicationResults);
		System.out.println("Divided Results are = " +divisionResults);
		System.out.println("The Modula Results are = " +modulaResults);	
		System.out.println("Incremented Results are = " +postIncrementResults);
		System.out.println("Decremented Results are = " +postDecrementResults);
		
		//////// Relational Operators
		
		long number1 = 4563;
		long number2 = 756;
		long number3 = 213;
		long number4 = 1985;
		long number5 = 1992;
		boolean equals = number1 == number5;
		boolean notEquals = number3 !=22;
		boolean greaterThan = number5>33332;
		boolean lessThan = number4 < number5;
		boolean greaterThanOrEqualTo = number1 >= number2;
		boolean lessThanOrEqualTo = number4 <= 234234;
		System.out.println("equals Results are = " + equals);
		System.out.println("notEquals Results are = " + notEquals);
		System.out.println("greaterThan Results are = " + greaterThan);
		System.out.println("lessThan Results are = " + lessThan);
		System.out.println("greaterThanOrEqualTo Results are = " + greaterThanOrEqualTo);
		System.out.println("lessThanOrEqualTo Results are = " + lessThanOrEqualTo);
		
		

			//Logical Operators
			
		int a = 18;
		int b = 24;
		int c = 52;
		int d = 13;
		
		boolean booleanResults1 = ((a==b)&&(c==d));
		boolean booleanResults2 = ((a==b)||(c==d));
		boolean booleanResults3 = !((a==b)&&(c==d));
		
		System.out.println(booleanResults1);
		System.out.println(booleanResults2);
		System.out.println(booleanResults3);
		
		
			
			//////////////
			// Assignment Operators
			
			int f = 1;
			int g = 3;
			int h = 5;
			int j = 6;
			
			System.out.println(f); //1
			
			f = f + g;
			f+=g;
			System.out.println(f); //4
			
			h = h-j;
			System.out.println("h is " + h);
			h -=j;
			// + is Concatenation
			System.out.println("h is ".concat(" helloWorld "));
			System.out.println("h is " + h);
					
		
			j*=f;
			System.out.println("f is " + j);
			j/=g;
			System.out.println("g is " + j);
			j%=f;
			System.out.println("j is " + j);
			a<<=c;
			System.out.println(f);
		
		
		
	}

}
