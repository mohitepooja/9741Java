public class StringExample {

	public static void main(String[] args) {
		String str1="Java Is The Most Useful Language.";
		System.out.println("the length of the string is "+str1.length());
		System.out.println("The string upper letters= "+str1.toUpperCase());
		System.out.println("The string lower letters= "+str1.toLowerCase());
		String str2="Learning Java is important";
		System.out.println(str1.concat(str2));
		System.out.println(str1.charAt(1));
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(5,16));
		System.out.println(str1.replace("Useful","Joyful"));
		

	}

}
