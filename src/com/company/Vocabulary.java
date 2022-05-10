package com.company;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Vocabulary {
    public static void main(String[] args) {
        int count = 'z' - 'a' + 1;
        System.out.println(count);
        List<String> vocabulary = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("src/com/company/vocabulary.txt"))) {
            String s;
            do {
                s = br.readLine();
                if (s != null) vocabulary.add(s);


            } while (s != null);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Size of vocabulary: " + vocabulary.size());
        Collections.sort(vocabulary);
        vocabulary.stream().forEach(System.out::println);
    for(int i=0;i<10;i++)
    {
        System.out.println(vocabulary.get(i));
      }
        for(int i =vocabulary.size()-1; i>vocabulary.size()-11; i--)
            System.out.println(vocabulary.get(i));
        int max =0;
        for (String s:vocabulary)
            if(max<s.length()){max=s.length();
                System.out.println(s);}
        System.out.println(max);
            int[] hist =new int[max];
for( String s:vocabulary)
    hist[s.length()-1]++;
for (int i=0; i<max;i++)
    System.out.printf("%d-%d%n",i+1,hist[i]);
//Палиндромы
for (String s:vocabulary)
    if(s.equals((new StringBuilder(s).reverse().toString())))
        System.out.println(s);
        //Анаграммы
    Multimap<String, String> anagrams = ArrayListMultimap.create();
        for(String s:vocabulary){
char [] arr=s.toCharArray();
Arrays.sort(arr);
String key=new  String(arr);
anagrams.put(key,s);
// add, dad
        }
        String key="", key2="";
        Map.Entry<String, String> entry2 = null;
        for (Map.Entry<String, String> entry: anagrams.entries()){
            key = entry.getKey();
            if (key.equals(key2))
                System.out.println(entry2.getValue()+" "+entry.getValue());
            key2=key;
            entry2 = entry;
        }
        for (String s:vocabulary){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            count =1;
            char c =' ';
            for(int i=0;i<arr.length;i++){
                char c2 =arr[i];
                if(c==c2)count++;
                else count=1;
                if(count==3){
                    System.out.println(s);
                    break;
                }
            }
        }

        for (String s:vocabulary){
            char[] arr = s.toCharArray();
            //Arrays.sort(arr);
            count =1;
            char c =' ';
            for(int i=0;i<arr.length;i++){
                char c2 =arr[i];
                if(c2-c==1)count++;
                else count=1;
                if(count==3){
                    System.out.println(s);
                    break;
                }
            }
        }
    }
    
    public  static int sum(int a,int b){
        return a+b;
    }
    public static double sum(int a,int b,int c){
        return a+b+c;

    }
}
