
public class Operators {
	public static void main(String[] args){
		//Increment and Decrement
		int a = 0; 
		int b = a++; //incremented after assigning
		int c = ++a; //incremented before assigning
		b = a--;	//decremented after assigning
		c = --a;	//decremented before assigning
		
		//More and Less Unary: + and -
		int x = +3; // x receive the value positive 3
		x = -x; //x receive -3, in this case
		
		//Inversion Bits: ~~
		int i = ~1; // 1 = -2 (the bits were inverted)
		
		//boolean complement: !
		boolean falsehood = ! (true); //invert the value boolean
		
		//Conversion of types: (types)
		double d = 1.99;
		int i = (int) d; //convert double for int (lost of precision)
		
		//Multiplication and Division: * and /
		int one = 3 / 2; //division of integers generate an integer
		float oneAndmiddle = (float) 3 / 2;	// arithmetic promotion occurs for float 
		double xyz = oneAndmiddle * one;	//arithmetic promotion occurs for float
		
		//module: %
		int resto = 7 % 2; //rest = 1
		
		//addiction and subtraction: + e -
		long l = 1000 + 4000;
		double d = 1.0 - 0.01;
		
		//Concatenation
		long var = 123456;
		String str = "O valor de var é " + var;
		
		String str = "O valor de var é " + Long.toString(var);
		
		//Ordinal comparison: >, >=, < and <=
		boolean b = (10<3);
		boolean w = (x<=y);
		if(x>=y){ }
		
		//instanceof operator
		String str = "A String";
		if(str instanceof String ){ } //true
		if(str instanceof Object ){ } //true
		
		//Equality comparison: == and !=
		if(abc == 10){ }
		boolean b = (xyz != 50);
		if(refObj1 == refObj2){ }
		
		//Logic operators: && and ||
		if((a>10) && (b<5)){
			//this
		}
		if((x==y || (b<5))){
			//that
		}
		boolean b = x && y || z;
		
		//Conditional operator: ?
		int x = 10;
		int y = (x>10) ? x : x+1;
		
		//Attribution operators
		int i = 10;
		int two  = 1;
		two += 1; //two = two + 1;
		
		int five = 7;
		five -= 2; //five = five - 2;
		
		int ten = 5;
		ten *= 2; //ten = ten * 2;
		
		int four = 12;
		four /= 3; // four = four / 3;	
	}
}
