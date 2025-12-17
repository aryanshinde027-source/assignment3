class Demo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        boolean is_found = false;

        int search = 30; 

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                is_found = true;
                break;
            }
        }

        if (is_found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}