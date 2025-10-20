package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 1. NullPointerException
        String str = null;
        Value v = null;
        // int i = null;
        System.out.println(str);
        // if (str != null) {
        // System.out.println(str.length()); // NullPointerException
        // }

        // 2. ArrayIndexOutOfBoundsException
        // java ExceptionEx3 100 엔터
        if (args.length == 1) {
            String data1 = args[0];
            System.out.println(data1);
        }

        // 3. NumberFormatException

        try {
            // exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (NumberFormatException e) {
            // exception 발생하면 해야 하는 작업
            // e.printStackTrace(); // 추적
            // System.out.println(e.getMessage()); // For input string: "a100"
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        }

        // 4. ClassCastException
        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);

    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }
    }
}
