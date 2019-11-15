package cracking.coding.interview;/*
---------------------------------------------------------------------------------------------------------------------
Program Title: GooglePrep 
Program Description:
---------------------------------------------------------------------------------------------------------------------

---------------------------------------------------------------------------------------------------------------------
PROBLEM: Implement an algorithm to determine if a string has all unique characters.
What if you can't use additional data structure
ALGORITHM:
create a hash table of characters
loop thru the entire string
take each element of the string and save it to a current char
if any element already had a key in the hash table, return false
otherwise , after all of this, return true

without additional data structure?

loop thru string
save current element as a character
for each of these characters, compare it to every other character
this is O(n^2) time


a clever solution is to sort the array, and then compare each invididual element
to its neighbor. if any element equals its neighbor, then there is a duplicate.
This is o(n) time, however the bottleneck is the sort at O(n log n)

_____________________________________________________________________________________________________________________
IMPORTED PACKAGES:

_____________________________________________________________________________________________________________________
//ACTUAL PROGRAM:*/
import java.util.*;

public class isUnique {
    public static void main(String[] args) {
       String a = "abcdefghijklmnopqrstuvwxyz";
       String b = "abcdefghijklmnopqrstuvwxyza";
       String c = "abcdefghijklmaaaaaaaaaa";
       String d = null;
       String e = "07twelveZ80z";
       String f = "qwerty1234567890QWERTYasdfASDFzxcvZXCV";

       System.out.println("UNIQUE 1");
       System.out.println(unique(a));
       System.out.println(unique(b));
       System.out.println(unique(c));
       System.out.println(unique(d));
       System.out.println(unique(e));
       System.out.println(unique(f));

       System.out.println("UNIQUE 2");
       System.out.println(unique2(a));
       System.out.println(unique2(b));
       System.out.println(unique2(c));
       System.out.println(unique2(d));
       System.out.println(unique2(e));
       System.out.println(unique2(f));

    }

    private static boolean unique(String s) {
        if (s == null) {
            return true;
        }
        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (hashtable.containsKey(current)) {
                return false;
            } else {
                hashtable.put(current, 1);
            }
        }
        return true;
    }

    private static boolean unique2(String s) {
        if (s == null) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                char ahead = s.charAt(j);
                //System.out.println("current: " + current + " ahead: " + ahead);
                if (current == ahead) {
                    return false;
                }
            }
        }

        return true;
    }
}
