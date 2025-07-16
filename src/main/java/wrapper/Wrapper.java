package wrapper;

public class Wrapper {
    public static void main(String[] args) {
        //Manual boxing
        int number = 10;
        Integer i = Integer.valueOf(number);

        //Manual unboxing
        i = new Integer(10);
        number = i.intValue();

        //Autoboxing Помилки менш йомвірні при автоматичному пакуванні
        number = 10;
        i = number;

        // Autounboxing
        i = new Integer(10);
        number = i;

//        Creates error
//        i = null;
//        int j = i + 5;
//        System.out.println(j);

    }
}
