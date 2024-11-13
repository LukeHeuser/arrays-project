package heuser.luke;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        // the 6th position has been assigned to 50
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        // the 3rd position has been assigned to 3.5
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);

        int[] arrayInitializer = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("First = %d%n", arrayInitializer[0]);
        int arrayLength = arrayInitializer.length;
        System.out.printf("The length is: %d%n", arrayLength);
        System.out.printf("Last = %d%n", arrayInitializer[arrayLength - 1]);

        for( int element : arrayInitializer){
            System.out.print(element + " ");
        }


        int[] newArray;
        // The anonymous array initializer can not be used in a statement outside
        // a declaration statement
        // newArray = {5,4,3,2,1};

        // This is the longer version that compiles

        //newArray = new int[] {5, 4, 3, 2, 1};
        newArray = new int[5];
        System.out.println("The array list of newArray is:");
        for(int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        System.out.println("The array list of newArray is:");
        for(int i = 0; i < (newArray.length); i++) {
            System.out.print(newArray[i] + " ");
        }

        // this is the Enhanced For Loop. The first part, the element is the declaration statement.
        //  The second part, is the array or some other collection variable.
        System.out.println();
        for(int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(newArray));

        String arrayList = Arrays.toString(newArray);
        System.out.println(arrayList.length());


        // This code: we are assigning an integer Array referenced to an object reference.
         Object objectVariable = newArray;
         if (objectVariable instanceof int[]) {
             System.out.println("objectVariable is really an int array");
         }


         Object[] objectArray = new Object[3];
         objectArray[0] = "Hello";
         objectArray[1] = new StringBuilder("World");
         // This is a nested array
         objectArray[2] = newArray;



    }

}
