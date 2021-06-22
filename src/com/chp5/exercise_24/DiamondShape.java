package com.chp5.exercise_24;

public class DiamondShape {

    DiamondShape(){
        super();
    }

    public static class Foo implements Cloneable {
    }

    public static class Bar extends Foo {
        int x;

        public Bar(int x) {
            this.x = x;
        }

        @Override
        protected Foo clone() throws CloneNotSupportedException {
            return (Foo) super.clone();
        }

        public void cloneDetails(Foo s) throws CloneNotSupportedException {
            Object clone = this.clone();
            System.out.println(clone == s);
            System.out.println(clone.getClass() == s.getClass());
            System.out.println(clone.equals(s));
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Foo f = new Bar(1);
        Bar b = new Bar(1);
        Bar b1 = new  Bar(1);

        b.cloneDetails(f);
        b.cloneDetails(b1);
    }


//    public void printDiamondShape(){
//
//        int spaces = 9,  star = 1,  lines = 9;
//        int div = lines/2+1;
//        for(int i = 1; i <= lines; i++){
//            for(int s = spaces; s > 0; s--){
//                System.out.print(" ");
//            }
//            for(int a = star; a > 0; a--){
//                System.out.print("* ");
//            }
//            System.out.println();
//           if(i < div){
//               spaces -= 2; star += 2;
//           }
//           else if(i >= div){
//                spaces += 2; star -= 2;
//            }
//
//        }
//
//    }

}

