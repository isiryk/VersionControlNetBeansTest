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
    public void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter 2 numbers");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.print("Adding " + a + " and " + b + "yields" + add(a,b));
        System.out.print("Subtracting " + b + " from " + a + "yields" + add(a,b));
    }
    
    public int add(int a, int b){
        return a + b;
    }
    
    public int sub(int a, int b){
        return a - b;
    }
  
}
