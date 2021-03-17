
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JOptionPane;


public class WordSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uniqueWords;
		Set<String> words = new TreeSet<String>();

		uniqueWords = JOptionPane.showInputDialog("Please write as much as you want into one String\n"
				+ " and i will add each unique word\n" + " into a Tree Set and add them in alphabetical order. \n ");

		System.out.println("This is what you wrote: " + uniqueWords);

		StringTokenizer defaultTokenizer = new StringTokenizer(uniqueWords);
		while (defaultTokenizer.hasMoreTokens()) {
			words.add(defaultTokenizer.nextToken());
		}

		System.out.println("The same words you wrote but in alphabetical order: " + words);

	}

}
