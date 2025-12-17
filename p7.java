class Demo {
    public static void main(String[] args) {
        int num = 5678;
        int last = num % 10;   
        int first = 0;
        while (num > 0) {
            first = num % 10;
            num = num / 10;
        }

        System.out.println("First = " + first + ", Last = " + last);
    }
}
