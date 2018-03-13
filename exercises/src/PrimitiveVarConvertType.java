
public class PrimitiveVarConvertType {

	public static void main(String[] args) {
		double d = 1.99d;
		int i = (int) d; //i receive the value 1
		
		short s = 15;
		long x = s; //widening convert
		long y = (long) s; //It isn't need
	}

}
