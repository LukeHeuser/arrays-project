package heuser.luke;

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


        int[] newArray;
        // The anonymous array initializer can not be used in a statement outside
        // a declaration statement
        // newArray = {5,4,3,2,1};

        // This is the longer version that compiles
        newArray = new int[] {5, 4, 3, 2, 1};

        System.out.println("The array list of newArray is:");
        for(int i = 0; i <= (newArray.length-1); i++) {
            System.out.print(newArray[i] + " ");
        }

    }

}
