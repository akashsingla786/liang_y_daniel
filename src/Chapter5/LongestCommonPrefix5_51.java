package Chapter5;

import java.util.Scanner;

public class LongestCommonPrefix5_51 {
public static void main(String ar[]) {
	Scanner input = new Scanner(System.in);

	// Prompt the user to enter two strings
	System.out.print("Enter the first string: ");
	String string1 = input.nextLine();
	System.out.print("Enter the second string: ");
	String string2 = input.nextLine();

	
	int index = 0;				// Initialize index to 0
	String prefix = "";		// Initialize prefix as empty string

	// Get the largest commmon prefix of the two strings
	while (string1.charAt(index) == string2.charAt(index)) {
		prefix += string1.charAt(index);
		index++;
	}

	// Display the result
	if (prefix.length() > 0)
		System.out.println("The commmon prefix is " + prefix);
	else
		System.out.println(string1 + " and " + string2 +
			" have no commmon prefix");
}
}
