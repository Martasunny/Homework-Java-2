//Замените символ “=” на слово “равно”. Используйте методы 
//StringBuilder.insert(),StringBuilder.deleteCharAt()

public class task_5 {
    public static void main(String[] args) {
        StringBuilder = stringBuilder1 = createSomeString(3, 56);
        System.out.println(stringBuilder1);
        modifySomeStrin(stringBuilder1);
        System.out.println(stringBuilder1);
    }
private static StringBuilder createSomeString(int a, int b){
    StringBuilder result = new StringBuilder();
    result.append(a).append("+").append(b).append("=").append(a + b).append("\n")
    .append(a).append("-").append(b).append("=").append(a - b).append("\n")
    .append(a).append("*").append(b).append("=").append(a * b).append("\n")
    return result;
}
private static StringBuilder modifySomeString(StringBuilder stringBuilder) {
    int pos = stringBuilder.indexOf("=");
    while ((pos = stringBuilder.indexOf("=")) !=  -1)
    {
        stringBuilder.deleteCharAt(pos);
        stringBuilder.insert(pos, "равно");
    }
    return stringBuilder;
}

}
