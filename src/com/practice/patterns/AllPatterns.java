package com.practice.patterns;

public class AllPatterns {

    public static void main(String[] args) {

        // 1. Rectangle of stars
        System.out.println("1.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Rectangle of numbers
        System.out.println("\n2.");
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);          
            }
            System.out.println();  }  


        // 3. 5 spaces then 5 stars
        System.out.println("\n3.");
        for (int i = 0; i < 5; i++) {
            System.out.print("     ");
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();  
        }

        // 4. Increasing triangle
        System.out.println("\n4.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. Decreasing triangle
        System.out.println("\n5.");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 6. Increasing + Decreasing triangle
        System.out.println("\n6.");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // 7. Right-aligned increasing triangle
        System.out.println("\n7.");
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s <= i; s++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }

        // 8. Right-aligned rectangle
        System.out.println("\n8.");
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 0; j < 5; j++) System.out.print("*");
            System.out.println();
        }

        // 9. Pyramid
        System.out.println("\n9.");
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=5-i+1 ; j++){
                System.out.print(" ");}
                
                for(int k=1 ; k<=(2*i-1); k++ ){
                System.out.print("*");
            }
             System.out.println();
        }

        // 10. Inverted Pyramid
        System.out.println("\n10.");
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" ");}

                for(int k=1 ; k<=2*(5-i)+1; k++ ){
                System.out.print("#");
            }
             System.out.println();
        }

        // 11. Full diamond
        System.out.println("\n11.");
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 5; i >= 1; i--) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        // 12. Hollow rectangle
        System.out.println("\n12.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 4) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        // 13. Hollow pyramid
        System.out.println("\n13.");
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=5-i+1 ; j++){
                System.out.print(" ");
            }

               for(int k=1 ; k<=2*i-1 ; k++){
                if(k==1 || k==2*i-1 || i==5){
                    System.out.print("*");
                }
                else{ System.out.print(" "); }
               }
                System.out.println(); 
            }

        // 14. Hollow diamond
        System.out.println("\n14.");
        for (int i = 1; i <= 5; i++) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == 5) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int s = 5 - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        // 15. Growing stars
        System.out.println("\n15.");
        for(int i = 1; i <= 4; i+=1){
            for(int j = 0; j < (i*i)/2 + i/2; j+=1){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
