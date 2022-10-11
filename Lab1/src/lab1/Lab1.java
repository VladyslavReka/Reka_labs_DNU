package lab1;
/**
 *
 * @author vreka
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Lab1 {
    static int Fill_array_elem = 100000;/* Кількість елементів в списку */
    static int Insert_elem = 1000; /* Кількість елементів в списку */
    static int random_element_limit = 50;
    static String ArrayList = "ArrayList";
    static String LinkedList = "LinkedList";

    static Random random = new Random();

    public static int random(int rand_limit) {
        return random.nextInt(rand_limit);
    }

    public static void TimeFillList(List<Integer> list, int element, String listType){
        long time = System.currentTimeMillis();

        for (int i = 0; i < element; i++){ /* Заповнення масиву */
            list.add(random(random_element_limit));
        }

        System.out.printf("Fill %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void TimeRandomAccess(List<Integer> list, String listType){
        long time = System.currentTimeMillis();

        for (int i = 0; i < Fill_array_elem; i++){ /* Доступ по індексу */
            int temp = list.get(random(Fill_array_elem));
        }

        System.out.printf("Random access %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void TimeSequentialAccess(List<Integer> list, String listType){
        long time = System.currentTimeMillis();

        for (int element : list){  /* Доступ по ітератору */
            int q = element;
        }

        System.out.printf("Sequential access %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void TimeInserts(List<Integer> list, String listType){
        Time_List_Begin(list, listType);
        Time_List_End(list, listType);
        Time_List_Middle(list, listType);
    }

    public static void Time_List_Begin(List<Integer> list, String listType){
        long time = System.currentTimeMillis();

        for (int i = 0; i < Insert_elem; i++){  /* Вставка елементів в початок масиву */
            list.add(i, random(random_element_limit));
        }

        System.out.printf("Insert in the begin %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void Time_List_End(List<Integer> list, String listType){
        long time = System.currentTimeMillis();

        for (int i = Fill_array_elem-1; i <= Insert_elem; i--){ /* Вставка елементів в кінець масиву */
            list.add(i, random(random_element_limit));
        }

        System.out.printf("Insert in the end %s: %s%n", listType, System.currentTimeMillis() - time);
    }

    public static void Time_List_Middle(List<Integer> list, String listType){
        long time = System.currentTimeMillis();

        int listHalfSize = list.size() / 2;
        int listMiddleElement = listHalfSize - Insert_elem/2;

        for (int i = listMiddleElement; i < (listMiddleElement+Insert_elem); i++){ /* Вставка елементів в середину масиву */
            list.add(i, random(random_element_limit));
        }

        System.out.printf("Insert in the middle %s: %s%n", listType, System.currentTimeMillis() - time);
    }
        public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        List<Integer> linkedlist = new LinkedList<>();

        TimeFillList(arraylist, Fill_array_elem, ArrayList);
        TimeFillList(linkedlist, Fill_array_elem, LinkedList);

        TimeRandomAccess(arraylist, ArrayList);
        TimeRandomAccess(linkedlist, LinkedList);

        TimeSequentialAccess(arraylist, ArrayList);
        TimeSequentialAccess(linkedlist, LinkedList);

        TimeInserts(arraylist, ArrayList);
        TimeInserts(linkedlist, LinkedList);
    }
}