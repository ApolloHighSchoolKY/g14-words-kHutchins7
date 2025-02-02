import java.util.List;
import java.util.ArrayList;

public class Word
{   
	//insteince field(variable)
	private String word;

	//class field(variable)
	private static final String VOWELS = "AEIOUaeiou";   //static means only one


	public Word()
	{ 
      word = "triangle";
	}

	public Word(String newWord)
	{
		setWord(newWord);
	}

	public void setWord(String newWord)
	{
		word = newWord;
	}

	public int getNumVowels()
	{
       int count = 0;
		//Loop for every letter in "word"
		//for (int i=word.length()-1;i >=0;i--)
		for(int i =0; i<word.length(); i++)
		{
			//if (VOWELS.indexOf(( ""+ word.charAt(i)))>-1)
			if(VOWELS.indexOf(word.substring(i,i+1))>-1)
			{
				count++;
			}
		}
			//Use indexOf to see if the letter is in the string "vowels"


		return count;
	}

	public int getLength()
	{
       return word.length();
	}

	public String toString()
	{
	   return word;
	}
}