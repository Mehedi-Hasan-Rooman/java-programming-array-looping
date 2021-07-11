import java.util.Scanner;

public class Array_List {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int rows;
        int columns;
        int check1,check2;

        System.out.println("Enter number of rows: ");

        rows = scanner.nextInt();

        System.out.println ("Now enter the number of columns: ");

        columns = scanner.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the number to start the array: ");

        int value = scanner.nextInt();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                array[i][j]=value++;
                System.out.print(array[i][j] + "   " );
            }
            System.out.println();
        }

        System.out.println("Please give one integer value to be checked in the array: ");
        check1 = scanner.nextInt();

        System.out.println ("Please give a second integer value to be checked in the array: ");

        check2 = scanner.nextInt();

        for ( int i = 0; i < rows; ++i )
        {
            for ( int j = 0; j < columns; ++j )
            {
                if ( array[i][j] == check1 )
                {
                    System.out.print(array[i][j] + " is located at address array[" + i + "," + j + "]");
                }
                if ( array[i][j] == check2 )
                {
                    System.out.print("\n" + array[i][j] + " is located at address array[" + i + "," + j + "]");
                    System.out.println();
                }
            }
        }
    }
}
