public class Main {
    public static void main(String[] args) {
    String a = "x3z ? xYz ! R1 && __";
    String b = a.replaceAll("[a-z]|[0-9]", "*");

        System.out.println(b);
    }
}