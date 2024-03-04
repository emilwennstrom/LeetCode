public class RomanToInt {

	// IV = 4
// IX = 9
// XL = 40
// XC = 90
// CD = 400
// CM = 900

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}


	public static int romanToInt(String s) {

		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		return 0;
	}


}
