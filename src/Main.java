
public class Main {
    public static void main(String[] arg){
        Calculator s1 = new Calculator();
        int r1 = s1.add(5,3);
        double r2 = s1.add(2.5,3.5);
        int r3 = s1.add(1,2,3);
        String r4 = s1.add("Khald","harki");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}