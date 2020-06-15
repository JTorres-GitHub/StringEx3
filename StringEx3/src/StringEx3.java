import java.util.Scanner;

public class StringEx3 {
	public static String makeTags(String str1, String str2){
		String code;
		
		code = "<" + str1 + ">" + str2 + "</" + str1 + ">";
		
		return code;		
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String tag;
		String contents;
		
		System.out.println("Input the tag name: ");
		tag = input.nextLine();
		
		System.out.println("Input the string content: ");
		contents = input.nextLine();
		
		System.out.println(makeTags(tag, contents));
		
		input.close();
	}
}
