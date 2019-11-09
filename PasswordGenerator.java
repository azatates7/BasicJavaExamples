package passgen;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

	public class PasswordGenerator {

	  private static final String symbols =
			  	"ABCDEFGJKLMNPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzx*?-_+#0123456789";  
	  private static final SecureRandom sr = new SecureRandom(); 
	  private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter Your Key Length : ");
		int length = scanner.nextInt(); 
		
		System.out.print("Give ME A Special Character : ");
		char specialcharacter = scanner.next().charAt(0);
		char[] buff = new char[length]; 
		
		for (int index = 0; index < buff.length; ++index) {
			  buff[index] = symbols.charAt(sr.nextInt(symbols.length())); 
			  buff[0] = specialcharacter;
		}
		      
		
		   //System.out.println(new String(buff));
		   char aa[]  = buff;
		   Character[] arr = new Character[buff.length];
		   int i = 0;
		   for(char value : aa) {
			   arr[i++] = Character.valueOf(value);
		   }
		   
		   scanner.close();
		   
	    List<Character> chl = Arrays.asList(arr);
		Collections.shuffle(chl);
		StringBuilder sb = new StringBuilder();
		   for(Character ch : chl){
			   sb.append(ch); 
		   }
		String key = sb.toString();
		System.out.println("Your Key : "+key);
	}

}