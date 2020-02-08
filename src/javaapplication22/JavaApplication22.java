/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication22;

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.lang.Math;
/**
 *
 * @author RANADEEP
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Add obj1=new Add();
        Sub obj2=new Sub();
        Muliply obj3=new Muliply ();
        Division obj4=new Division();
        
        obj1.sum(7,8);
        obj2.sub(5,6);
        obj3.mul(6, 3);
        obj4.div(8, 4);
        
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Add\n2.Sub\n3.Multiply\n4.Division\n");
        int k=sc.nextInt();
        switch(k)
        {
            case 1:System.out.println(obj1.result);
            break;
            case 2: System.out.println(obj2.result);
            break;
            case 3: System.out.println(obj3.result);
            break;
            case 4: System.out.println(obj4.result);
            break;
            default: System.out.println("Invalid Input");
            
        }
            
        
    }
    
}

class Add  
{
     int result;
   public void sum(int a,int b)
   {
       System.out.println("Enter Numbers/n ");
       
       result=a+b;
   }
   
}
class Sub //Single Level Inheritance
{
    int result;
    public void sub(int a,int b)
    {
        result=a-b;
    }
}
class Muliply  //Multi Level Inheritance
{
   int result;
    public void mul(int a,int b)
    {
        result=a*b;
    }
}
class Division//Multi Level Inheritance
{
    int result;
    public void div(int a,int b)
    {
        result=a/b;
    }
}
 
   






    



    
    


