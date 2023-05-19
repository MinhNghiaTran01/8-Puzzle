/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author Nghia
 */
public class NewClass {
    public static void main(String[] args) {
        int [][] a = new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = 1;
            }
        }
        int [][] b = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                b[i][j] = a[i][j];
            }
        }
        a[0][0] = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(b[i][j]);
            }
        }
    }
}
