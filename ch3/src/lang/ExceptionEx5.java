package lang;

// 멀티 catch
public class ExceptionEx5 {
    public static void main(String[] args) {

        try {
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("인자값을 확인하거나 입력값 확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
