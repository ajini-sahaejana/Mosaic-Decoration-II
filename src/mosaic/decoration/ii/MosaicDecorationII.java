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
            
            System.out.println(w);
            System.out.println(h);
            System.out.println(a);
            System.out.println(b);
            System.out.println(m);
            System.out.println(c);
    }
    
}
