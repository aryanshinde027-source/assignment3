
class Demo {
    public static void main(String[] args) {
        int max = 0;
        int num = 4839;
        int rem;

        while (num > 0) {
            rem = num % 10;          
            if (rem > max) {         
                max = rem;
            }
            num = num / 10;          
        }

        System.out.println("Largest digit: " + max);
    }
}
