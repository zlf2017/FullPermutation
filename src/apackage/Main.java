package apackage;
/**
 * @author zlf
 *
 */
public class Main {
	private static int count=0;
	public static void main(String[] args) {
		String str = "abcd";
		generate(str.toCharArray(),0);
	}
	private static void generate(char[] charArray,int begin){
		if(begin==charArray.length - 1) {
			count++;
			System.out.print(count + " " );
			System.out.println(charArray);
			return;
		}
		for(int i=begin;i<charArray.length;i++) {
			swap(charArray, begin, i);
			generate(charArray, begin+1);
			swap(charArray, begin, i);
		}
	}
	private static void swap(char[] strArray,int i,int j) {
		char temp=strArray[i];
		strArray[i]=strArray[j];
		strArray[j]=temp;
	}
} 
