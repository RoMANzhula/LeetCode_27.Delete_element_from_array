import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[] {0, 3, 2, 2, 3, 1, 4, 3, 3}; //создаем одномерный массив и инициализируем его числами
        System.out.println(replaceElementAndReturnCountAnotherNumbers(nums, 3)); //на консоль выводим результат вызывного метода
    }

    public static int replaceElementAndReturnCountAnotherNumbers(int[] nums, int val) { //метод, который переставляет искомые
        //(int val) числа в конец массива и выводит количество чисел, которые не равны int val
        int count = 0; //создаем контейнер для подсчета искомых чисел

        for (int i = 0; i < nums.length; i++) { //проходимся по массиву, в котором выполняем манипуляции
            if (nums[i] != val) { //если элемент массива не равен искомому числу, то будем выполнять подмену элементов массива
                int replacement = nums[count]; //создаем переменную replacement = элементу массива под индексом count (0 индекс - 1 позиция)
                nums[count] = nums[i]; //первой позиции массива присваиваем значение = элементу массива, который не равен int val
                nums[i] = replacement; //элементу массива, который не равен int val, присваиваем значение = первому элементу массива

                count++; //увеличиваем значение переменной-счетчика на 1
            }
        }
        System.out.println(Arrays.toString(nums)); //смотрим какой теперь вид имеет наш массив
        return count; //возвращаем количество элементов не равных int val
    }
}