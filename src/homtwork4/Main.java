package homtwork4;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> numbers = new MyList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers.getArrayList());
        System.out.println("Smallest number is: " + numbers.smallest());
        System.out.println("Largest number is: " + numbers.largest());
    }
}
