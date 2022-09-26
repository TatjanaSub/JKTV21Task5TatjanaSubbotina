/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21task5tatjanasubbotina;
//import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV21Task5TatjanaSubbotina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] numArray = new int[5][];
        numArray[0] = new int[3];
        numArray[1] = new int[5];
        numArray[2] = new int[7];
        numArray[3] = new int[8];
        numArray[4] = new int[9];
        int kolIt = 0;
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray[i].length; j++){
                numArray[i][j] = random.nextInt(50)+50;
            }
        }
        System.out.println("Ishodnqi massiv:");
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray[i].length; j++){
                System.out.printf("%3d",numArray[i][j]);
            }
            System.out.println("");
        }
        do{
            for(int i = 0; i < numArray.length; i++){
                for(int j = 0; j < numArray[i].length; j++){
                    if(j < numArray[i].length - 1){
                        if(numArray[i][j] > numArray[i][j+1]){
                            numArray[i][j] = numArray[i][j] + numArray[i][j+1];
                            numArray[i][j+1] = numArray[i][j] - numArray[i][j+1];
                            numArray[i][j] = numArray[i][j] - numArray[i][j+1];
                        }
                    }else{
                        if(i<numArray.length-1 && numArray[i][j] > numArray[i+1][0]){
                            numArray[i][j] = numArray[i][j] + numArray[i+1][0];
                            numArray[i+1][0] = numArray[i][j] - numArray[i+1][0];
                            numArray[i][j] = numArray[i][j] - numArray[i+1][0];
                        }
                    }
                }
            }
            kolIt++;  
        } while(kolIt < 31);
        System.out.println("Otsortirovannqi massiv:");
        for(int i = 0; i < numArray.length; i++){
            for(int j = 0; j < numArray[i].length; j++){
                System.out.printf("%3d",numArray[i][j]);
            }
            System.out.println("");
        }
    }
    
}
