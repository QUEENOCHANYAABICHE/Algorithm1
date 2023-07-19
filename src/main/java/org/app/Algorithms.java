package org.app;




    //TEN GREEN BOTTLES
    public class Algorithms{
        public static void main(String[] args){
            int bottle = 10;
            String word = "bottles";
            while(bottle > 0){
                if(bottle  == 1){
                    word = "bottle";
                }
                System.out.println(bottle + " green " + word + ", hanging on the wall");
                System.out.println(bottle + " green " + word + ", hanging on the wall");
                System.out.println("And if one green bottle should accidentally fall,");

                bottle = bottle -1;

                if(bottle > 0){
                    System.out.println("There'll be " +  bottle + " green " +  word + ", hanging on the wall");
                }else {
                    System.out.println("There'll be no green bottles , hanging on the wall");
                }
            }
        }
    }




