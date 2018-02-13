/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package versioncontroltest;

import java.util.*;

/**
 *
 * @author Kepler
 */
public class VersionControlTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Please enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        Scanner answer = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Do you want to add them or subtract " + b + " from " + a + "?(add/subtract)");
        String response = answer.nextLine();
        switch(response){
        case "add":
            System.out.print("Adding " + a + " and " + b + " yields " + add(a,b) +".\n");
            break;
        case "subtract":
            System.out.print("Subtracting " + b + " from " + a + " yields " + add(a,b) +".\n");
            break;         
        }
    }
    
    public static int add(int a, int b){
        return a + b;
    }
    
    public static int sub(int a, int b){
        return a - b;
    }
  
}
