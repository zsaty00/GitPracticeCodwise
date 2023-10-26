public class Main {
    public static void main(String[] args) {

        String str = "Google company";
        //            0123456789101112
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Given word is: " + str);
        System.out.println("Reversed word is: " + reversed);
    }}