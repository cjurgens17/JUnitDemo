package com.chrisjurgens;

public class Utilities {
    //returns a char array containing every nth char. When
    //sourceArray. length<n, returns sourceArray
    public char[] everyNthChar(char[] sourceArray, int n){

        if(sourceArray==null || sourceArray.length < n){
            return sourceArray;
        }

        int returnedLength = sourceArray.length/n;
        char[] result = new char[returnedLength];
        int index = 0;

        for(int i = n-1;i< sourceArray.length; i += n){
            result[index++] = sourceArray[i];
        }
        return result;
    }
    //Removes pairs of the same character that are next
    //to each other, by removing one occurence of the character.
    //"ABBCDEEF" -> "ABCDEF"
    public String removePairs(String source) {

        //if length is less than 2, there wont be any pairs
        if(source == null || source.length()< 2){
            return source;
        }

        StringBuilder sb = new StringBuilder();
        char[] string = source.toCharArray();
      int i = 1;

      while(i<string.length){
            if(string[i-1] != string[i]){
                sb.append(string[i-1]);
            }
            i++;
      }

      char last  = string[string.length-1];
      //add final character because it is always safe
      sb.append(last);
        return sb.toString();
    }

    //perform a conversion based on some internal
    //business rule
    public int converter(int a, int b){
        return (a/b) + (a * 30) -2;
    }

    public String nullIfOddLength(String source){
        if(source.length() % 2 == 0){
            return source;
        }
        return null;
    }
}
