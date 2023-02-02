//Дано два числа, например 3 и 56, необходимо составить следующие строки:
//3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
public class task_4 {
    public static void main(String[] args) {
        StringBuilder = StringBuilder1 = createSomeString(3, 56);
        System.out.println(StringBuilder1);
    }
private static StringBuilder createSomeString(int a, int b){
    StringBuilder result = new StringBuilder();
    result.append(a).append("+").append(b).append("=").append(a + b).append("\n")
    .append(a).append("-").append(b).append("=").append(a - b).append("\n")
    .append(a).append("*").append(b).append("=").append(a * b).append("\n")
    return result;
}
}