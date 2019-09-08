import java.util.Random;

public class CreatRandom {
    public static int[] creatRandom(int[] array){
        Random random = new Random();
        System.out.println("List of array element :");
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt();
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
