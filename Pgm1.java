import java.util.Scanner;
	public class Pgm1{

	    public static String reverse(String str,int index)
	    {
	        if (index<str.length())
	        {
	            return reverse(str,index+1)+str.charAt(index);
	        }
	        else
	        {
	           return " ";
	        }  
	    }

	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string.");
	        String input= sc.next();
	        String ans=reverse(input,0);
	        System.out.println("The reverse is:"+ ans );
	        sc.close();
	    }
    }
