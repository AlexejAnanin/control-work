// Задача: Написать программу, которая из имеющегося массива строк формирует новый массив из строк, 
// длина которых меньше, либо равна 3 символам. Первоначальный массив можно ввести с клавиатуры, 
// либо задать на старте выполнения алгоритма. При решении не рекомендуется пользоваться коллекциями, 
// лучше обойтись исключительно массивами.

// Примеры:
// [“Hello”, “2”, “world”, “:-)”] → [“2”, “:-)”]
// [“1234”, “1567”, “-2”, “computer science”] → [“-2”]
// [“Russia”, “Denmark”, “Kazan”] → []

 
import java.util.Scanner;

public class GetStringsMassive {
    public static void main(String[] args) {

    String[] arr = fillUserArray();
    int size = deterTheSizeOfTheNewArray(arr);
    String[] sortArr = createArrOfThreeChar(arr, size);
    printArray(sortArr, size);
        
    }
    public static String[] fillUserArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int length = scanner.nextInt();
        String[] array = new String[length];
        if(length > 0){
            System.out.print("Введите первый элемент массива: ");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.next();
                if(i != length - 1) {
                    System.out.print("Запишите следующую строку: ");
                }
            }
        }
        scanner.close();
        return array;
    }

    public static int deterTheSizeOfTheNewArray(String[] arg){
        int k = 0;
        for (int i = 0; i < arg.length; i++) {
            if(arg[i].length() < 4) {
            k++;
            }
        }
        return k;
    }

    public static String[] createArrOfThreeChar(String[] arg, int k){
        String[] result = new String[k];
        int i = 0;
        for (int j = 0; j < arg.length; j++) {
            if(arg[j].length() < 4){
                result[i] = arg[j];
                i++;
            }
        }
        return result;
    }
            
    /**
     * @param sortArr
     */
    public static void printArray(String[] sortArr, int k){
        System.out.print("Новый массив: [");
       
         for (int i = 0; i < k; i++) {
            System.out.print('"' + sortArr[i] + '"');
            if(i!= k - 1) {
                System.out.print(", ");
            }
         }
        System.out.print("]");
    }
}


