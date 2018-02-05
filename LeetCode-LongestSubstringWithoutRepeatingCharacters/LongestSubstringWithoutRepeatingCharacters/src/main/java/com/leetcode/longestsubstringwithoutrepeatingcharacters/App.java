package com.leetcode.longestsubstringwithoutrepeatingcharacters;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getLongestSubstringWithoutRepeatingCharacters("abcabcbb"));
    }

    public static int getLongestSubstringWithoutRepeatingCharacters(String text)
    {
        String result = "";
        for(int i=0; i<text.length(); i++)
        {
            CharSequence cs = ""+text.charAt(i);
            if(!result.contains(cs))
            {
                result+=(cs);
            }
        }
        if(result.length()>0)
            return result.length();
        else
            return 0;
    }
}
