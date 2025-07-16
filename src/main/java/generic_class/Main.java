package generic_class;


public class Main{
    public static void main(String[] args) {
    Pair1<String, Integer> pair = new Pair1<>("John", 25);
    String name = pair.first;
    Integer age = pair.second;
    System.out.println(name + " is " + age + " years old.");
    }

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}

//class Optional<T> {
//    // ❌ Помилка: не можна створювати об’єкт типу T
//    T value = new T(); // Це не скомпілюється!
//}


