/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mosaic.decoration.ii;

import java.util.Scanner;

/**
 *
 * @author Ajini Sahejana
 */
public class MosaicDecorationII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int width = 0, height = 0, a = 0, b = 0, m = 0, c = 0;
        int fullW = 0, fullH = 0, cut = 0;
        int cost =0;
        
        Scanner in = new Scanner(System.in);
            int w = in.nextInt();
            if (w<= 1000000 && w>= 1){
                width =w;
            }
            int h = in.nextInt();
            if (h<= 1000000 && h>= 1){
                height = h;
            }
            int x = in.nextInt();
            if (x<= w && x>= 1){
                a = x;
            }
            int y = in.nextInt();
            if (y<= h && y>= 1){
                b = y;
            }
            int mm = in.nextInt();
            if (mm<= 100000 && mm>= 1){
                m = mm;
            }
            int cc = in.nextInt();
            if (cc<= 100000 && cc>= 1){
                c = cc;
            }
            
            while (fullW < width){
                fullW += a;
            }
            System.out.println("fullW is: " + fullW);
            while (fullH < height){
                fullH += b;
            }
            System.out.println("fullH is: " + fullH);
            
            if (fullW > width && fullH > height) {
                cut = width + height;
            }
            else if (fullW > width) {
                cut = (fullW * height) - (width * height);
            }
            else if (fullH > height) {
                cut = (fullH * width) - (height * width);
            }
            System.out.println("cuts: "+cut);
            
            cost = (cut*c) + m;
            System.out.println("Cost: " + cost);
    }
    
}
