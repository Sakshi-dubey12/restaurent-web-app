public class Main {
    public static void main(String[] args) {
        String name = "Sakshi Dubey";
        int len = 0;

        for (char a:name.toCharArray()) {
            len++;
        }

        System.out.println("The length of the name is: " + len);
    }
}


