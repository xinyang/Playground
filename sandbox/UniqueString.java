import java.util.Arrays;

public class UniqueString
{
    
    public static boolean isUnique(String s) 
    {
	boolean isUnique = false;
	char[] cArray = s.toCharArray();
	Arrays.sort(cArray);
	for (int i = 0; i < s.length() - 1; i++)
	    if (cArray[i] == cArray[i+1]) isUnique = true;
	return isUnique;
    }
    
    public static void main(String[] args)
    {
	String s1 = "whatevercadaver";
	String s2 = "palindrome";

	System.out.println(isUnique(s1));
	System.out.println(isUnique(s2));
    }
    
}