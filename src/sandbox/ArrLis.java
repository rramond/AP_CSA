package sandbox;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

    public class ArrLis {
         static void main() {
            // --- DECLARATION & INITIALIZATION ---
            int[] numbers = {5, 3, 8, 1, 9, 2};
            int[] empty = new int[5];        // creates [0, 0, 0, 0, 0]


            // --- ACCESS & MODIFY ---
            System.out.println(numbers[0]);  // 5 (first element)
            System.out.println(numbers[numbers.length - 1]); // 2 (last element)
            numbers[0] = 99;                 // modify an element


            // --- TRAVERSE with for loop (when you need index) ---
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Index " + i + ": " + numbers[i]);
            }

            // --- TRAVERSE with enhanced for (when you don't need index) ---
            for (int num : numbers) {
                System.out.println(num);
            }

            // --- SORT ---
            Arrays.sort(numbers);            // sorts ascending
            System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 8, 9, 99]

            // --- SEARCH (only works after sorting!) ---
            int index = Arrays.binarySearch(numbers, 8);
            System.out.println("Found 8 at index: " + index);

            // --- COPY ---
            int[] copy = Arrays.copyOf(numbers, numbers.length);
            int[] partial = Arrays.copyOfRange(numbers, 1, 4); // [2, 3, 8]
            System.out.println(Arrays.toString(partial)); // [2, 3, 8];
            //toString() required since sout doesn't know how to print normal arrays nicely (prints memory address)

            // --- 2D ARRAYS (big on the AP exam) ---
            int[][] grid = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            for (int row = 0; row < grid.length; row++) {
                for (int col = 0; col < grid[row].length; col++) {
                    System.out.print(grid[row][col] + " ");
                }
                System.out.println();
            }

            // --- DECLARATION & INITIALIZATION ---
            ArrayList<String> food = new ArrayList<String>();

            // --- ADD ---
            food.add("Pizza");
            food.add("Pasta");
            food.add(0, "Burger");          // inserts at index 0, pushes others right
            System.out.println(food);       // [Burger, Pizza, Pasta]

            // --- ACCESS ---
            System.out.println(food.getFirst());    // Burger
            System.out.println(food.getLast());     // Pasta
            System.out.println(food.get(1));        // Pizza

            // --- MERGE TWO LISTS ---
            Scanner menu = new Scanner(System.in);
            ArrayList<String> drinks = new ArrayList<String>();
            drinks.add("Water");
            drinks.add(menu.nextLine());            // adds user input as a drink

            food.add("Salad");
            food.addAll(drinks);                    // merges drinks into food
            // addAll(int index, Collection<T> items) — can also insert at a position
            // returns true if the list changed, false otherwise

            // --- REMOVE ---
            food.remove(2);                         // removes element at index 2
            // food.removeFirst();
            // food.removeLast();

            // --- USEFUL INFO ---
            int menuSize = food.size();             // number of elements
            boolean hasWater = food.contains("Water");  // true/false
            boolean isEmpty = food.isEmpty();          // true/false

            // --- MODIFY ---
            food.set(1, "Gourlami");        // replaces element at index 1
            drinks.clear();                 // wipes the entire list
            System.out.println(food);

            // --- SEARCH & EXTRACT ---
            System.out.println(food.indexOf("Salad"));      // position of element
            System.out.println(food.subList(1, 3));         // extracts index 1 up to (not including) 3
            food.toArray();                                 // converts ArrayList → normal array

            // --- FOREACH ---
            // ⚠️ you CANNOT modify the list inside forEach — use removeIf() instead

            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Cherry");

            fruits.forEach(fruit -> System.out.println(fruit));

            // --- FOREACH with operation ---
            ArrayList<Integer> numbers2 = new ArrayList<>();
            numbers2.add(1);
            numbers2.add(2);
            numbers2.add(3);

            numbers2.forEach(n -> System.out.println(n + " squared = " + (n * n)));

            }
        }
