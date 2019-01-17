class HelloWorld {
    
    public static void main(String[] args) {
        UserProfile user = new UserProfile("Luis Arce");
        System.out.println(user);

        int test[] = new int[] {1, 3, 5, 1, 2};
        printArray(test);
        System.out.println("Steps to short it with BubbleSort: " + bubbleSort(test));
        printArray(test);

    }

    public static int bubbleSort(int arr[]) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n -i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    res++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return res;
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i) System.out.print(arr[i] + " ");
        System.out.println();
    }
}