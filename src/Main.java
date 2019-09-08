import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[100];

        CreatRandom.creatRandom(array);

        try{
            System.out.println("\n Enter the index of array :");
            int index = scanner.nextInt();

            System.out.println("Value of array at index " + index + " = " + array[index]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("The value you entered is invalid");
        }
    }
}
